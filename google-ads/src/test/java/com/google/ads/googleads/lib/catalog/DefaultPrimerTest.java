package com.google.ads.googleads.lib.catalog;

import static org.mockito.Mockito.verify;

import com.google.auth.Credentials;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class DefaultPrimerTest {

  private static final ExecutorService DIRECT_EXECUTOR = MoreExecutors.newDirectExecutorService();
  @Mock private Consumer<String> classloaderStrategy;
  @Mock private Credentials credentials;

  @Test
  public void primeGrpc_loadsClassNamesFromResource_with1entry() {
    new DefaultPrimer(classloaderStrategy, "/primer/1-entry", "not used", DIRECT_EXECUTOR)
        .primeGrpcAsync();
    verify(classloaderStrategy).accept("1");
  }

  @Test
  public void primeGrpc_loadsClassNamesFromResource_with3entries() {
    new DefaultPrimer(classloaderStrategy, "/primer/3-entries", "not used", DIRECT_EXECUTOR)
        .primeGrpcAsync();
    verify(classloaderStrategy).accept("1");
    verify(classloaderStrategy).accept("2");
    verify(classloaderStrategy).accept("3");
  }

  @Test
  public void primeGrpc_loadsClassNamesFromResource_skipsBlankLines() {
    new DefaultPrimer(
            classloaderStrategy, "/primer/2-entries-blankline", "not used", DIRECT_EXECUTOR)
        .primeGrpcAsync();
    verify(classloaderStrategy).accept("1");
    verify(classloaderStrategy).accept("2");
  }

  @Test
  public void primeProtobuf_loadsClassNamesFromResource() {
    new DefaultPrimer(classloaderStrategy, "not used", "/primer/1-entry", DIRECT_EXECUTOR)
        .primeProtobufAsync();
    verify(classloaderStrategy).accept("1");
  }

  @Test
  public void primeCredentials_requestsMetadata() throws IOException {
    new DefaultPrimer(classloaderStrategy, "not used", "not used", DIRECT_EXECUTOR)
        .primeCredentialsAsync(credentials);
    verify(credentials).getRequestMetadata();
  }

  @Test
  public void primeAllVersions_doesntThrow() throws IOException {
    new DefaultPrimer(classloaderStrategy, "not used", "not used", DIRECT_EXECUTOR)
        .primeAllVersionsAsync();
  }
}
