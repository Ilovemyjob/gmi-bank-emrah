package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_07 {
    public US_07(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement login;
    @FindBy(id = "login-item")
    public WebElement SignIn;
    @FindBy(id = "username")
    public WebElement usernameBox;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInButton;
    @FindBy(xpath = "(//li[@class])[8]")
    public WebElement My_Operations;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[0]")
    public WebElement Manage_Customers;
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])")
    public WebElement editButton;
    @FindBy(id = "tp-customer-email")
    public WebElement emailBox;
    @FindBy(id = "save-entity")
    public WebElement save;
    @FindBy(xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])")
    public WebElement userAccountName;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement signOutBtn;
    @FindBy(id = "username")
    public WebElement usernameBoxAdmin;
    @FindBy(id = "password")
    public WebElement passwordBoxAdmin;
    @FindBy(xpath = "(//li[@class])[9]")
    public WebElement Administration;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement User_Management;
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])")
    public WebElement editBtn;
    @FindBy (id = "langKey")
    public WebElement languageSelect;

}
