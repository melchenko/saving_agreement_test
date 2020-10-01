package com.serenity.steps.definition;

import com.serenity.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.apache.log4j.Logger;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;
    private static final Logger log = Logger.getLogger(DefinitionSteps.class);

    @Given("the user is on the EXPERIOR FINANCIAL GROUP Inc Home Page")
    public void givenTheUserIsOnTheExperiorHomePage() {
        endUser.is_the_home_page();
        log.info("the user is on the EXPERIOR FINANCIAL GROUP Inc Home Page");
    }

    @Given("the user is on the login Page")
    public void givenTheUserIsOnTheExperiorLoginPage() {
        endUser.is_the_login_page();
        log.info("the user is on the EXPERIOR login Page");
    }

    @Given("the user is on the Agreement Insurance Page")
    @When("the user is on the Agreement Insurance Page")
    public void givenTheUserIsOnTheAgreementInsurancePage() {
        endUser.is_the_agreement_insurance_page();
        log.info("the user is on the the user is on the Agreement Insurance Page");
    }

    @When("the user click on '$fieldName' and input '$text'")
    public void whenTheUserClickOnFieldAndInputText(String fieldName, String text) {
        endUser.clickOnAndInput(fieldName, text);
        log.info(String.format("the user click on %1$s and input %2$s", fieldName, text));
    }

    @When("the user click on '$fieldName' and choose '$text'")
    public void whenTheUserClickOnDropdownAndChoseText(String fieldName, String text) {
        endUser.clickOnAndChoose(fieldName, text);
        log.info(String.format("the user click on %1$s and choose %2$s", fieldName, text));
    }

    @When("the user toggle On checkbox '$checkboxName'")
    public void whenTheUserToggleOnCheckbox(String checkboxName) {
        endUser.toggleOnCheckbox(checkboxName);
        log.info(String.format("the user toggle on checkbox %s", checkboxName));
    }

    @When("the user choose '$choice' for '$radioName'")
    public void whenTheUserChooseRadioButton(String choice, String radioName) {
        endUser.chooseRadioButton(choice, radioName);
        log.info(String.format("the user choose %1$s for %2$s", choice, radioName));
    }

    @When("the user upload '$namePath' to '$nameForm' form")
    public void whenTheUserUploadFile(String namePath, String nameForm) {
        endUser.uploadFileToForm(namePath, nameForm);
        log.info(String.format("the user upload file from %1$s to %2$s", namePath, nameForm));
    }

    @When("the user click on the '$buttonName' button")
    public void whenTheUserClickOnButton(String buttonName) {
        endUser.clickOnButton(buttonName);
        log.info(String.format("the user click on %s button", buttonName));
    }

    @Then("they should see '$someText'")
    public void theyShouldSeeSomeText(String someText) {
        endUser.shouldSeeSomeText(someText);
        log.info(String.format("they see %s", someText));
    }

}
