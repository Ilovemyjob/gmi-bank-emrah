package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CustomerPageOmer;
import pages.SignIn;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_15_stepdefinitions {
    SignIn omer = new SignIn();
    CustomerPageOmer customerPageOmer = new CustomerPageOmer();

    @Given("go to log in page")
    public void go_to_log_in_page() {
        Driver.getDriver().get("http://www.gmibank.com/login");
        ReusableMethods.waitFor(3);

    }


    @Then("enter username {string}")
    public void enterUsername(String username) {
        omer.usernameBox.sendKeys(username);

    }

    @Then("enter password {string}")
    public void enterPassword(String password) {
        omer.passwordBox.sendKeys(password);
    }

    @Then("click on Sign in")
    public void click_on_sign_in() {
        omer.signInButton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("click on My operations")
    public void click_on_my_operations() {
        customerPageOmer.My_Operations.click();
        ReusableMethods.waitFor(2);
    }

    @Then("click on My Accounts")
    public void click_on_my_accounts() {
        customerPageOmer.My_Accounts.click();
        ReusableMethods.waitFor(2);
    }

    @Then("verify if account able to see all accounts {int}")
    public void verify_if_account_able_to_see_all_accounts(int account) {
        if(account!=0){
            String str = "(//td/button[@type='button'])["+ account +"]";
            WebElement accountNo = Driver.getDriver().findElement(By.xpath(str));
            Assert.assertTrue(accountNo.isDisplayed());
            Assert.assertTrue(customerPageOmer.View_Transaction1.isDisplayed());
        }else{
            System.out.println("there is no account");
        }


    }

    @Then("check if View Transaction is click able")
    public void check_if_view_transaction_is_click_able() {
//I combined two steps in one. this Assertion done on the up step.verify if account able to see all accounts
    }}




