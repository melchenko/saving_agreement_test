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
    public void clickOnAndInput(String fieldName, String text) {
        homePage.clickOnAndInput(fieldName, text);
    }

    @Step
    public void clickOnAndChoose(String dropdownName, String text) {
        homePage.clickOnAndChoose(dropdownName, text);
    }

    @Step
    public void toggleOnCheckbox(String checkboxName) {
        homePage.toggleOnCheckbox(checkboxName);
    }

    @Step
    public void chooseRadioButton(String choice, String radioName) {
        homePage.chooseRadioButton(choice, radioName);
    }

    @Step
    public void uploadFileToForm(String namePath, String nameForm)  {
        homePage.uploadFileToForm(namePath, nameForm);
    }

    @Step
    public void clickOnButton(String buttonName) {
        homePage.clickButton(buttonName);
    }

    @Step
    public void shouldSeeSomeText(String someText) {
        Assertions.assertThat(nbtInsuranceAgreementPage.getTextAfterAddAgreement())
                .as("Expected Text must be:" + someText)
                .contains(someText);
    }
}