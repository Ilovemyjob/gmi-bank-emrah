package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import pages.SignIn;
import utilities.ConfigReader;

import utilities.ReusableMethods;

public class LoginUnsuccessfully {

    SignIn signIn = new SignIn();



    @Given("user provide invalid username")
    public void user_provide_invalid_username() {
        ReusableMethods.waitForVisibility(signIn.usernameBox, 5);
        signIn.usernameBox.sendKeys(ConfigReader.getProperty("Invalid_username"));
    }
    @Given("user provide invalid password")
    public void user_provide_valid_password() {

        signIn.passwordBox.sendKeys("Invalid_password");
    }

    @Then("user should see validating the error message {string}")
    public void user_should_see_validating_the_error_message(String string){
        ReusableMethods.waitForVisibility(signIn.errorMesagge, 5);
        Assert.assertEquals(signIn.errorMesagge.getText(),string);

    }

    @Then("user should see the option to reset the password {string}")
    public void user_should_see_the_option_to_reset_the_password (String string) {
        Assert.assertTrue(signIn.forgetPassword.isDisplayed());
    }
    @Then("user should be on password reset request page")
    public void user_should_be_on_password_reset_request_page() {
        signIn.forgetPassword.click();
    }

    @Then("user should see the option register a new account {string}")
    public void user_should_see_the_option_register_a_new_account (String string) {
        Assert.assertTrue(signIn.registerButton.isDisplayed());
    }
    @Then("user should be on registration page")
    public void user_should_be_on_registration_page() {
        signIn.registerButton.click();
    }
}

