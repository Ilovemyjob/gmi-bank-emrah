package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US_07;
import utilities.Driver;

public class US_07_Step_Definitions {
    US_07 updateInfo = new US_07();

    @Given("user goes to login page")
    public void user_goes_to_login_page() {
        updateInfo.login.click();
        updateInfo.SignIn.click();
    }

    @Given("user provide valid username {string}")
    public void user_provide_valid_username(String string) {
        updateInfo.usernameBox.sendKeys("snnhbyb");
    }

    @Given("user provide valid password {string}")
    public void user_provide_valid_password(String string) {
        updateInfo.passwordBox.sendKeys("snnhbybsnnhbyb**");

    }
    @Then("user click sign in button")
    public void user_click_sign_in_button() {
        updateInfo.signInButton.click();
    }

    @Given("user click to manage customers")
    public void user_click_to_manage_customers() {
        updateInfo.Manage_Customers.click();
    }
    @Given("user click to edit button")
    public void user_click_to_edit_button() {
        updateInfo.editButton.click();
    }
    @Given("user send {string} into the mail box")
    public void user_send_into_the_mail_box(String string) {
        updateInfo.emailBox.clear();
        updateInfo.emailBox.sendKeys("abcdefghgmail.com");

        updateInfo.emailBox.clear();
        updateInfo.emailBox.sendKeys("abc..def@gmail.com");


        updateInfo.emailBox.clear();
        updateInfo.emailBox.sendKeys(".abc@gmail.com");


        updateInfo.emailBox.clear();
        updateInfo.emailBox.sendKeys("  @gmail.com");

        updateInfo.emailBox.clear();
        updateInfo.emailBox.sendKeys("abcdef@gmail.");


        updateInfo.emailBox.clear();
        updateInfo.emailBox.sendKeys("abc@gmail#arcihe.com");
    }
    @Given("user click save button")
    public void user_click_save_button() {
        updateInfo.save.click();
    }

    @Given("user account name")
    public void user_account_name(){
        updateInfo.userAccountName.click();
    }

    @Given("sign out")
    public void sign_out(){
        updateInfo.signOutBtn.click();
    }

    @Given("user again provide valid username {string}")
    public void user_again_provide_valid_username(String string) {
        updateInfo.usernameBox.sendKeys("adminteam28");
    }

    @Given("user again provide valid password {string}")
    public void user_again_provide_valid_password(String string) {
        updateInfo.passwordBox.sendKeys("team28europe");
    }
    @Then("user again click sign in button")
    public void user_again_click_sign_in_button() {
        updateInfo.signInButton.click();
    }

    @Given("admin click administration")
    public void admin_click_administration() {
        updateInfo.Administration.click();
    }
    @Given("admin click user management")
    public void admin_click_user_management() {
        updateInfo.User_Management.click();
    }

    @Given("admin click edit button")
    public void admin_click_edit_button() {
        updateInfo.editBtn.click();
    }
    @Given("admin give an option language dropdown")
    public void admin_give_an_option_language_dropdown() {
       updateInfo.languageSelect.click();
    }








}