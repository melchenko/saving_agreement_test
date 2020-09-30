package com.serenity.steps.serenity;

import com.serenity.pages.HomePage;
import com.serenity.pages.LoginPage;
import com.serenity.pages.NbtInsuranceAgreementPage;
import net.thucydides.core.annotations.Step;

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
        loginPage.clickOnAndInput(fieldName, text);
    }

    @Step
    public void clickOnAndChoose(String dropdownName, String text) {
        loginPage.clickOnAndChoose(dropdownName, text);
    }

    @Step
    public void clickOnButton(String buttonName) {
        loginPage.clickButton(buttonName);
    }
//
//    @Step
//    public void shouldSeeSomeText(String someText) {
//        Assertions.assertThat(homePage.getTextAfterLogin())
//                .as("Expected Text must be:" + someText)
//                .contains(someText);
//    }

//    @Step
//    public void clickOnLink(String linkName) {
//        commonPage.clickLink(linkName);
//    }
//
//    @Step
//    public void clickOnElement(String elementName) {
//        commonPage.clickElement(elementName);
//    }
//
//    @Step
//    public void shouldSeeSomeUrl(String someURL) {
//        WebDriver driver = homePage.getDriver();
//        Assertions.assertThat(driver.getCurrentUrl())
//                .as("Expected Text must be:" + someURL)
//                .contains(someURL);
//    }
//
//    @Step
//    public void chooseLanguage(String languageName, String buttonName) {
//        homePage.getHeader().chooseLanguage(languageName);
//        commonPage.getSignIn().clickButton(buttonName);
//    }
//
//    @Step
//    public void shouldSeeTitle(String titleName) {
//        List<String> titleNames = commonPage.
//                getTitles().stream().map(WebElementFacade::getText).
//                collect(Collectors.toList());
//
//        Assertions.assertThat(titleNames)
//                .as("Expected header must be:" + titleName)
//                .contains(titleName);
//    }
//
//    @Step
//    public void shouldSeeTitleParagraph(String pageIdentifier, ExamplesTable table) {
//        for (Map<String, String> row : table.getRows()) {
//            String titleParagraph = row.get("Title paragraph");
//            List<String> titlesOfParagraphs = pageFactory.getPageByIdentifier(pageIdentifier).getTitlesParagraph()
//                    .stream().map(WebElementFacade::getText).
//                            collect(Collectors.toList());
//            Assertions.assertThat(titlesOfParagraphs)
//                    .as("Actual and Expected Header are not the same")
//                    .contains(titleParagraph);
//        }
//    }
//
//    @Step
//    public void paragraphOfTitleShouldContainsText(String title, String text) {
//        String textForTitle = commonPage.getTextForTitle(title);
//        Assertions.assertThat(textForTitle)
//                .as("Actual and Expected Text for Title are not the same")
//                .contains(text);
//    }
//
//    @Step
//    public void shouldBeOnPage(String pageIdentifier) {
//        AbstractPage pageByIdentifier = pageFactory.getPageByIdentifier(pageIdentifier);
//        Assertions.assertThat(pageByIdentifier.verify())
//                .as(String.format("They aren't on %s", pageIdentifier))
//                .isTrue();
//    }
}
