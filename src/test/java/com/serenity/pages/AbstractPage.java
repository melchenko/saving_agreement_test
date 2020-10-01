package com.serenity.pages;

import lombok.Getter;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@Getter
public abstract class AbstractPage extends PageObject {

    private static final String FIELD_NAME_XPATH = "//div//*[contains(@id, '%s')]";
    private static final String BUTTON_XPATH = "//button[contains(@class, 'btn') and contains(text(), '%s')]";
    private static final String DROPDOWN_MENU_XPATH = "//span[contains(text(), '%s')]";
    private static final String DROPDOWN_INPUT_XPATH = "//span/input[@class='select2-search__field']";
    private static final String DROPDOWN_CHOOSE_XPATH = "//*[contains(@class, 'highlighted')]";
    private static final String CHECKBOX_XPATH = "//label[contains(.,'%s')]/input";
    private static final String CHOICE_RADIO_XPATH = "//*[contains(text(), '%2$s')]//following::label[contains(.,'%1$s')]/input";
    private static final String SELECT_FILE_FORM_XPATH = "//label[contains(text(), '%s')]/../..//input[contains(@type, 'file')]";

    public void clickOnAndInput(String fieldName, String text) {
        getDriver().findElement(By.xpath(String.format(FIELD_NAME_XPATH, fieldName)))
                .sendKeys(text);
    }

    public void clickOnAndChoose(String selectName, String text) {
        getDriver().findElement(By.xpath(String.format(DROPDOWN_MENU_XPATH, selectName))).click();
        getDriver().findElement(By.xpath(DROPDOWN_INPUT_XPATH)).sendKeys(text);
        getDriver().findElement(By.xpath(DROPDOWN_CHOOSE_XPATH)).click();
    }

    public void toggleOnCheckbox(String checkboxName) {
        getDriver().findElement(By.xpath(String.format(CHECKBOX_XPATH, checkboxName))).click();
    }

    public void chooseRadioButton(String choice, String radioName) {
        getDriver().findElement(By.xpath(String.format(CHOICE_RADIO_XPATH, choice, radioName))).click();
    }

    public void uploadFileToForm(String namePath, String nameForm) {
        upload(namePath).to(getDriver().findElement(By.xpath(String.format(SELECT_FILE_FORM_XPATH, nameForm))));
    }

    public void clickButton(String buttonName) {
        getDriver().findElement(
                By.xpath(String.format(BUTTON_XPATH, buttonName)))
                .click();
    }
}
