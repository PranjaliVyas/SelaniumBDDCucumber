package org.example.pages;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {

    @FindBy(css = ".page-title")
    WebElement welcomeTextOnLoginPage;

    @FindBy(id = "Email")
    WebElement emailInputField;

    @FindBy(id = "Password")
    WebElement passwordInputField;

    @FindBy(css = ".login-button")
    WebElement loginbuttonOnLoginPage;

    @FindBy(css = ".ico-logout")
    WebElement logoutButton;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement errorText;


    public String getWelcomeTextFromLoginPage() {
        return welcomeTextOnLoginPage.getText();
    }

    public void enterEmail(String email) {
        emailInputField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInputField.sendKeys(password);
    }

    public void clickOnLoginButtonOnLoginPage() {
        loginbuttonOnLoginPage.click();
    }

    public boolean logoutButtonDisplayed() {
        return logoutButton.isDisplayed();
    }

    public void enterInvalidEmail(String invalidEmail) {
        emailInputField.sendKeys(invalidEmail);
    }

    public String getWrongEmaiLText(){
        return errorText.getText();
    }

   // public void enterWrongPassword(String WrongEmailText) {
     //   passwordInputField.sendKeys);
    //}

    public void clickOnPassword() {
        passwordInputField.click();
    }


    }





