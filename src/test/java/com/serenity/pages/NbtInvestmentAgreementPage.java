package com.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://dev.advisor.efgroup.ca/nbt/segregated")
public class NbtInvestmentAgreementPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElementFacade afterAddAgreementText;

    public String getTextAfterAddAgreement() {
        return afterAddAgreementText.getText();
    }

}