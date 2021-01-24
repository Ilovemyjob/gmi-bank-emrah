package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManageCustomerPage {
    public ManageCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement myOperations;
    //a[@aria-expanded='true']
    @FindBy(id = "tp-customer-heading")
    public WebElement customerPageText;

    @FindBy(id = "jh-create-entity")
    public WebElement createCustomerButton;

    @FindBy(xpath="(//*[@class=\"dropdown-item\"])[2]")
    public WebElement manageAccounts;
    @FindBy(xpath="(//*[@class=\"dropdown-item\"])[1]")
    public WebElement manageCustomers;
    @FindBy(xpath = "(//div//table//tr//th//span)[1]")
    public WebElement headingID;
    @FindBy(xpath = "(//div//table//tr//th//span)[2]")
    public WebElement headingFirstName;
    @FindBy(xpath = "(//div//table//tr//th//span)[3]")
    public WebElement headingLastName;
    @FindBy(xpath = "(//div//table//tr//th//span)[4]")
    public WebElement headingMiddleInitial;
    @FindBy(xpath = "(//div//table//tr//th//span)[5]")
    public WebElement headingEmail;
    @FindBy(xpath = "(//div//table//tr//th//span)[6]")
    public WebElement headingMobPhonNum;
    @FindBy(xpath = "(//div//table//tr//th//span)[7]")
    public WebElement headingPhonNum;
    @FindBy(xpath = "(//div//table//tr//th//span)[8]")
    public WebElement headingAddress;
    @FindBy(xpath = "(//div//table//tr//th//span)[9]")
    public WebElement headingCreateDate;


    @FindBy(xpath = "//th")
    public WebElement listOfHeaders;


}
