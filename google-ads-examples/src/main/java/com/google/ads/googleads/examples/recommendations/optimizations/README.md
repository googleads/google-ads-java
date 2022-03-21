# Google Ads Account Optimization Examples

This folder contains the code examples that illustrate how to programmatically
retrieve the recommendations and optimization scores from the Google Ads API,
and apply the recommendations to improve the overall performance of the Google
Ads accounts. These examples will:

*   Query the recommendations and optimization scores for the specified Google
    Ads accounts.

*   Generate the ***recommendation reports*** in the CSV format.

*   Parse the ***recommendation reports*** after manual review & revision, and
    apply the parsed recommendations to the specified Google Ads accounts.

*   Generate the ***optimization reports*** in the CSV format with the apply
    results and the latest optimization scores.

Before executing the code examples, make sure that you have a
[file configured properly with your credentials](https://developers.google.com/google-ads/api/docs/client-libs/java/config-file).

## Acquire optimizations

1.  First, navigate into the `google-ads-java` directory.

    ```
    cd google-ads-java
    ```

1.  Retrieve the recommendations and optimization scores by running the
    `AcquireOptimizations` code example. The following arguments should be
    passed in:

    *   **[optional] --customerIds** A comma-separated list of customer IDs to
        retrieve optimizations from. If not provided, it will be set to all the
        sub-accounts under the manager account specified by `loginCustomerId`.

    *   **[optional] --loginCustomerId** The manager account ID which provides
        access to the customer IDs. You may pass a parameter on the command line
        or specify a value in the `ads.properties` configuration file. Provide
        this argument *if and only if* your access to the customer IDs is via a
        manager account.

    *   **[optional] --recommendationTypes** A comma-separated list of
        recommendation types to retrieve. If not provided, it will default to
        `CAMPAIGN_BUDGET,KEYWORD,TEXT_AD,TARGET_CPA_OPT_IN`. Refer to
        [RecommendationType](https://developers.google.com/google-ads/api/reference/rpc/latest/RecommendationTypeEnum.RecommendationType)
        for all the valid values.

    *   **[optional] --reportDirectory** The path of the directory to persist
        the generated reports. If not provided, it will default to
        `$HOME/opti-reports`.

    Here's an example with generic argument values:

    ```
    ./gradlew -q runExample --example="recommendations.optimizations.AcquireOptimizations --recommendationTypes CAMPAIGN_BUDGET,KEYWORD --customerIds 111111,222222 --loginCustomerId 333333 --reportDirectory ./opti-reports"
    ```

1.  Review and revise the reports generated in **--reportDirectory** as
    specified above.

    After executing the command, the ***recommendation reports*** will be
    generated in the CSV format for each customer ID separately in a
    subdirectory under **--reportDirectory**, named as `recommendation_{CID}`.
    The subdirectory will contain two files named as `optiScore.csv` and
    `recommendations.csv`.

    Note: You can manually review and revise `recommendations.csv`, deleting the
    rows of the recommendations which you don't think applicable.

    The subdirectory for the *recommendation reports* is structured as:

    ```
    recommendation_111111
    |-- optiScore.csv
    |-- recommendations.csv
    ```

    The content of the CSV files are as:

    *   **recommendation_111111/optiScore.csv**:

        ```
        CID,AccountName,OptiScore
        111111,My Google Ads account,0.8225589
        ```

    *   **recommendation_111111/recommendations.csv**:

        ```
        ID,Type,Impact,Details,CampaignId,CampaignOptiScore,BaseImpressions,PotentialImpressions,BaseClicks,PotentialClicks,BaseCost,PotentialCost,BaseConversions,PotentialConversions,BaseVideoViews,PotentialVideoViews
        444444,KEYWORD,"Increase Impressions by 13.0, Clicks by 1.0, Cost(in micros) by 452494, Conversions by 0.08, Video views by 0.0.","keyword.text: [java coding examples]
        keyword.match_type: [BROAD]",9999999,0.534451804270263,600.0,613.0,31.0,32.0,5740000,6192494,0.0,0.08,0.0,0.0
        ```

        The `Details` column is the human-readable description of the
        recommendations, displaying all the fields of the recommendation in
        `key: value` pairs. It varies among recommendation types. Below are some
        examples:

        *   **CAMPAIGN_BUDGET**:

            ```
            current_budget_amount_micros: [5000000000]
            recommended_budget_amount_micros: [6900000000]
            budget_options: [impact {
              base_metrics {
                impressions: 2145808.0
                clicks: 31940.0
                cost_micros: 32400911410
                conversions: 1196.05
              }
              potential_metrics {
                impressions: 2145808.0
                clicks: 31940.0
                cost_micros: 32400911410
                conversions: 1196.05
              }
            }
            budget_amount_micros: 5000000000
            , impact {
              base_metrics {
                impressions: 2145808.0
                clicks: 31940.0
                cost_micros: 32400911410
                conversions: 1196.05
              }
              potential_metrics {
                impressions: 2344213.0
                clicks: 34923.0
                cost_micros: 35623359392
                conversions: 1307.76
              }
            }
            budget_amount_micros: 6900000000
            ]
            ```

        *   **SITELINK_EXTENSION**

            ```
            recommended_extensions: [link_text: "About"
            line1: ""
            line2: ""
            final_urls: "http://example.com/about"
            , link_text: "Join Now To View"
            line1: ""
            line2: ""
            final_urls: "http://example.com/join"
            ]
            ```

        *   **KEYWORD**

            ```
            keyword.text: [php tutorial for beginners full]
            keyword.match_type: [BROAD]
            ```

## Apply recommendations

1.  Apply the reviewed recommendations by running the `ApplyRecommendations`
    code example. The following arguments should be passed in:

    *   **[optional] --customerIds** A comma-separated list of customer IDs to
        apply recommendations to. If not provided, all recommendations found in
        **--reportDirectory** will be applied.

    *   **[optional] --loginCustomerId** The manager account ID which provides
        access to the customer IDs. You may pass a parameter on the command line
        or specify a value in the `ads.properties` configuration file. Provide
        this argument *if and only if* your access to the customer IDs is via a
        manager account.

    *   **[optional] --reportDirectory** The path of the directory to persist
        the generated reports. If not provided, it will default to
        `$HOME/opti-reports`.

    Here's an example with generic argument values:

    ```
    ./gradlew -q runExample --example="recommendations.optimizations.ApplyRecommendations --recommendationTypes CAMPAIGN_BUDGET,KEYWORD --customerIds 111111,222222 --loginCustomerId 333333 --reportDirectory ./opti-reports"
    ```

1.  Check out the reports generated in **--reportDirectory** as specified above.

    After executing the command, this code example loads the *recommendation
    reports*, applies the recommendations and generates the ***optimization
    reports*** for each customer ID separately in a subdirectory under
    **--reportDirectory**, named as `optimization_{CID}`. The subdirectory will
    contain two files named as `optiScore.csv` and `recommendations.csv`,
    including the results of the applied recommendations and the latest
    optimization scores.

    The subdirectory for the *optimization reports* is structured as:

    ```
    optimization_111111
    |-- optiScore.csv
    |-- recommendations.csv
    ```

    The content of the CSV files are as:

    *   **optimization_111111/optiScore.csv**:

    ```
    CID,AccountName,OldOptiScore,NewOptiScore
    111111,My Google Ads account,0.8225589,0.8282797
    ```

    *   **optimization_111111/recommendations.csv**:

    ```
    ID,Type,Details,CampaignId,OldOptiScore,NewOptiScore
    444444,CAMPAIGN_BUDGET,Increase budget(in micros) from 5750000000 to 8400000000,9999999,0.0,0.0
    ```
