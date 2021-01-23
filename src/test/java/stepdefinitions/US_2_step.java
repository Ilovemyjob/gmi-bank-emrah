package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegistrationPage;
import pages.US_2;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_2_step {

    RegistrationPage registrationPage = new RegistrationPage();
    @Given("User go to GMI BAnk homepage")
    public void userGoToGMIBAnkHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("gmi_url"));

    }

    @And("User go to Registration page")
    public void userGoToRegistrationPage() {
        registrationPage.accountmenu.click();
        registrationPage.register.click();
    }

    @Given("User click SSn textbox")
    public void userClickSSnTextbox() {
        registrationPage.ssn.click();
    }

    @And("User Doesn't type SSN number and pass the other step")
    public void userDoesnTTypeSSNNumberAndPassTheOtherStep() {
        registrationPage.firstname.click();
    }

    @And("User should see Error message -translation-not-found[Your SSN is required]")
    public void userShouldSeeErrorMessageTranslationNotFoundYourSSNIsRequired() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(registrationPage.ssntext.isDisplayed());
    }

    @Given("User click the Adress textbox")
    public void userClickTheAdressTextbox() {
        registrationPage.address.click();
    }

    @And("User Doesn't type the Adress and pass the other step")
    public void userDoesnTTypeTheAdressAndPassTheOtherStep() {
        registrationPage.mobilephone.click();
    }

    @And("User should see Error message -Your Adress is required")
    public void userShouldSeeErrorMessageYourAdressIsRequired() {
       Assert.assertFalse("Address should be required",registrationPage.addresstext.isEnabled());

    }

    @Given("User click the Mobile phone Number textbox")
    public void userClickTheMobilePhoneNumberTextbox() {
        registrationPage.mobilephone.click();
    }

    @And("User Doesn't type the Mobile phone Number and pass the other step")
    public void userDoesnTTypeTheMobilePhoneNumberAndPassTheOtherStep() {
        registrationPage.username.click();
    }

    @And("User should see Error message -Your Mobile phone Number is required")
    public void userShouldSeeErrorMessageYourMobilePhoneNumberIsRequired() {
       Assert.assertFalse(registrationPage.mobilephonetext.isEnabled());
    }

    @And("User type {string} and pass the other step")
    public void userTypeAndPassTheOtherStep(String ssn) {

        registrationPage.ssn.sendKeys(ssn);
        registrationPage.firstname.click();

    }
      //  Driver.waitAndSendText();

    @And("User should see Error message -Your SSN is invalid")
    public void userShouldSeeErrorMessageYourSSNIsInvalid() {

        Assert.assertTrue("Your SSN is invalid",registrationPage.ssntextinvalid.isDisplayed());
    }

    @Given("User click Mobile Phone Number textbox")
    public void userClickMobilePhoneNumberTextbox() {

        registrationPage.mobilephone.click();

    }

    @And("User should see Error message -Your Mobile Phone Number is invalid")
    public void userShouldSeeErrorMessageYourMobilePhoneNumberIsInvalid() {
    Assert.assertFalse(registrationPage.mobilephonetextinvalid.isEnabled());
    }

    @Given("User click Email textbox")
    public void userClickEmailTextbox() {
        registrationPage.email.click();
    }

    @And("User type Mobile Phone {string} and pass the other step")
    public void userTypeMobilePhoneAndPassTheOtherStep(String number) {
        registrationPage.mobilephone.sendKeys(number);
    }

    @And("User should see Error message -This field is invalid")
    public void userShouldSeeErrorMessageThisFieldIsInvalid() {
        Assert.assertFalse(registrationPage.emailtextinvalid.isDisplayed());
    }


    @And("User type Email {string} and pass the other step")
    public void userTypeEmailAndPassTheOtherStep(String email) {
        registrationPage.email.sendKeys(email);
    }

    @And("user clicks register")
    public void userClicksRegister() {
        registrationPage.registerbutton.click();
    }

    @Then("user verifies SSN message")
    public void userVerifiesSSNMessage() throws InterruptedException {

        Thread.sleep(3000);

        System.out.println(registrationPage.ssntext.getText());
        Assert.assertEquals("translation-not-found[Your SSN is required]",registrationPage.ssntext.getText());


    }

    @Then("user verifies firstname message")
    public void userVerifiesFirstnameMessage() throws InterruptedException {
        Thread.sleep(3000);

        String expected="Your First Name is required";
        Assert.assertEquals(expected,registrationPage.firstnametext.getText());
    }

    @Then("user verifies lastname message")
    public void userVerifiesLastnameMessage() {
        Assert.assertEquals("Your Last Name is required",registrationPage.lastnametext.getText());

    }

    @Then("user verifies username message")
    public void userVerifiesUsernameMessage() {
        Assert.assertEquals("Your username is required.",registrationPage.usernametext.getText());

    }

    @Then("user verifies email message")
    public void userVerifiesEmailMessage() {
        Assert.assertEquals("Your email is required.",registrationPage.emailtext.getText());

    }

    @Then("user verifies new password message")
    public void userVerifiesNewPasswordMessage() {
        Assert.assertEquals("Your password is required.",registrationPage.passwordtext.getText());

    }

    @Then("user verifies confirmation password message")
    public void userVerifiesConfirmationPasswordMessage() {
        Assert.assertEquals("Your confirmation password is required.",registrationPage.newpasswordtext.getText());

    }

    @Then("And user verifies the visibility of message")
    public void andUserVerifiesTheVisibilityOfMessage() {
        System.out.println(registrationPage.message.getText());

//        Assert.assertTrue(us_2.message.getText().equals("translation-not-found[Your SSN is required]\n" +
//                "If you want to sign in, you can try the default accounts:\n" +
//                "- Administrator (login=\"admin\" and password=\"admin\")\n" +
//                "- User (login=\"user\" and password=\"user\")."));


    }

    @And("user enters mobile phone {string}")
    public void userEntersMobilePhone(String number) {

        registrationPage.mobilephone.sendKeys(number);

    }

    @And("User enters SSN number {string}")
    public void userEntersSSNNumber(String ssn) {
        registrationPage.ssn.sendKeys(ssn);

    }

    @And("user enters firstname {string}")
    public void userEntersFirstname(String first) {
        registrationPage.firstname.sendKeys(first);
    }

    @And("user enters lastname {string}")
    public void userEntersLastname(String last) {
        registrationPage.lastname.sendKeys(last);
    }

    @And("user enters address {string}")
    public void userEntersAddress(String address) {
        registrationPage.address.sendKeys(address);

    }

    @And("user enters username {string}")
    public void userEntersUsername(String username) {
        registrationPage.username.sendKeys(username);

    }

    @And("user enters email {string}")
    public void userEntersEmail(String email) throws InterruptedException {
        Thread.sleep(2000);
        registrationPage.email.sendKeys(email);

    }

    @And("user enters new password {string}")
    public void userEntersNewPassword(String password) {
        registrationPage.firstPassword.sendKeys(password);

    }

    @And("user enters new password confirmation {string}")
    public void userEntersNewPasswordConfirmation(String secondpassword) {
        registrationPage.secondPassword.sendKeys(secondpassword);

    }

    @Then("User verifies the SSN invalid message")
    public void userVerifiesTheSSNInvalidMessage() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(registrationPage.ssntextinvalid.getText());
            String expected =registrationPage.ssntextinvalid.getText();
        Assert.assertTrue(registrationPage.ssntextinvalid.getText().equals("Your SSN is invalid"));

        //Assert.assertTrue(us_2.ssntextinvalid.getText().contains("Your SSN is invalid\n"));
    }

    @Then("User verifies the Mobilephone number invalid message")
    public void userVerifiesTheMobilephoneNumberInvalidMessage() {
        Assert.assertTrue(registrationPage.mobilephonetextinvalid.getText().equals("Your mobile phone number is invalid"));

    }

    @Then("User verifies the email invalid message")
    public void userVerifiesTheEmailInvalidMessage() {
        Assert.assertTrue(registrationPage.emailtextinvalid.getText().equals("This field is invalid"));


    }

//    @Then("user verifies address message")
//    public void userVerifiesAddressMessage() {
//        Assert.assertEquals("Your Last Name is required",registrationPage.lastnametext.getText());
//
//    }
//
//    @Then("user verifies mobile phone number message")
//    public void userVerifiesMobilePhoneNumberMessage() {
//        Assert.assertEquals("Your Last Name is required",registrationPage.lastnametext.getText());
//
//    }
}
