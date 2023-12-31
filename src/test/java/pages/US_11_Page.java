package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_11_Page {
    public US_11_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement userIcon;
    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement signIn;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement signInButton;
    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperations;
    @FindBy(xpath="//span[.='Manage Customers']")
    public WebElement manageCustomer;
    @FindBy(id = "jh-create-entity")
    public WebElement createNewCustomer;
    @FindBy(id = "tp-customer-createDate")
    public WebElement CreateDateBox;
    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOut;
    @FindBy (id = "tp-customer-user")
    public WebElement dropBox;
    @FindBy(xpath="//*[@id=\"tp-customer-account\"]")
    public WebElement accountDropBox;
    @FindBy (id="tp-customer-zelleEnrolled")
    public WebElement zelleEnrolledBox;
    @FindBy(id="save-entity")
    public WebElement saveButton;
    @FindBy(xpath="//*[@id=\"createDateLabel\"]/span")
    public WebElement coloredText;
}

