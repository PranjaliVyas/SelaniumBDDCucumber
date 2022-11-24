package org.example.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertThat;

public class LoginSteps extends DriverManager {
    LoginPage loginPage = new LoginPage();

    @Then("^I should see \"([^\"]*)\"is visible$")
    public void i_should_see_is_visible(String expectedWelcomeText) throws Throwable {
        String actulWelcomeText = loginPage.getWelcomeTextFromLoginPage();
        assertThat(actulWelcomeText, is(equalToIgnoringCase(expectedWelcomeText)));

    }

    @And("^I should see text \"([^\"]*)\" in URL$")
    public void iShouldSeeTextInURL(String expectedURLText) throws Throwable {
        String actualURL = getURL();
        System.out.println(actualURL);
        assertThat(actualURL, containsString(expectedURLText));

    }

    @When("^I Enter Valid email \"([^\"]*)\"$")
    public void i_Enter_Valid_email(String email) throws Throwable {
        loginPage.enterEmail(email);
    }

    @When("^I Enter Valid Password \"([^\"]*)\"$")
    public void i_Enter_Valid_Password(String password) throws Throwable {
        loginPage.enterPassword(password);
    }

    @When("^I click on Login button on Login page$")
    public void i_click_on_Login_button_on_Login_page() throws Throwable {
        loginPage.clickOnLoginButtonOnLoginPage();
    }

    @Then("^I should see logout button displayed$")
    public void i_should_see_logout_button_displayed() throws Throwable {
        boolean logoutButtonDisplayed = loginPage.logoutButtonDisplayed();
        assertThat(logoutButtonDisplayed, is(true));
    }


    @And("^I click on password input page on login page$")
    public void iClickOnPasswordInputPageOnLoginPage() throws Throwable {
        loginPage.clickOnPassword();
    }

    @Then("^I should see \"([^\"]*)\" taxt displayed$")
    public void iShouldSeeTaxtDisplayed(String visibleText) throws Throwable {
        String actualVisibleText = loginPage.getWrongEmaiLText();
        assertThat(actualVisibleText, is(equalToIgnoringCase(visibleText)));
    }

    @And("^I enter invalid email \"([^\"]*)\"$")
    public void iEnterInvalidEmail(String invalidEmail) throws Throwable {
       loginPage.enterInvalidEmail(invalidEmail);
    }
}