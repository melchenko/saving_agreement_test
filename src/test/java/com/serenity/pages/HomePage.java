package com.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://dev.advisor.efgroup.ca/")
public class HomePage extends AbstractPage {
    public static final String IDENTIFIER = "Home Page";

    @FindBy(xpath = "//*[@title='Ankkis']")
    private WebElementFacade mainImage;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElementFacade afterLoginText;

    public String getTextAfterLogin() {
        return afterLoginText.getText();
    }

}