package com.serenity.pages.components;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class Header extends PageObject {

    private static final String MENU_ITEM_XPATH = "//ul[@class='menu']/li/a[contains(text(), '%s')]";

    public void clickOnMenuItem(String itemMenu) {
        getDriver().findElement(By.xpath(String.format(MENU_ITEM_XPATH, itemMenu)))
                .click();
    }
}
