package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public

class HomePage {
    public HomePage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id = "account-menu")
    public WebElement userIcon;
    @FindBy(id = "login-item")
    public WebElement signIn;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement register;


    @FindBy (xpath = "//li[@id='account-menu']")
    public WebElement accountMenuAfterLogin;
    @FindBy (xpath = "(//a[@class='dropdown-item'])[4]")
    public WebElement passwordManaging;
    @FindBy (xpath = "//input[@name='currentPassword']")
    public WebElement currentPassEditig;
    @FindBy (xpath = "//input[@name='newPassword']")
    public WebElement newPassword;
    @FindBy (xpath = "//input[@name='confirmPassword']")
    public WebElement newPasswordConfirm;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement savePasswordButton;
    @FindBy (xpath = "//div[@role='alert']")
    public WebElement greenApproveMessage;
    @FindBy(xpath = "//li[@class='point']")
    public List<WebElement> passwordStrengthScala;

    @FindBy(xpath = "(//li[@class='dropdown show nav-item']/div/a)[1]")
    public WebElement userInfoLink;




    //======================== Manage customer locators============
    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[1]/a")
    public WebElement customersID;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[2]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[3]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[4]")
    public WebElement middleInitial;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[5]")
    public WebElement email;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[6]")
    public WebElement mobilePhoneNumber;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[7]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[8]")
    public WebElement address;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[9]/span")
    public WebElement customersCreateDate;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[10]/div/a[1]")
    public WebElement customersView;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[10]/div/a[2]")
    public WebElement customersEdit;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[10]/div/a[3]")
    public WebElement customersDelete;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div/a[2]")
    public WebElement editButton;

    @FindBy(xpath = "//div[@class='modal-body']/span")
    public WebElement deleteAlertMessage;

    @FindBy(xpath = "//*[@id='jhi-confirm-delete-tPCustomer']")
    public WebElement alertDeleteButton;
    @FindBy(xpath = "//a[@class='dropdown-item active']")
    public WebElement manageCustomerSegment;
    // customer view page element
    @FindBy(tagName = "h2")
    public WebElement viewPageText;
    //create or edit customer paage element
    @FindBy(id = "gmibankfrontendApp.tPCustomer.home.createOrEditLabel")
    public WebElement editPageText;
    @FindBy(id = "tp-customer-firstName")
    public WebElement firstNameForEditable;
    @FindBy(id = "save-entity")
    public WebElement saveButtonEditPage;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement succesPopUP;

}
