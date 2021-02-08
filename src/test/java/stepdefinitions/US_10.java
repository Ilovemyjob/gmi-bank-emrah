package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CreateOrEditCustomerPage;
import pages.CustomerPage;
import pages.ManageCustomerPage;
import utilities.ReusableMethods;

public class US_10 {

    CreateOrEditCustomerPage createOrEditCustomerPage = new CreateOrEditCustomerPage();
    ManageCustomerPage manageCustomerPage = new ManageCustomerPage();
    Faker faker = new Faker();
    //1
    @Given("user clicks in address box")
    public void user_clicks_in_address_box() {
        createOrEditCustomerPage.createAddress.click();
    }

    @Given("user clicks in city box")
    public void user_clicks_in_city_box() {
        createOrEditCustomerPage.createCity.click();
    }
    @Then("verify error message {string}")
    public void verify_error_message(String string) {
        Assert.assertTrue(createOrEditCustomerPage.blankAddressError.isDisplayed());
    }

    //2
    @Then("verify error message under city box {string}")
    public void verifyErrorMessageUnderCityBox(String arg0) {
        Assert.assertTrue(createOrEditCustomerPage.blankCityError.isDisplayed());

    }

    //3
    @Given("user type all valid data without country")
    public void user_type_all_valid_data_without_country() {
        createOrEditCustomerPage.createFirstName.sendKeys("Ahmet");
        createOrEditCustomerPage.createLastName.sendKeys("Kutlar");
        createOrEditCustomerPage.createMiddleInitial.sendKeys("Beni");
        createOrEditCustomerPage.createEmail.sendKeys("ahmetkutlarbeni@gmail.com");
        createOrEditCustomerPage.createMobPhonNum.sendKeys("789-987-2585");
        createOrEditCustomerPage.createPhonNum.sendKeys("602-456-8564");
        createOrEditCustomerPage.createZipCode.sendKeys("79586");
        createOrEditCustomerPage.createAddress.sendKeys("Flower St. 45");
        createOrEditCustomerPage.createCity.sendKeys("Yorky");
        String a = ""+faker.number().numberBetween(1000,9999);
        createOrEditCustomerPage.createSSN.sendKeys("711-85-"+a);
        createOrEditCustomerPage.createDate.sendKeys("05.01.2021 00:00");
        createOrEditCustomerPage.searchState.sendKeys("NewYork");

    }

    @Given("user clicks on save button")
    public void user_clicks_on_save_button() {
        createOrEditCustomerPage.SaveButton.click();

    }
    @Then("verify success massege not displayed")
    public void verify_success_massege_not_displayed() {
        Assert.assertFalse(manageCustomerPage.headingID.isDisplayed());
    }

    //4
    @Given("user type all valid data without state")
    public void userTypeAllValidDataWithoutState() {
        createOrEditCustomerPage.createFirstName.sendKeys("Ahmet");
        createOrEditCustomerPage.createLastName.sendKeys("Kutlar");
        createOrEditCustomerPage.createMiddleInitial.sendKeys("Beni");
        createOrEditCustomerPage.createEmail.sendKeys("ahmetkutlarbeni@gmail.com");
        createOrEditCustomerPage.createMobPhonNum.sendKeys("789-987-2585");
        createOrEditCustomerPage.createPhonNum.sendKeys("602-456-8564");
        createOrEditCustomerPage.createZipCode.sendKeys("79586");
        createOrEditCustomerPage.createAddress.sendKeys("Flower St. 45");
        createOrEditCustomerPage.createCity.sendKeys("Yorky");
        String a = ""+faker.number().numberBetween(1000,9999);
        createOrEditCustomerPage.createSSN.sendKeys("711-85-"+a);
        createOrEditCustomerPage.createDate.sendKeys("05.01.2021 00:00");
        createOrEditCustomerPage.searchCountry.sendKeys("USA");

    }
}
