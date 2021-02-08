package stepdefinitions;

import com.mysql.cj.exceptions.DataReadException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

public class Demo {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    EmployeePage employeePage = new EmployeePage();
    ManageCustomerPage manageCustomerPage = new ManageCustomerPage();
    ManageAccountPage manageAccountPage = new ManageAccountPage();
    CreateOrEditAccountPage createOrEditAccountPage = new CreateOrEditAccountPage();
    CreateOrEditCustomerPage createOrEditCustomerPage = new CreateOrEditCustomerPage();



    @Given("applicant is on register page")
    public void applicant_is_on_register_page() {
        Driver.getDriver().get(ConfigReader.getProperty("gmi_url"));
        homePage.userIcon.click();
        homePage.register.click();
    }

    @Given("applcant provide all required data adn click  register")
    public void applcant_provide_all_required_data_adn_click_register() {
       registrationPage.ssn.sendKeys("124-65-7894");
       registrationPage.firstname.sendKeys("Elon");
       registrationPage.lastname.sendKeys("Musk");
       registrationPage.address.sendKeys("GmiBank");
       registrationPage.mobilephone.sendKeys("123-456-7895");
       registrationPage.username.sendKeys("elonmusk007");
       registrationPage.email.sendKeys("elon@musk.com");
       registrationPage.firstPassword.sendKeys("abcde");
       registrationPage.secondPassword.sendKeys("abcde");
       registrationPage.registerbutton.click();

    }

    @Given("user on accoun creation page")
    public void user_on_accoun_creation_page() throws InterruptedException {
        employeePage.myOperationSegment.click();
        employeePage.manageAccountAsEmployee.click();
        createOrEditAccountPage.createANewAccount.click();
        Thread.sleep(5000);
    }

    @Given("provide all data and save")
    public void provide_all_data_and_save() throws InterruptedException {
       createOrEditAccountPage.description.sendKeys("Elon Account");
       createOrEditAccountPage.balance.sendKeys("1000000");
       createOrEditAccountPage.save.click();
       Thread.sleep(5000);
    }
    @Given("user is on cutomer creatin page")
    public void user_is_on_cutomer_creatin_page() {
       employeePage.myOperationSegment.click();
       employeePage.manageCustomerAsEmployee.click();
       employeePage.createCustomerButton.click();
    }

    @Then("provide all info and click save")
    public void provide_all_info_and_click_save() throws InterruptedException {
    createOrEditCustomerPage.searchSSN.sendKeys("123-65-7894");
    createOrEditCustomerPage.searchSSNbutton.click();
    createOrEditCustomerPage.createMiddleInitial.sendKeys("e");
    createOrEditCustomerPage.createPhonNum.sendKeys("123-456-7895");
    createOrEditCustomerPage.createZipCode.sendKeys("12345");
    createOrEditCustomerPage.createCity.sendKeys("New York");
    Thread.sleep(1000);
        Select select = new Select(createOrEditCustomerPage.searchCountry);
        select.selectByValue("3");
    createOrEditCustomerPage.searchState.sendKeys("NY");
        Thread.sleep(1000);
    Select select1 = new Select(createOrEditCustomerPage.chooseAccount);
    select1.selectByValue("7221");
    Thread.sleep(5000);

    createOrEditCustomerPage.SaveButton.click();

    }



}
