package com.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://dev.advisor.efgroup.ca/nbt/")
public class NBTPage extends AbstractPage {
    private static final String NBT_SUBMENU_NAME_XPATH = "//a[contains(@class, 'btn') and contains(text(), '%s')]";

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElementFacade afterAddAgreementText;

    public String getTextAfterAddAgreement() {
        return afterAddAgreementText.getText();
    }

    public void goToNBTSubMenu(String nbtSubMenuName) {
        getDriver().findElement(By.xpath(String.format(NBT_SUBMENU_NAME_XPATH, nbtSubMenuName))).click();
    }
}