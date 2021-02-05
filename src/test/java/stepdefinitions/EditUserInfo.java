package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.UserInfoPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class EditUserInfo {
    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    //--------------- @PRECOND_T28-137-------------------------

    @Given("user tries to sign in with following attributes")
    public void user_tries_to_sign_in_with_following_attributes(List<Map<String,Object>> dataTable) {
        String username=dataTable.get(0).get("username").toString();
        String password=dataTable.get(0).get("password").toString();
        ReusableMethods.signInToApp(username,password);

    }
    @When("user clicks user name")
    public void user_clicks_user_icon() {
        HomePage homePage= new HomePage();
        homePage.userIcon.click();
        ReusableMethods.waitFor(1);
    }
    @When("user clicks user info from drop down")
    public void user_clicks_user_info_from_drop_down() {
        HomePage homePage= new HomePage();
        //ReusableMethods.waitForVisibility(homePage.userInfoLink,2);
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.userInfoLink.click();
        ReusableMethods.waitFor(1);
    }

    //  ----------------  @TEST_T28-75-----------------

    @Then("UserInfo page should display")
    public void user_info_page_should_display() {
        String expectedUrl= "http://gmibank.com/account/settings";
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());
    }

    //----------------  @TEST_T28-83-------------------------------

    @When("user clicks language dropdown")
    public void user_clicks_language_dropdown() {
        UserInfoPage userInfoPage =new UserInfoPage();
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        userInfoPage.language.click();
        ReusableMethods.waitFor(2);
    }

    @Then("English and Turkish options should display")
    public void english_and_turkish_options_should_display() {
      String english ="English";
      String turkish="Türkçe";
      UserInfoPage userInfoPage =new UserInfoPage();
      Select s = new Select(Driver.getDriver().findElement(By.id("langKey")));
        List<WebElement> op = s.getOptions();
        String actual1 = op.get(0).getText();
        String actual2 =op.get(1).getText();
        Assert.assertEquals(english,actual1);
        Assert.assertEquals(turkish,actual2);

    }

    // ---------------------  @TEST_T28-84-------------------------

    @When("user clicks firstname field")
    public void user_clicks_firstname_field() {
        UserInfoPage userInfoPage = new UserInfoPage();
        userInfoPage.firstname.click();
    }

    @When("user clears existing firstname")
    public void user_clears_existing_firstname() {
        UserInfoPage userInfoPage = new UserInfoPage();
        userInfoPage.firstname.clear();
    }

    @When("^user enters \"(.*?)\" in firstname field$")
    public void user_enters_in_firstname_field(String string) {
        UserInfoPage userInfoPage = new UserInfoPage();
        userInfoPage.firstname.sendKeys(string);
        ReusableMethods.waitFor(2);
    }

    @Then("new username should display in firstname field")
    public void new_username_should_display_in_firstname_field() {
       String expectedName="semih";
       UserInfoPage userInfoPage = new UserInfoPage();
       String actualName= userInfoPage.firstname.getAttribute("value");
       Assert.assertEquals(expectedName,actualName);

    }

    //-----------  @TEST_T28-85-----------------------
    @When("user clicks lastname field")
    public void user_clicks_lastname_field() {
        UserInfoPage userInfoPage = new UserInfoPage();
        userInfoPage.lastName.click();
    }

    @When("user clears existing lastname")
    public void user_clears_existing_lastname() {
        UserInfoPage userInfoPage = new UserInfoPage();
        userInfoPage.lastName.clear();
        ReusableMethods.waitFor(1);
    }

    @When("user enters {string} in lastname field")
    public void user_enters_in_lastname_field(String lastname) {
        UserInfoPage userInfoPage = new UserInfoPage();
        userInfoPage.lastName.sendKeys(lastname);
    }

    @Then("new username should display in lastname field")
    public void new_username_should_display_in_lastname_field() {
        String expectedLastName="kasim";
        UserInfoPage userInfoPage = new UserInfoPage();
        String actualLastName= userInfoPage.lastName.getAttribute("value");
        Assert.assertEquals(expectedLastName,actualLastName);
    }

    //---------------  @TEST_T28-86------------------------------

    @When("user clicks email field")
    public void user_clicks_email_field() {
        UserInfoPage userInfoPage = new UserInfoPage();
        userInfoPage.email.click();
    }

    @When("user clears existing email")
    public void user_clears_existing_email() {
        UserInfoPage userInfoPage = new UserInfoPage();
        userInfoPage.email.clear();
    }

    @When("user enters {string} in email field")
    public void user_enters_in_email_field(String email) {
        UserInfoPage userInfoPage = new UserInfoPage();
        userInfoPage.email.sendKeys(email);
        ReusableMethods.waitFor(1);
    }

    @Then("new email should display in email field")
    public void new_email_should_display_in_email_field() {
        String expectedEmail="fatiheymen31@gmail.com";
        UserInfoPage userInfoPage = new UserInfoPage();
        String actualEmail= userInfoPage.email.getAttribute("value");
        Assert.assertEquals(expectedEmail,actualEmail);
    }

}
