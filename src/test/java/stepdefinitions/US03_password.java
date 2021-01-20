package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.codehaus.groovy.runtime.powerassert.AssertionRenderer;
import org.junit.Assert;
import pages.RegistrationPageOmer;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US03_password {
    RegistrationPageOmer omer = new RegistrationPageOmer();

    @Given("go to registration page")
    public void go_to_registration_page() {
        Driver.getDriver().get(ConfigReader.getProperty("registrationPage"));
    }

    @Then("enter lower case")
    public void enter_lower_case() {
        omer.password.sendKeys("aaaaaa");
        Assert.assertTrue(omer.passwordStrentgh1.isDisplayed());
    }

    @Then("enter upper case")
    public void enter_upper_case() {
        omer.password.sendKeys("AAAAA");
        Assert.assertTrue(omer.passwordStrentgh2.isDisplayed());
    }

    @Then("enter a digit")
    public void enter_a_digit() {
        omer.password.sendKeys("111111");
        Assert.assertTrue(omer.passwordStrentgh3.isDisplayed());
    }

    @Then("enter a special char")
    public void enter_a_special_char() {
        omer.password.sendKeys("........");
        Assert.assertTrue(omer.passwordStrentgh4.isDisplayed());
    }

    @Then("total should be at least seven chars")
    public void total_should_be_at_least_chars() {
        String password = omer.password.getText();
        if (password.length() >= 7) {
            Assert.assertTrue(omer.passwordStrentgh5.isDisplayed());
        } else {
            System.out.println("password is not strong");
        }

    }

    @Then("close browser")
    public void close_browser() {
        Driver.closeDriver();
    }

}
