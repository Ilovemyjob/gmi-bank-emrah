package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.codehaus.groovy.runtime.powerassert.AssertionRenderer;
import org.junit.Assert;
import pages.HomePage;
import pages.RegistrationPageOmer;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US03_password {
    RegistrationPageOmer omer = new RegistrationPageOmer();
    HomePage homePage = new HomePage();

    @Given("go to home page")
    public void goToHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("gmi_url"));

    }

    @Then("click on user icon")
    public void clickOnUserIcon() {
        homePage.userIcon.click();
        ReusableMethods.waitFor(2);
    }

    @Given("go to registration page")
    public void go_to_registration_page() {
        homePage.register.click();
        ReusableMethods.waitFor(2);
    }

    @Then("enter lower case {string}")
    public void enter_lower_case(String lowerCase) {
        omer.password.sendKeys(lowerCase);
        //ReusableMethods.waitFor(2);
        Assert.assertTrue(omer.passwordStrentgh1.isDisplayed());
       // Assert.assertFalse(omer.passwordStrentgh2.isDisplayed());
    }

    @Then("enter upper case {string}")
    public void enter_upper_case(String upperCase) {
        omer.password.sendKeys(upperCase);
        Assert.assertTrue(omer.passwordStrentgh2.isDisplayed());
        //Assert.assertFalse(omer.passwordStrentgh3.isDisplayed());
        //ReusableMethods.waitFor(2);

    }

    @Then("enter a digit {string}")
    public void enter_a_digit(String digit) {
        omer.password.sendKeys(digit);
        Assert.assertTrue(omer.passwordStrentgh3.isDisplayed());
        //Assert.assertFalse(omer.passwordStrentgh4.isDisplayed());
        //ReusableMethods.waitFor(2);

    }

    @Then("enter a special char {string}")
    public void enter_a_special_char(String chaar) {
        omer.password.sendKeys(chaar);
        Assert.assertTrue(omer.passwordStrentgh4.isDisplayed());
        //Assert.assertFalse(omer.passwordStrentgh5.isDisplayed());
       // ReusableMethods.waitFor(2);

    }

    @Then("total should be at least seven chars")
    public void total_should_be_at_least_chars() {
        String password = omer.password.getText();
        if (password.length() >= 7) {
            Assert.assertTrue(omer.passwordStrentgh5.isDisplayed());
        } else {
            System.out.println("password is not strong");
        }
        ReusableMethods.waitFor(2);

    }


}
