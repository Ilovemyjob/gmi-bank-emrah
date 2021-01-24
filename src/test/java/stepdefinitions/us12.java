package stepdefinitions;

import io.cucumber.java.en.Given;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.EmployeePage;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class us12 {
    HomePage homePage = new HomePage();


    @Given("verify customers info populated")
    public void verify_customers_info_populated() {
        for (WebElement element : Arrays.asList(homePage.firstName, homePage.lastName, homePage.middleInitial, homePage.email, homePage.mobilePhoneNumber, homePage.phoneNumber, homePage.address, homePage.customersCreateDate)) {
            assertTrue(element.isDisplayed());
        }
        List<WebElement> tableData=Driver.getDriver().findElements(By.xpath("//td"));
        assertTrue(tableData.size()>0);
    }

    @Given("user clicks view option to see customer's all info on customer page")
    public void user_clicks_view_option_to_see_customer_s_all_info_on_customer_page() {
       homePage.customersView.click();
        assertTrue(homePage.viewPageText.isDisplayed());
    }

    @Given("verify Edit button is displayed")
    public void verify_edit_button_is_displayed() {
       assertTrue(homePage.editButton.isDisplayed());
    }

    @Given("user clicks Edit option to see customer's all info on customer page")
    public void user_clicks_edit_option_to_see_customer_s_all_info_on_customer_page() {
       homePage.customersEdit.click();
       assertTrue(homePage.editPageText.isDisplayed());
    }

    @Given("user can update or create customer info on Edit portal")
    public void user_can_update_or_create_customer_info_on_edit_portal() {
        String temp = homePage.firstNameForEditable.getAttribute("value");
        String editedTemp = temp.toUpperCase();
        homePage.firstNameForEditable.clear();
        homePage.firstNameForEditable.sendKeys(editedTemp);
        homePage.saveButtonEditPage.click();
        ReusableMethods.waitForVisibility(homePage.succesPopUP,5);
        assertTrue(homePage.succesPopUP.isDisplayed());

    }

    @Given("user should clicks delete button")
    public void user_should_clicks_delete_button() {
       homePage.customersDelete.click();
    }

    @Given("user should see message if user sure about deletion")
    public void user_should_see_message_if_user_sure_about_deletion() {
        ReusableMethods.waitForVisibility(homePage.deleteAlertMessage,5);
       assertTrue(homePage.deleteAlertMessage.isDisplayed());
        ReusableMethods.waitFor(3);
    }

    @Given("user clicks my operation on employee page")
    public void userClicksMyOperationOnEmployeePage() {
        EmployeePage employeePage = new EmployeePage();
        employeePage.myOperationSegment.click();

    }

    @Given("user clicks Manage Customer on employee page")
    public void userClicksManageCustomerOnEmployeePage() {
        EmployeePage employeePage = new EmployeePage();
        employeePage.manageCustomerAsEmployee.click();
    }
}
