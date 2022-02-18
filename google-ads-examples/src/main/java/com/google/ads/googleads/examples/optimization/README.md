# Google Ads Client Library for Java - Optimizer examples

This folder contains code examples that illustrate how to programmatically
retrieve and apply Google Ads API Recommendations to improve the overall
performance and efficiency of the customer accounts. The examples will download
suggestions for a group of accounts, save them to a csv file, read the csv file
after manual modification, apply the suggestions and save the recommendation
results to a csv file. Before running the examples, make sure you have an
`ads.properties` file *in your home directory* and
[have filled in the required authentication credentials](https://developers.google.com/google-ads/api/docs/client-libs/java/config-file).
The following code examples are provided.

## Acquire Optimizations

1.  Change into the `google-ads-examples` directory:

    ```
     cd google-ads-examples
    ```

1.  Retrieve suggested optimizations by running the `AcquireOptimizations`
    class, and the following arguments should be passed in:

    *   **[optional] --customerIds** A comma-separated list of customer IDs to
        retrieve optimizations from. If not provided, it will be set to customer
        IDs of all nested accounts of the manager account specified with
        `loginCustomerId`. There can only be commas among values, redundant
        characters, e.g. spaces, will cause the parse to fail.

    *   **[optional] --loginCustomerId** The manager account ID which provides
        access to the customer IDs. You may pass the loginCustomerId on the
        command line or specify a loginCustomerId in `ads.properties` file.
        Provide this argument *if and only if* your access to the customer IDs
        is via a manager account.

    *   **[optional] --recommendationTypes** A comma-separated list of ype of
        recommendationTypes. If not provided, it will be set to
        `"CAMPAIGN_BUDGET,KEYWORD,TEXT_AD,TARGET_CPA_OPT_IN"`. There can only be
        commas among values, redundant characters, e.g. spaces, will cause the
        parse to fail. Refer to
        [RecommendationType](https://developers.google.com/google-ads/api/reference/rpc/v8/RecommendationTypeEnum.RecommendationType)
        for all valid values.

    *   **[optional] --reportDirectory** The path of directory in which to
        generate reports. If not provided, it will be set to the current
        directory.

    Here's an example with generic argument values:

    ```
    mvn compile exec:java -Dexec.mainClass="com.google.ads.googleads.examples.optimizer.AcquireOptimizations"  -Dexec.args="--recommendationTypes CAMPAIGN_BUDGET,KEYWORD --customerIds 111111,222222 --loginCustomerId 333333 --reportDirectory ./"
    ```

1.  Check out and revise the reports generated in **--reportDirectory** as
    specified above.

    After running the command, the acquired recommendation reports will be
    generated in CSV format for each CID separately in `reportDirectory`.
    Reports for each CID will be kept within a folder named as
    `recommendation_{CID}`. The folder will contain two files named as
    `optiScore.csv` and `recommendations.csv`. You can modify
    `recommendations.csv` manually, delete the rows of the recommendations which
    you don't want to apply.

    A sample folder of recommendation CSV reports will be as follows:

    ```
    recommendation_111111
    |-- optiScore.csv
    |-- recommendations.csv
    ```

    A sample content of each file will be as follows:

    *   **recommendation_111111/optiScore.csv**:

    ```
    CID,AccountName,OptiScore
    111111,Overstock - PLA,0.8225589
    ```

    *   **recommendation_111111/recommendations.csv**:

    ```
    ID,Type,Impact,Details,CampaignId,CampaignOptiScore,BaseImpressions,PotentialImpressions,BaseClicks,PotentialClicks,BaseCost,PotentialCost,BaseConversions,PotentialConversions,BaseVideoViews,PotentialVideoViews
    444444,KEYWORD,"Increase Impressions by 13.0, Clicks by 1.0, Cost(in micros) by 452494, Conversions by 0.08, Video views by 0.0.","keyword.text: [java coding examples]
    keyword.match_type: [BROAD]",1747308875,0.534451804270263,600.0,613.0,31.0,32.0,5740000,6192494,0.0,0.08,0.0,0.0
    ```

    The `Details` column is the string-format description of a recommendation.
    It will display all the fields of the recommendation in `key: value` pair
    except those available in other columns. It varies among recommendationType.
    Here are some examples:

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
    recommended_extensions: [link_text: ""About""
    line1: """"
    line2: """"
    final_urls: ""https://about.linkedin.com/?trk=public_profile_v3_mobile_footer-about""
    , link_text: ""Join Now To View""
    line1: """"
    line2: """"
    final_urls: ""https://www.linkedin.com/signup/public-profile-join?vieweeVanityName=pierrick-voulet&trk=public_profile_recommendations""
    ]
    ```

    *   **KEYWORD**

    ```
    keyword.text: [php tutorial for beginners full]
    keyword.match_type: [BROAD]
    ```

## Apply Recommendations

1.  Apply reviewed recommendationsby running the `ApplyRecommendations` class,
    and the following arguments should be passed in:

    *   **[optional] --customerIds** A comma-separated list of customer IDs to
        apply recommendations to. If not provided, all recommendations found in
        `reportDirectory` will be applied. There can only be commas among
        values, redundant characters, e.g. spaces, will cause the parse to fail.

    *   **[optional] --loginCustomerId** The manager account ID which provides
        access to the customer IDs. You may pass the loginCustomerId on the
        command line or specify a loginCustomerId in `ads.properties` file.
        Provide this argument *if and only if* your access to the customer IDs
        is via a manager account.

    *   **[optional] --reportDirectory** The path of directory to read
        recommendations and generate reports. If not provided, it will be set to
        the current directory.

    Here's an example with generic argument values:

    ```
    mvn compile exec:java -Dexec.mainClass="com.google.ads.googleads.examples.optimizer.ApplyRecommendations"  -Dexec.args="--customerIds 111111,222222 --loginCustomerId 333333 --reportDirectory ./"
    ```

1.  Check out the reports generated in **--reportDirectory** as specified above.

    After running the command, the example reads the recommendations from
    reports in `reportDirectory`, applies the recommendations and generates
    optimization reports to the same directory in CSV format for each CID
    separately. Only the folders named as `recommendation_{CID}` will be read,
    the others will be skipped. Reports for each CID will be kept within a
    folder named as `optimization_{CID}`. The folder will contain two files
    named `optiScore.csv` and `recommendations.csv`, from which you can read the
    results of applied recommendations.

    A sample folder of optimization CSV reports is as follows:

    ```
    optimization_111111
    |-- optiScore.csv
    |-- recommendations.csv
    ```

    A sample content of each file will be as follows:

    *   **optimization_111111/optiScore.csv**:

    ```
    CID,AccountName,OldOptiScore,NewOptiScore
    111111,Overstock - PLA,0.8225589,0.8282797
    ```

    *   **optimization_111111/recommendations.csv**:

    ```
    ID,Type,Details,CampaignId,OldOptiScore,NewOptiScore
    444444,CAMPAIGN_BUDGET,Increase budget(in micros) from 5750000000 to 8400000000,0,0.0,0.0
    ```
