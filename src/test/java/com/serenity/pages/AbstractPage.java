package com.serenity.pages;


import lombok.Getter;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

@Getter
public abstract class AbstractPage extends PageObject {

    private static final String FIELD_NAME_XPATH = "//label[contains(text(), '%s')]/../..//input[contains(@type, 'text')]";
    private static final String FIELD_NAME_PASSWORD_XPATH = "//label[contains(text(), '%s')]/../..//input[contains(@type, 'password')]";
    private static final String MENU_NAME_XPATH = "//a[contains(text(), '%s')]";

    private static final String BUTTON_XPATH = "//button[contains(@class, 'btn') and contains(text(), '%s')]";
    private static final String DROPDOWN_XPATH = "//span[contains(text(), '%s')]";
    private static final String DROPDOWN_INPUT_XPATH = "//span/input[@class='select2-search__field']";
    private static final String DROPDOWN_CHOOSE_XPATH = "//*[contains(@class, 'highlighted')]";
    private static final String DROPDOWN_MENU_XPATH = "//label[contains(text(), '%s') and contains(@class, 'control-label')]/../..//span[contains(@role, 'textbox')]";
    private static final String CHECKBOX_XPATH = "//label[contains(.,'%s')]/input";
    private static final String CHOICE_RADIO_XPATH = "//*[contains(text(), '%2$s')]//following::label[contains(.,'%1$s')]/input";
    private static final String SELECT_FILE_FORM_XPATH = "//label[contains(text(), '%s')]/../..//input[contains(@type, 'file')]";

    public void clicksAndInputs(String fieldName, String text) {
        if (fieldName.equals("Password")){
        getDriver().findElement(By.xpath(String.format(FIELD_NAME_PASSWORD_XPATH, fieldName)))
                .sendKeys(text);}
        else getDriver().findElement(By.xpath(String.format(FIELD_NAME_XPATH, fieldName)))
                .sendKeys(text);
    }

    public void goToMenu(String menuName) {
        Actions action = new Actions(getDriver());
        action.moveToElement(getDriver().findElement(By.xpath(String.format(MENU_NAME_XPATH, "NBT")))).click().perform();
        getDriver().findElement(By.xpath(String.format(MENU_NAME_XPATH, menuName))).click();
    }

    public void clicksAndChooses(String selectName, String text) {
        getDriver().findElement(By.xpath(String.format(DROPDOWN_XPATH, selectName))).click();
        getDriver().findElement(By.xpath(DROPDOWN_INPUT_XPATH)).sendKeys(text);
        getDriver().findElement(By.xpath(DROPDOWN_CHOOSE_XPATH)).click();
    }

    public void clicksDropdownMenuAndChooses(String selectName, String text) {
        getDriver().findElement(By.xpath(String.format(DROPDOWN_MENU_XPATH, selectName))).click();
        getDriver().findElement(By.xpath(DROPDOWN_INPUT_XPATH)).sendKeys(text);
        getDriver().findElement(By.xpath(DROPDOWN_CHOOSE_XPATH)).click();
    }

    public void togglesCheckbox(String checkboxName) {
        getDriver().findElement(By.xpath(String.format(CHECKBOX_XPATH, checkboxName))).click();
    }

    public void choosesRadioButton(String choice, String radioName) {
        getDriver().findElement(By.xpath(String.format(CHOICE_RADIO_XPATH, choice, radioName))).click();
    }

    public void uploadsFileToForm(String namePath, String nameForm) {
        upload(namePath).to(getDriver().findElement(By.xpath(String.format(SELECT_FILE_FORM_XPATH, nameForm))));
    }

    public void clicksButton(String buttonName) {
        getDriver().findElement(
                By.xpath(String.format(BUTTON_XPATH, buttonName)))
                .click();
    }
}
