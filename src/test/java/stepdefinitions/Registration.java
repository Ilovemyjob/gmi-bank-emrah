package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ReusableMethods;

public class Registration {

    RegistrationPage registrationPage = new RegistrationPage();
    HomePage homePage = new HomePage();
    Faker faker = new Faker();

    @Then("user clicks on register link")
    public void user_clicks_on_register_link() {
        homePage.register.click();
    }

    @Given("User type valid SSN in {string}")
    public void userTypeValidSSNIn(String ssn) {
        registrationPage.ssn.sendKeys(ssn);
        String a = ""+faker.number().numberBetween(1000,9999);
        registrationPage.ssn.sendKeys(a);
      //  ReusableMethods.waitFor(2);
    }

    @And("User type valid name in {string}")
    public void userTypeValidNameIn(String name) {
        registrationPage.firstname.sendKeys(name);
      //  ReusableMethods.waitFor(2);

    }

    @And("User type valid lastname in {string}")
    public void userTypeValidLastnameIn(String lastname) {
        registrationPage.lastname.sendKeys(lastname);
      //  ReusableMethods.waitFor(2);

    }

    @And("User type valid address in {string}")
    public void userTypeValidAddressIn(String address) {
        registrationPage.address.sendKeys(address);
      //  ReusableMethods.waitFor(2);


    }

    @And("User type valid mobilephone number in {string}")
    public void userTypeValidMobilephoneNumberIn(String mobPhonNum) {
        registrationPage.mobilephone.sendKeys(mobPhonNum);
      //  ReusableMethods.waitFor(2);

    }

    @And("User type valid username in {string}")
    public void userTypeValidUsernameIn(String username) {
        registrationPage.username.sendKeys(username);
      //  ReusableMethods.waitFor(2);

    }

    @And("User type valid email in {string}")
    public void userTypeValidEmailIn(String email) {
        registrationPage.email.sendKeys(email);
       // ReusableMethods.waitFor(2);

    }

    @And("User type valid password {string}")
    public void userTypeValidPassword(String password) {
        registrationPage.firstPassword.sendKeys(password);
        // ReusableMethods.waitFor(2);

    }
    @And("User type valid second password {string}")
    public void userTypeValidSecondPassword(String secondpassword) {
        registrationPage.secondPassword.sendKeys(secondpassword);
        registrationPage.registerbutton.click();
        ReusableMethods.waitFor(2);

    }

    @Then("Assert that all data is valid")
    public void assertThatAllDataIsValid() {
        Assert.assertTrue(registrationPage.greenApproveMessage.isDisplayed());
        // ReusableMethods.waitFor(2);

    }

}
