package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.CreateOrEditAccountPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;


public class AccountCreation {

    CreateOrEditAccountPage accountCreation = new CreateOrEditAccountPage();
    List<WebElement> dropdownElement;

    @Given("select Manage accounts")
    public void select_manage_accounts() {
        accountCreation.manageAccount.click();
    }

    @Then("click on Create a new account")
    public void click_on_create_a_new_account() {
        accountCreation.createANewAccount.click();
    }
    @Given("user clicks on descriptionbox")
    public void user_clicks_on_descriptionbox() {
        accountCreation.description.click();
    }

    @Given("user should let the descriptionBox blank")
    public void user_should_let_the_description_box_blank() {
        accountCreation.description.sendKeys(Keys.TAB);
    }

    @Then("assert description error message {string}")
    public void assert_description_error_message(String string) {
        ReusableMethods.waitForVisibility(accountCreation.descriptionErrorMessage, 5);
        Assert.assertEquals(accountCreation.descriptionErrorMessage.getText(),string);
    }

    @Then("provide a data for description {string}")
    public void provide_a_data_for_description(String string) {
        accountCreation.description.sendKeys(string);
    }

    @Given("user clicks on balanceBox")
    public void user_clicks_on_balance_box() {
        accountCreation.balance.click();
    }

    @Given("user should let the balanceBox blank")
    public void user_should_let_the_balance_box_blank() {
        ReusableMethods.waitForVisibility(accountCreation.balance, 5);
        accountCreation.balance.sendKeys(Keys.TAB);
    }

    @Then("verify balance error message {string}")
    public void verify_balance_error_message(String string) {
        ReusableMethods.waitForVisibility(accountCreation.balanceErrorMessage, 5);
        Assert.assertEquals(accountCreation.balanceErrorMessage.getText(),string);
    }

    @Then("provide a data for balanceBox {string}")
    public void provide_a_data_for_balance_box(String string) {
        accountCreation.balance.sendKeys(string);
    }

    @Given("user clicks on account type")
    public void user_clicks_on_account_type() {
        accountCreation.accountType.click();
    }
    @Given("user should select the option SAVING")
    public void user_should_select_the_option_checking() {
        accountCreation.saving.click();
    }

    @Then("verify that option is selected {string}")
    public void verify_that_option_is_selected(String string) {
        Assert.assertEquals(accountCreation.saving.getText(),string);
    }

    @Given("user clicks on account status type")
    public void user_clicks_on_account_status_type() {
        accountCreation.accountStatusType.click();
    }
    @Given("user should define the option {string}")
    public void user_should_define_the_option(String string) {
        accountCreation.closed.click();
    }

    @Then("verify that option is defined {string}")
    public void verify_that_option_is_defined(String string) {
        Assert.assertEquals(accountCreation.closed.getText(), string);
    }

    @Given("user clicks on employeebox")
    public void user_clicks_on_employeebox() {
        accountCreation.employee.click();
    }

    @Given("should select an employee")
    public void should_select_an_employee() {
        Select select = new Select(accountCreation.employee);
        dropdownElement = select.getOptions();
        select.selectByVisibleText("Saski");
        accountCreation.save.click();
//        if(dropdownElement.size()==0){
//            Assert.assertTrue(false);
//        }

    }

    @Then("verify that employee selected {string}")
    public void verify_that_employee_selected(String string) {
        //Assert.assertEquals(accountCreation.employee.getText(), string);
        Assert.assertTrue(accountCreation.employee.getText().contains(string));
        Driver.getDriver().findElement(By.id("save-entity")).click();
    }




}

