package com.serenity.steps.serenity;

import com.serenity.pages.HomePage;
import com.serenity.pages.LoginPage;
import com.serenity.pages.NbtInsuranceAgreementPage;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

public class EndUserSteps {
    HomePage homePage;
    LoginPage loginPage;
    NbtInsuranceAgreementPage nbtInsuranceAgreementPage;


    @Step
    public void is_the_home_page() {
        homePage.open();
    }

    @Step
    public void is_the_login_page() {
        loginPage.open();
    }

    @Step
    public void is_the_agreement_insurance_page() {
        nbtInsuranceAgreementPage.open();
    }

    @Step
    public void clicksAndInputs(String fieldName, String text) {
        homePage.clicksAndInputs(fieldName, text);
    }

    @Step
    public void clicksAndChooses(String dropdownName, String text) {
        homePage.clicksAndChooses(dropdownName, text);
    }

    @Step
    public void togglesCheckbox(String checkboxName) {
        homePage.togglesCheckbox(checkboxName);
    }

    @Step
    public void choosesRadioButton(String choice, String radioName) {
        homePage.choosesRadioButton(choice, radioName);
    }

    @Step
    public void uploadsFileToForm(String namePath, String nameForm)  {
        homePage.uploadsFileToForm(namePath, nameForm);
    }

    @Step
    public void clicksButton(String buttonName) {
        homePage.clicksButton(buttonName);
    }

    @Step
    public void shouldSeeSomeText(String someText) {
        Assertions.assertThat(nbtInsuranceAgreementPage.getTextAfterAddAgreement())
                .as("Expected Text must be:" + someText)
                .contains(someText);
    }
}