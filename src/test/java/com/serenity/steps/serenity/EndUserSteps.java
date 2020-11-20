package com.serenity.steps.serenity;

import com.serenity.pages.*;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

public class EndUserSteps {
    HomePage homePage;
    LoginPage loginPage;
    NbtInsuranceAgreementPage nbtInsuranceAgreementPage;
    NBTPage nbtPage;
    NbtInvestmentAgreementPage nbtInvestmentAgreementPage;


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
    public void goToMenu(String menuName) {
        homePage.goToMenu(menuName);
    }
    @Step
    public void goToNbtSubMenu(String nbtSubMenuName) {
        nbtPage.goToNBTSubMenu(nbtSubMenuName);
    }

    @Step
    public void is_the_agreement_investment_page() {
        nbtInvestmentAgreementPage.open();
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
    public void clicksDropdownMenuAndChooses(String dropdownName, String text) {
        homePage.clicksDropdownMenuAndChooses(dropdownName, text);
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