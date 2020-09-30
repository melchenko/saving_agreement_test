package com.serenity.pages;

import com.serenity.pages.components.Footer;
import com.serenity.pages.components.Header;
import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

@Getter
public abstract class AbstractPage extends PageObject{

    protected Header header;
    protected Footer footer;
    private static final String FIELD_NAME_XPATH = "//div//*[@id='%s']";
    private static final String BUTTON_XPATH = "//button[contains(@class, 'btn') and contains(@name, '%s')]";
    private static final String DROPDOWN_MENU_XPATH = "//span[contains(text(), '%s')]";
    private static final String DROPDOWN_INPUT_XPATH = "//span/input[@class='select2-search__field']";
    private static final String DROPDOWN_CHOOSE_XPATH = "//*[contains(@class, 'highlighted')]";


    private static final String MENU_ITEM_XPATH = "//ul[@class='menu']/li/a[contains(text(), '%s')]";
    private static final String LINK_XPATH = "//a[@href='%s']";
    private static final String ELEMENT_XPATH = "//a[text()='%s']";
    private static final String TITLE_XPATH = "//div[@id='box-customer-service']/*[contains(text(),'%s')]/following-sibling::*[1]";

    @FindBy(xpath = "//div//*[@class='title']")
    private List<WebElementFacade> titles;

    @FindBy(xpath = "//*[@id='box-customer-service']/p/preceding-sibling::*[1]")
    private List<WebElementFacade> titlesParagraph;



    public void clickOnAndInput(String fieldName, String text) {
        getDriver().findElement(By.xpath(String.format(FIELD_NAME_XPATH, fieldName)))
                .sendKeys(text);
    }

    public void clickOnAndChoose(String selectName, String text) {
        getDriver().findElement(By.xpath(String.format(DROPDOWN_MENU_XPATH, selectName))).click();
        getDriver().findElement(By.xpath(DROPDOWN_INPUT_XPATH)).sendKeys(text);
        getDriver().findElement(By.xpath(DROPDOWN_CHOOSE_XPATH)).click();
//        selectFromDropdown(getDriver().findElement(By.xpath(String.format(DROPDOWN_XPATH, selectName))), text);
    }

    public void clickButton(String buttonName) {
        getDriver().findElement(
                By.xpath(String.format(BUTTON_XPATH, buttonName)))
                .click();
    }


    public void clickOnMenuItem(String itemMenu) {
        getDriver().findElement(By.xpath(String.format(LINK_XPATH, itemMenu)))
                .click();
    }

    public void clickElement(String elementName) {
        getDriver().findElement(By.xpath(String.format(ELEMENT_XPATH, elementName)))
                .click();
    }

    public String getTextForTitle(String title) {
        return getDriver().findElement(By.xpath(String.format(TITLE_XPATH, title)))
                .getText();
    }
}
