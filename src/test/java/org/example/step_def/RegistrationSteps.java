package org.example.step_def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertThat;

public class RegistrationSteps extends DriverManager {
    RegistrationPage registrationPage = new RegistrationPage();


    @When("^I enter First name \"([^\"]*)\"$")
    public void i_enter_First_name(String name) throws Throwable {
        registrationPage.enterName(name);
    }

    @And("^I enter LastName \"([^\"]*)\"$")
    public void i_enter_LastName(String lastName) throws Throwable {
        registrationPage.enterLastName(lastName);
    }

    @When("^I enter Valid email or register page\"([^\"]*)\"$")
    public void i_enter_Valid_email_or_register_page(String rEmail) throws Throwable {
        registrationPage.enterEmail(rEmail);
    }

    @And("^I enter password on register page \"([^\"]*)\"$")
    public void i_Enter_Password_On_Register_Page(String password) throws Throwable {
        registrationPage.setInputPassword(password);
    }

    @When("^I enter confirm password \"([^\"]*)\"$")
    public void i_enter_confirm_password(String confirmPassword) throws Throwable {
        registrationPage.enterPassword(confirmPassword);
    }

    @When("^i click on Register button on registration page$")
    public void i_click_on_Register_button_on_registration_page() throws Throwable {
        registrationPage.clickOnRegisterButton();
    }


    @Then("^I should see log out button displayed$")
    public void i_should_see_log_out_button_displayed() throws Throwable {

    }

    @Then("^I should \"([^\"]*)\" button is displayed$")
    public void i_should_button_is_displayed(String continueButton) throws Throwable {
        String actualVisibleText = registrationPage.getContinueText();
        assertThat(actualVisibleText, is(equalToIgnoringCase(continueButton)));
    }


    @Then("^I should see your registration completed on registration page$")
    public void iShouldSeeYourRegistrationCompletedOnRegistrationPage() {
        boolean registrationCompleted =registrationPage.registrationComplete();
        assertThat(registrationCompleted, is(true));
    }
}



