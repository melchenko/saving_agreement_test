package com.serenity;

import net.serenitybdd.jbehave.annotations.Metafilter;

@Metafilter("+current")
/**
 * To run tests by Firefox browser run the following command
 * mvn clean verify -DwebDriver=firefox
 */

public class RunASingleScenario extends AcceptanceTestSuite {
    
}
