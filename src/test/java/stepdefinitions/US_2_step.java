package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_2;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_2_step {

    US_2 us_2 = new US_2();
    @Given("User go to GMI BAnk homepage")
    public void userGoToGMIBAnkHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("gmiBank_url"));

    }

    @And("User go to Registration page")
    public void userGoToRegistrationPage() {
        us_2.accountmenu.click();
        us_2.register.click();
    }

    @Given("User click SSn textbox")
    public void userClickSSnTextbox() {
   us_2.ssn.click();
    }

    @And("User Doesn't type SSN number and pass the other step")
    public void userDoesnTTypeSSNNumberAndPassTheOtherStep() {
        us_2.firstname.click();
    }

    @And("User should see Error message -translation-not-found[Your SSN is required]")
    public void userShouldSeeErrorMessageTranslationNotFoundYourSSNIsRequired() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us_2.ssntext.isDisplayed());
    }

    @Given("User click the Adress textbox")
    public void userClickTheAdressTextbox() {
        us_2.address.click();
    }

    @And("User Doesn't type the Adress and pass the other step")
    public void userDoesnTTypeTheAdressAndPassTheOtherStep() {
        us_2.mobilephone.click();
    }

    @And("User should see Error message -Your Adress is required")
    public void userShouldSeeErrorMessageYourAdressIsRequired() {
       Assert.assertFalse("Address should be required",us_2.addresstext.isEnabled());

    }

    @Given("User click the Mobile phone Number textbox")
    public void userClickTheMobilePhoneNumberTextbox() {
        us_2.mobilephone.click();
    }

    @And("User Doesn't type the Mobile phone Number and pass the other step")
    public void userDoesnTTypeTheMobilePhoneNumberAndPassTheOtherStep() {
        us_2.username.click();
    }

    @And("User should see Error message -Your Mobile phone Number is required")
    public void userShouldSeeErrorMessageYourMobilePhoneNumberIsRequired() {
       Assert.assertFalse(us_2.mobilephonetext.isEnabled());
    }

    @And("User type {string} and pass the other step")
    public void userTypeAndPassTheOtherStep(String ssn) {

        us_2.ssn.sendKeys(ssn);
        us_2.firstname.click();

    }
      //  Driver.waitAndSendText();

    @And("User should see Error message -Your SSN is invalid")
    public void userShouldSeeErrorMessageYourSSNIsInvalid() {

        Assert.assertTrue("Your SSN is invalid",us_2.ssntextinvalid.isDisplayed());
    }

    @Given("User click Mobile Phone Number textbox")
    public void userClickMobilePhoneNumberTextbox() {

        us_2.mobilephone.click();

    }

    @And("User should see Error message -Your Mobile Phone Number is invalid")
    public void userShouldSeeErrorMessageYourMobilePhoneNumberIsInvalid() {
    Assert.assertFalse(us_2.mobilephonetextinvalid.isEnabled());
    }

    @Given("User click Email textbox")
    public void userClickEmailTextbox() {
        us_2.email.click();
    }

    @And("User type Mobile Phone {string} and pass the other step")
    public void userTypeMobilePhoneAndPassTheOtherStep(String number) {
        us_2.mobilephone.sendKeys(number);
    }

    @And("User should see Error message -This field is invalid")
    public void userShouldSeeErrorMessageThisFieldIsInvalid() {
        Assert.assertFalse(us_2.emailtextinvalid.isDisplayed());
    }


    @And("User type Email {string} and pass the other step")
    public void userTypeEmailAndPassTheOtherStep(String email) {
        us_2.email.sendKeys(email);
    }

    @And("user clicks register")
    public void userClicksRegister() {
        us_2.registerbutton.click();
    }

    @Then("user verifies SSN message")
    public void userVerifiesSSNMessage() throws InterruptedException {

        Thread.sleep(3000);

        System.out.println(us_2.ssntext.getText());
        Assert.assertEquals("translation-not-found[Your SSN is required]",us_2.ssntext.getText());


    }

    @Then("user verifies firstname message")
    public void userVerifiesFirstnameMessage() throws InterruptedException {
        Thread.sleep(3000);

        String expected="Your First Name is required";
        Assert.assertEquals(expected,us_2.firstnametext.getText());
    }

    @Then("user verifies lastname message")
    public void userVerifiesLastnameMessage() {
        Assert.assertEquals("Your Last Name is required",us_2.lastnametext.getText());

    }

    @Then("user verifies username message")
    public void userVerifiesUsernameMessage() {
        Assert.assertEquals("Your username is required.",us_2.usernametext.getText());

    }

    @Then("user verifies email message")
    public void userVerifiesEmailMessage() {
        Assert.assertEquals("Your email is required.",us_2.emailtext.getText());

    }

    @Then("user verifies new password message")
    public void userVerifiesNewPasswordMessage() {
        Assert.assertEquals("Your password is required.",us_2.passwordtext.getText());

    }

    @Then("user verifies confirmation password message")
    public void userVerifiesConfirmationPasswordMessage() {
        Assert.assertEquals("Your confirmation password is required.",us_2.newpasswordtext.getText());

    }

    @Then("And user verifies the visibility of message")
    public void andUserVerifiesTheVisibilityOfMessage() {
        System.out.println(us_2.message.getText());

//        Assert.assertTrue(us_2.message.getText().equals("translation-not-found[Your SSN is required]\n" +
//                "If you want to sign in, you can try the default accounts:\n" +
//                "- Administrator (login=\"admin\" and password=\"admin\")\n" +
//                "- User (login=\"user\" and password=\"user\")."));


    }

    @And("user enters mobile phone {string}")
    public void userEntersMobilePhone(String number) {

        us_2.mobilephone.sendKeys(number);

    }

    @And("User enters SSN number {string}")
    public void userEntersSSNNumber(String ssn) {
        us_2.ssn.sendKeys(ssn);

    }

    @And("user enters firstname {string}")
    public void userEntersFirstname(String first) {
        us_2.firstname.sendKeys(first);

    }

    @And("user enters lastname {string}")
    public void userEntersLastname(String last) {
        us_2.lastname.sendKeys(last);

    }

    @And("user enters address {string}")
    public void userEntersAddress(String address) {
        us_2.address.sendKeys(address);

    }

    @And("user enters username {string}")
    public void userEntersUsername(String username) {
        us_2.username.sendKeys(username);

    }

    @And("user enters email {string}")
    public void userEntersEmail(String email) throws InterruptedException {
        Thread.sleep(2000);
        us_2.email.sendKeys(email);

    }

    @And("user enters new password {string}")
    public void userEntersNewPassword(String password) {
        us_2.firstPassword.sendKeys(password);

    }

    @And("user enters new password confirmation {string}")
    public void userEntersNewPasswordConfirmation(String secondpassword) {
        us_2.secondPassword.sendKeys(secondpassword);

    }

    @Then("User verifies the SSN invalid message")
    public void userVerifiesTheSSNInvalidMessage() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(us_2.ssntextinvalid.getText());
            String expected =us_2.ssntextinvalid.getText();
        Assert.assertTrue(us_2.ssntextinvalid.getText().equals("Your SSN is invalid"));

        //Assert.assertTrue(us_2.ssntextinvalid.getText().contains("Your SSN is invalid\n"));
    }

    @Then("User verifies the Mobilephone number invalid message")
    public void userVerifiesTheMobilephoneNumberInvalidMessage() {
        Assert.assertTrue(us_2.mobilephonetextinvalid.getText().equals("Your mobile phone number is invalid"));

    }

    @Then("User verifies the email invalid message")
    public void userVerifiesTheEmailInvalidMessage() {
        Assert.assertTrue(us_2.emailtextinvalid.getText().equals("This field is invalid"));


    }

}
