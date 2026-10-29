#!/bin/bash
set -euo pipefail

# ==============================================================================
# SECURITY NOTICE: DO NOT ADD 'set -x' TO THIS SCRIPT!
# This script handles PGP signing keys and passphrases from Secret Manager.
# ==============================================================================
set +x

DRY_RUN="${DRY_RUN:-true}"
if [[ "${DRY_RUN}" != "true" && "${DRY_RUN}" != "false" ]]; then
  echo "ERROR: DRY_RUN must be 'true' or 'false' (got '${DRY_RUN}')." >&2
  exit 1
fi

REPO_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "${REPO_DIR}"

echo "=== Building and Releasing from: ${REPO_DIR} (DRY_RUN=${DRY_RUN}) ==="

if [[ ! -d "/usr/lib/jvm/java-17-openjdk-amd64" ]]; then
  echo "ERROR: Kokoro worker missing expected OpenJDK 17 at /usr/lib/jvm/java-17-openjdk-amd64" >&2
  exit 1
fi
export PATH="/usr/lib/jvm/java-17-openjdk-amd64/bin:${PATH}"
unset JAVA_HOME

EXIT_GATE_PROJECT="oss-exit-gate-prod"
EXIT_GATE_LOCATION="us"
EXIT_GATE_REPOSITORY="google-ads-java--mavencentral"

PACKAGES=(
  "google-ads"
  "google-ads-bom"
  "google-ads-codegen"
  "google-ads-shadowjar"
  "google-ads-stubs-lib"
  "google-ads-stubs-v23"
  "google-ads-stubs-v24"
  "google-ads-stubs-v25"
  "google-ads-stubs-v26"
)

for pkg in "${PACKAGES[@]}"; do
  full_pkg="com.google.api-ads:${pkg}"
  if gcloud artifacts packages describe "${full_pkg}" \
      --project="${EXIT_GATE_PROJECT}" \
      --location="${EXIT_GATE_LOCATION}" \
      --repository="${EXIT_GATE_REPOSITORY}" &>/dev/null; then
    echo "=== Deleting existing package '${full_pkg}' from Exit Gate staging repository ==="
    gcloud artifacts packages delete "${full_pkg}" \
      --project="${EXIT_GATE_PROJECT}" \
      --location="${EXIT_GATE_LOCATION}" \
      --repository="${EXIT_GATE_REPOSITORY}" \
      --quiet
  fi
done

if [[ -z "${SIGNING_KEY:-}" ]]; then
  echo "=== Fetching GPG signing key from Secret Manager ==="
  export SIGNING_KEY="$(gcloud secrets versions access latest \
    --secret="bam-devrel-maven-gpg-key" \
    --project="bam-devrel-releases" 2>/dev/null || \
    gcloud secrets versions access latest \
    --secret="google_ads_java_gpg_secring" \
    --project="bam-devrel-releases")"
fi

if [[ -z "${SIGNING_KEY:-}" ]]; then
  echo "ERROR: SIGNING_KEY is not set and could not be fetched from Secret Manager." >&2
  exit 1
fi

if [[ -z "${SIGNING_PASSWORD:-}" ]]; then
  echo "=== Fetching GPG signing password from Secret Manager ==="
  export SIGNING_PASSWORD="$(gcloud secrets versions access latest \
    --secret="bam-devrel-maven-gpg-password" \
    --project="bam-devrel-releases" 2>/dev/null || \
    gcloud secrets versions access latest \
    --secret="google_ads_java_gpg_passphrase" \
    --project="bam-devrel-releases" 2>/dev/null || true)"
fi

INIT_SCRIPT="$(mktemp --suffix=.gradle)"
trap 'rm -f "${INIT_SCRIPT}"' EXIT
cat <<'EOF' > "${INIT_SCRIPT}"
allprojects {
  afterEvaluate { proj ->
    if (proj.plugins.hasPlugin('maven-publish')) {
      proj.publishing.repositories.maven {
        name = 'ExitGateArtifactRegistry'
        url = uri('https://us-maven.pkg.dev/oss-exit-gate-prod/google-ads-java--mavencentral')
        credentials {
          username = 'oauth2accesstoken'
          password = System.getenv('AR_ACCESS_TOKEN')
        }
      }
    }
    if (proj.plugins.hasPlugin('signing')) {
      def key = System.getenv('SIGNING_KEY')
      def pass = System.getenv('SIGNING_PASSWORD') ?: ''
      if (key) {
        proj.signing.useInMemoryPgpKeys(key, pass)
      }
    }
  }
}
EOF

export AR_ACCESS_TOKEN="$(gcloud auth print-access-token)"
./gradlew clean publishAllPublicationsToExitGateArtifactRegistryRepository \
  -Prelease=true \
  --init-script "${INIT_SCRIPT}" \
  --no-daemon
unset AR_ACCESS_TOKEN

if [[ "${DRY_RUN}" == "true" ]]; then
  echo "=== DRY_RUN is enabled. Artifacts staged in Artifact Registry. ==="
  exit 0
fi

cat <<EOF > manifest.json
{
  "publish_all": false,
  "publishing_groups": [
    {
      "namespace": "com.google.api-ads",
      "packages": [
        { "name": "google-ads" },
        { "name": "google-ads-bom" },
        { "name": "google-ads-codegen" },
        { "name": "google-ads-shadowjar" },
        { "name": "google-ads-stubs-lib" },
        { "name": "google-ads-stubs-v23" },
        { "name": "google-ads-stubs-v24" },
        { "name": "google-ads-stubs-v25" },
        { "name": "google-ads-stubs-v26" }
      ]
    }
  ]
}
EOF

EXIT_GATE_BUCKET="gs://oss-exit-gate-prod-projects-bucket/google-ads-java/mavencentral/manifests"
MANIFEST_NAME="manifest-$(date --utc +%Y%m%d%H%M%S'UTC').json"

echo "=== Uploading manifest to ${EXIT_GATE_BUCKET}/${MANIFEST_NAME} ==="
gcloud storage cp manifest.json "${EXIT_GATE_BUCKET}/${MANIFEST_NAME}"
