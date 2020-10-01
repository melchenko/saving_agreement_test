# Automation test framework

**BDD automation test framework**  - Check the correct saving agreement on Experior Financial Group Portal is covered by automation scripts. 

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
Scenario: CHECK THE CORRECT SAVING AGREEMENT FOR LIFE, CRITICAL AND DISABILITY INSURANCE
Given the user is on the EXPERIOR FINANCIAL GROUP Inc Home Page
When the user click on 'email' and input 'automation@gmail.com'
And the user click on 'password' and input '-fXIGf'
And the user click on the 'Login' button
And the user is on the Agreement Insurance Page
And the user click on 'Please, select advisor' and choose 'Automation'
```

## Test step example

```java
    @When("the user click on '$fieldName' and input '$text'")
    public void whenTheUserClickOnFieldAndInputText(String fieldName, String text) {
        endUser.clickOnAndInput(fieldName, text);
        log.info(String.format("the user click on %1$s and input %2$s", fieldName, text));
    }

```

## Test runner

```java
public class AcceptanceTestSuite extends SerenityStories {
    private Configuration configuration;

    public AcceptanceTestSuite() {
        configuration = super.getSystemConfiguration();
        configuration.setIfUndefined(WEBDRIVER_DRIVER.getPropertyName(), "provided");
        configuration.setIfUndefined(WEBDRIVER_BASE_URL.getPropertyName(), "http://kuopassa.net/litecart/en/");
        configuration.setIfUndefined(WEBDRIVER_PROVIDED_TYPE.getPropertyName(), "mydriver");
        configuration.setIfUndefined("webdriver.provided.mydriver", "drivers.WebDriverFactory");
    }
}
```

## Run options
 * Locally via IDE
 * Possible to select browser (Chrome or FireFox) by cucumber options (ex. -Ddriver="firefox") - Chrome by default
 
```bash
   'mvn clean test' - will run all tests
   'mvn serenity:aggregate' - for generate Serenity test report
```
## Report
 * Report is located in target/cucumber/index.html