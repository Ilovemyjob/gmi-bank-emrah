package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.ReusableMethods;

public class US_08 {
    HomePage homePage = new HomePage();

    @Given("user clicks on account menu")
    public void user_clicks_on_account_menu() {
        homePage.accountMenuAfterLogin.click();
    }

    @Given("user clicks on password")
    public void user_clicks_on_password() {
        homePage.passwordManaging.click();

    }
    @Given("user tpye current password {string}")
    public void user_tpye_current_password(String current) {
        homePage.currentPassEditig.sendKeys(current);

    }
    @Given("user type new password {string}")
    public void user_type_new_password(String newpass) {
        homePage.newPassword.sendKeys(newpass);

    }
    @Given("user type new password again for confirmation {string}")
    public void user_type_new_password_again_for_confirmation(String confirmpass) {
        homePage.newPasswordConfirm.sendKeys(confirmpass);

    }
    @Given("user clicks on save button for password change")
    public void user_clicks_on_save_button_for_password_change() {
        homePage.savePasswordButton.click();
        ReusableMethods.waitFor(1);
    }
    @Then("verify that green approve massage not displayed")
    public void verify_that_green_approve_massage_not_displayed() {
        Assert.assertFalse(homePage.greenApproveMessage.isDisplayed());
    }


    @And("user type new password as {string}")
    public void userTypeNewPasswordAs(String newPass) {
        homePage.newPassword.sendKeys(newPass);
    }
    @And("user type new password again for confirmation as {string}")
    public void userTypeNewPasswordAgainForConfirmationAs(String newPassConfirm) {
        homePage.newPasswordConfirm.sendKeys(newPassConfirm);
    }
    @And("verify that password succesfully changed.")
    public void verifyThatPasswordSuccesfullyChanged() {
        homePage.savePasswordButton.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.greenApproveMessage.isDisplayed());
    }


    @And("verify that password contains one lowercase char and the level chart change accordingly")
    public void verifyThatPasswordContainsOneLowercaseCharAndTheLevelChartChangeAccordingly() {
        ReusableMethods.waitFor(1);
        Assert.assertNotEquals(("background-color: rgb(221, 221, 221);"),homePage.passwordStrengthScala.get(0).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(255, 0, 0);"),homePage.passwordStrengthScala.get(0).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(221, 221, 221);"),homePage.passwordStrengthScala.get(1).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(221, 221, 221);"),homePage.passwordStrengthScala.get(2).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(221, 221, 221);"),homePage.passwordStrengthScala.get(3).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(221, 221, 221);"),homePage.passwordStrengthScala.get(4).getAttribute("style"));
    }

    @And("verify that password contains one uppercase char and the level chart change accordingly")
    public void verifyThatPasswordContainsOneUppercaseCharAndTheLevelChartChangeAccordingly() {
        ReusableMethods.waitFor(1);
        Assert.assertEquals(("background-color: rgb(255, 153, 0);"),homePage.passwordStrengthScala.get(0).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(255, 153, 0);"),homePage.passwordStrengthScala.get(1).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(221, 221, 221);"),homePage.passwordStrengthScala.get(2).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(221, 221, 221);"),homePage.passwordStrengthScala.get(3).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(221, 221, 221);"),homePage.passwordStrengthScala.get(4).getAttribute("style"));
    }

    @And("verify that password contains one digit and the level chart change accordingly")
    public void verifyThatPasswordContainsOneDigitAndTheLevelChartChangeAccordingly() {
        ReusableMethods.waitFor(1);
        Assert.assertEquals(("background-color: rgb(153, 255, 0);"),homePage.passwordStrengthScala.get(0).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(153, 255, 0);"),homePage.passwordStrengthScala.get(1).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(153, 255, 0);"),homePage.passwordStrengthScala.get(2).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(221, 221, 221);"),homePage.passwordStrengthScala.get(3).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(221, 221, 221);"),homePage.passwordStrengthScala.get(4).getAttribute("style"));
    }

    @And("verify that password contains one special char and the level chart change accordingly")
    public void verifyThatPasswordContainsSpecialCharAndTheLevelChartChangeAccordingly(int arg0) {
        ReusableMethods.waitFor(1);
        Assert.assertEquals(("background-color: rgb(153, 255, 0);"),homePage.passwordStrengthScala.get(0).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(153, 255, 0);"),homePage.passwordStrengthScala.get(1).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(153, 255, 0);"),homePage.passwordStrengthScala.get(2).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(153, 255, 0);"),homePage.passwordStrengthScala.get(3).getAttribute("style"));
        Assert.assertEquals(("background-color: rgb(221, 221, 221);"),homePage.passwordStrengthScala.get(4).getAttribute("style"));
    }


    @And("verify that password contains at least seven chars and the level chart change accordingly")
    public void verifyThatPasswordContainsAtLeastSevenCharsAndTheLevelChartChangeAccordingly() {
        ReusableMethods.waitFor(1);
        if (homePage.newPassword.getAttribute("value").length()>=7){
            Assert.assertEquals(("background-color: rgb(153, 255, 0);"),homePage.passwordStrengthScala.get(0).getAttribute("style"));
            Assert.assertEquals(("background-color: rgb(153, 255, 0);"),homePage.passwordStrengthScala.get(1).getAttribute("style"));
            Assert.assertEquals(("background-color: rgb(153, 255, 0);"),homePage.passwordStrengthScala.get(2).getAttribute("style"));
            Assert.assertEquals(("background-color: rgb(153, 255, 0);"),homePage.passwordStrengthScala.get(3).getAttribute("style"));
            Assert.assertEquals(("background-color: rgb(153, 255, 0);"),homePage.passwordStrengthScala.get(4).getAttribute("style"));
        }else {
            Assert.assertEquals(("background-color: rgb(255, 0, 0);"),homePage.passwordStrengthScala.get(0).getAttribute("style"));
        }
    }
}
