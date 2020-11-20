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

    @Given("the user is on the Agreement Investment Page")
    @When("the user is on the Agreement Investment Page")
    public void givenTheUserIsOnTheAgreementInvestmentPage() {
        endUser.is_the_agreement_investment_page();
        log.info("the user is on the the user is on the Agreement Investment Page");
    }

    @Given("the user go to the '$menuName' menu")
    @When("the user go to the '$menuName' menu")
    public void whenTheUserGoToMenu(String menuName) {
        endUser.goToMenu(menuName);
        log.info(String.format("the user go to the %s menu", menuName));
    }

    @Given("the user go to the NBT '$subMenuName' menu")
    @When("the user go to the NBT '$subMenuName' menu")
    public void whenTheUserGoToNbtSubMenu(String nbtSubMenuName) {
        endUser.goToNbtSubMenu(nbtSubMenuName);
        log.info(String.format("the user go to the NBT %s submenu", nbtSubMenuName));
    }

    @When("the user clicks '$fieldName' and inputs '$text'")
    public void whenTheUserClicksFieldAndInputsText(String fieldName, String text) {
        endUser.clicksAndInputs(fieldName, text);
        log.info(String.format("the user clicks %1$s and inputs %2$s", fieldName, text));
    }

    @When("the user clicks '$fieldName' and chooses '$text'")
    public void whenTheUserClicksAndChoosesText(String fieldName, String text) {
        endUser.clicksAndChooses(fieldName, text);
        log.info(String.format("the user clicks %1$s and chooses %2$s", fieldName, text));
    }

    @When("the user clicks '$fieldName' dropdown menu and chooses '$text'")
    public void whenTheUserClicksDropdownAndChoosesText(String fieldName, String text) {
        endUser.clicksDropdownMenuAndChooses(fieldName, text);
        log.info(String.format("the user clicks %1$s dropdown menu and chooses %2$s", fieldName, text));
    }

    @When("the user toggles checkbox '$checkboxName'")
    public void whenTheUserTogglesCheckbox(String checkboxName) {
        endUser.togglesCheckbox(checkboxName);
        log.info(String.format("the user toggles checkbox %s", checkboxName));
    }

    @When("the user chooses '$choice' for '$radioName'")
    public void whenTheUserChoosesRadioButton(String choice, String radioName) {
        endUser.choosesRadioButton(choice, radioName);
        log.info(String.format("the user chooses %1$s for %2$s", choice, radioName));
    }

    @When("the user uploads '$namePath' to '$nameForm' form")
    public void whenTheUserUploadFile(String namePath, String nameForm) {
        endUser.uploadsFileToForm(namePath, nameForm);
        log.info(String.format("the user uploads file from %1$s to %2$s", namePath, nameForm));
    }

    @When("the user clicks the '$buttonName' button")
    public void whenTheUserClicksButton(String buttonName) {
        endUser.clicksButton(buttonName);
        log.info(String.format("the user clicks %s button", buttonName));
    }

    @Then("they should see '$someText'")
    public void theyShouldSeeSomeText(String someText) {
        endUser.shouldSeeSomeText(someText);
        log.info(String.format("they see %s", someText));
    }

}
