# Automation test framework

**BDD automation test framework**  - Validation of the agreement saving correctness for Experior Financial Group Portal is covered by automation scripts. 

Table of contents
=================
   * [Key features](#key-features)
   * [Technologies and frameworks](#technologies-and-frameworks)
   * [Test scenario example](#test-scenario-example)
   * [Test step example](#test-step-example)   
   * [Test runner](#test-runner)
   * [Run options](#run-options)
   * [Report](#report)

## Key features
  * BDD (Serenity framework) is used for readability and extensibility of tests

    
## Technologies and frameworks
 * Java programming language ([Java](https://www.java.com)) 
 * Serenity BDD framework ([Serenity](http://www.thucydides.info/))
 * Maven build tool ([Maven](https://maven.apache.org))

## Test scenario example

```java
Scenario: CHECK THE CORRECTNESS OF SAVING THE AGREEMENT FOR LIFE, CRITICAL AND DISABILITY INSURANCE
Given the user is on the Agreement Insurance Page
And the user clicks 'Please, select advisor' and choose 'Automation'
And the user toggles checkbox 'This is an Electronic application'
And the user chooses 'No' for 'Will this policy replace another policy?'
```

## Test step example

```java
    @When("the user clicks the '$buttonName' button")
    public void whenTheUserClicksButton(String buttonName) {
        endUser.clicksButton(buttonName);
        log.info(String.format("the user clicks %s button", buttonName));
    }
```

## Test runner

```java
public class AcceptanceTestSuite extends SerenityStories {
    private Configuration configuration;

    public AcceptanceTestSuite() {
        configuration = super.getSystemConfiguration();
        configuration.setIfUndefined(WEBDRIVER_DRIVER.getPropertyName(), "provided");
        configuration.setIfUndefined(WEBDRIVER_BASE_URL.getPropertyName(), "https://dev.advisor.efgroup.ca");
        configuration.setIfUndefined(WEBDRIVER_PROVIDED_TYPE.getPropertyName(), "mydriver");
        configuration.setIfUndefined("webdriver.provided.mydriver", "drivers.WebDriverFactory");
    }
}
```

## Run options
 * Locally via IDE
 * Possible to select browser (Chrome or FireFox) by cucumber options (ex. -Ddriver="firefox") - Chrome by default
 
```bash
   'mvn clean verify' - will run all tests
   'mvn serenity:aggregate' - for generate Serenity test report
```
## Report
 * Report is located in target/site/serenity/index.html