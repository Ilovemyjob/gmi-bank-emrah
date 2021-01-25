package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateOrEditCustomerPage {
    public CreateOrEditCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

        @FindBy (xpath = "//*[@id=\"search-ssn\"]")
        public WebElement searchSSN;
        @FindBy (xpath = "(//button[@type=\"button\"])[2]")
        public WebElement searchSSNbutton;
        @FindBy (id = "tp-customer-firstName")
        public WebElement createFirstName;
        @FindBy (id = "tp-customer-lastName")
        public WebElement createLastName;
        @FindBy (id = "tp-customer-middleInitial")
        public WebElement createMiddleInitial;
        @FindBy (id = "tp-customer-email")
        public WebElement createEmail;
        @FindBy (id = "tp-customer-mobilePhoneNumber")
        public WebElement createMobPhonNum;
        @FindBy (id = "tp-customer-phoneNumber")
        public WebElement createPhonNum;
        @FindBy (id = "tp-customer-zipCode")
        public WebElement createZipCode;
        @FindBy (id = "tp-customer-address")
        public WebElement createAddress;
        @FindBy (id = "tp-customer-city")
        public WebElement createCity;
        @FindBy (id = "tp-customer-ssn")
        public WebElement createSSN;
        @FindBy (id = "tp-customer-createDate")
        public WebElement createDate;
        @FindBy (id = "tp-customer-country")
        public WebElement searchCountry;
        @FindBy (id = "tp-customer-state")
        public WebElement searchState;
        @FindBy (id = "tp-customer-user")
        public WebElement searchUser;
        @FindBy (id = "tp-customer-account")
        public WebElement chooseAccount;
        @FindBy (id = "tp-customer-zelleEnrolled")
        public WebElement checkBox;
        @FindBy (id = "cancel-save")
        public WebElement buttonBack;
        @FindBy (id = "save-entity")
        public WebElement searchSave;

}
