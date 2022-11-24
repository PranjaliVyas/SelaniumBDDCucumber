package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends DriverManager {
    @FindBy(xpath = "//input[@data-val-required='First name is required.']")
    WebElement inputFirstName;

    @FindBy(id = "LastName")
    WebElement inputLastName;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement inputPassword;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement setPassword;

    @FindBy(id = "register-button")
    WebElement registerButton;

    @FindBy(xpath = "//div[@class='result']")
    WebElement registration;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;


    public void enterName(String name) {
        inputFirstName.sendKeys(name);
    }

    public void enterLastName(String lastName) {
        inputLastName.sendKeys(lastName);
    }

    public void enterEmail(String rEmail) {
        inputEmail.sendKeys(rEmail);
    }

    public void setInputPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void enterPassword(String confirmPassword) {
        setPassword.sendKeys(confirmPassword);
    }

    public void clickOnRegisterButton() {
        registerButton.click();
    }

    public boolean registrationComplete() {
        return registration.isDisplayed();
    }

    public String getContinueText() {
        return continueButton.getText();
    }
}
