package com.google.ads.googleads.lib.logging.scrub;

import static org.junit.Assert.assertTrue;

import com.google.ads.googleads.lib.catalog.ApiCatalog;
import com.google.ads.googleads.lib.catalog.Version;
import com.google.protobuf.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.Test;

public class SearchResponsePiiScrubberTest {

  /**
   * Ensures that the class name reflection uses the correct class name. Otherwise, the scrubbing
   * would silently start failing if these messages were renamed.
   */
  @Test
  public void supportsAllSearchStreamResponses()
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException,
          IllegalAccessException {
    for (Version v : ApiCatalog.getDefault().getSupportedVersions()) {
      Class<?> msgClass =
          Class.forName(
              "com.google.ads.googleads."
                  + v.getVersionName()
                  + ".services.SearchGoogleAdsStreamResponse");
      Method instanceCreator = msgClass.getMethod("getDefaultInstance");
      Message instance = (Message) instanceCreator.invoke(null);
      assertTrue("no support for " + msgClass, new SearchResponsePiiScrubber().supports(instance));
    }
  }
}
