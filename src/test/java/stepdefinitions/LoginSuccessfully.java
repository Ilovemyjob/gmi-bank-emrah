package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CustomerPage;
import pages.EmployeePage;
import pages.HomePage;
import pages.SignIn;
import sun.security.krb5.Config;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class LoginSuccessfully {
    HomePage homePage = new HomePage();
    SignIn signIn = new SignIn();
    EmployeePage employeePage = new EmployeePage();
    @Given("user is on GmiBank hompage")
    public void user_is_on_gmi_bank_hompage() {
        Driver.getDriver().get(ConfigReader.getProperty("gmi_url"));
    }

    @Given("user clicks user icon")
    public void user_clicks_user_icon() {
       homePage.userIcon.click();
    }

    @Given("user clicks sign in")
    public void user_clicks_sign_in() {
        ReusableMethods.waitForVisibility(homePage.signIn,5);
        homePage.signIn.click();
    }

    @Given("user provide valid username")
    public void user_provide_valid_username() {
        ReusableMethods.waitForVisibility(signIn.usernameBox,5);
        signIn.usernameBox.sendKeys("employeeT28");
    }

    @Given("user provide valid password")
    public void user_provide_valid_password() {
       signIn.passwordBox.sendKeys("employee28");
    }

    @Given("user clicks sign in button")
    public void user_clicks_sign_in_button() {
    signIn.signInButton.click();
    }

    @Then("user should be on user page")
    public void user_should_be_on_user_page() {
        Assert.assertTrue(employeePage.myOperationSegment.isDisplayed());
    }

    @Given("user clicks cancel button")
    public void user_clicks_cancel_button() {
       signIn.cancelButton.click();
    }

    @Then("user should be on home page")
    public void user_should_be_on_home_page() {
        Assert.assertTrue(homePage.userIcon.isDisplayed());
    }

}
