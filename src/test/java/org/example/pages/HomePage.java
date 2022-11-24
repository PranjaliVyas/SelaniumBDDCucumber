package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {
    //locator sould define in variable
    //action should be define in method
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement textOnHomePage;

    @FindBy(css = ".ico-login")
    WebElement loginButtonOnHomePage;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registrationPage;

    public String getTextFromHomePage() {
        return textOnHomePage.getText();
    }

    public void clickOnLoginButtonHomePage() {
        loginButtonOnHomePage.click();
    }

    public void clickOnRegisterButton() {
        registrationPage.click();
    }
}

