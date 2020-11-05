package com.google.ads.googleads.lib.catalog;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.ads.googleads.lib.GoogleAdsClient;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PrimerTest {

  private static volatile String originalSysProp;

  @BeforeClass
  public static void beforeClass() {
    // Ensure that the GoogleAdsClient static blocks run before this test suite.
    GoogleAdsClient.class.getMethods();
    // Stores the original value of the system property to revert afterwards.
    originalSysProp = System.getProperty(Primer.ENABLE_PRIMER_SYSTEM_PROPERTY);
  }

  @AfterClass
  public static void afterClass() {
    // Restores the original primer value if set.
    if (originalSysProp != null) {
      System.setProperty(Primer.ENABLE_PRIMER_SYSTEM_PROPERTY, originalSysProp);
    }
  }

  @Test
  public void systemProperty_true_enablesPrimer() {
    System.setProperty(Primer.ENABLE_PRIMER_SYSTEM_PROPERTY, "true");
    assertTrue("Failed to enable primer", Primer.isEnabled());
  }

  @Test
  public void systemProperty_null_disablesPrimer() {
    System.clearProperty(Primer.ENABLE_PRIMER_SYSTEM_PROPERTY);
    assertFalse("Failed to enable primer", Primer.isEnabled());
  }

  @Test
  public void systemProperty_false_disablesPrimer() {
    System.setProperty(Primer.ENABLE_PRIMER_SYSTEM_PROPERTY, "false");
    assertFalse("Failed to enable primer", Primer.isEnabled());
  }

  @Test
  public void systemProperty_randomText_disablesPrimer() {
    System.setProperty(Primer.ENABLE_PRIMER_SYSTEM_PROPERTY, "asdf");
    assertFalse("Failed to enable primer", Primer.isEnabled());
  }

}
