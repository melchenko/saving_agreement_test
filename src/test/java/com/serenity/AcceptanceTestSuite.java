package com.serenity;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.webdriver.Configuration;

import static net.thucydides.core.ThucydidesSystemProperty.*;

/**
 * To run tests by Firefox browser run the following command
 * mvn clean verify -DwebDriver=firefox
 */


public class AcceptanceTestSuite extends SerenityStories {
    private Configuration configuration;

    public AcceptanceTestSuite() {
        configuration = super.getSystemConfiguration();
        configuration.setIfUndefined(WEBDRIVER_DRIVER.getPropertyName(), "provided");
        configuration.setIfUndefined(WEBDRIVER_BASE_URL.getPropertyName(), "http://kuopassa.net/litecart/en/");
        configuration.setIfUndefined(WEBDRIVER_PROVIDED_TYPE.getPropertyName(), "mydriver");
        configuration.setIfUndefined("webdriver.provided.mydriver", "drivers.WebDriverFactory");
//        configuration.setIfUndefined(THUCYDIDES_ONLY_SAVE_FAILING_SCREENSHOTS.getPropertyName(), "true");
    }
}
