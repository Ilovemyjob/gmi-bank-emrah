package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {
    public AdminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//li[@class])[1]")
    public WebElement Home;

    @FindBy(xpath = "(//li[@class])[2]")
    public WebElement Loans;

    @FindBy(xpath = "(//li[@class])[3]")
    public WebElement About_Us;

    @FindBy(xpath = "(//li[@class])[4]")
    public WebElement Services;

    @FindBy(xpath = "(//li[@class])[5]")
    public WebElement Blog;

    @FindBy(xpath = "(//li[@class])[6]")
    public WebElement About;

    @FindBy(xpath = "(//li[@class])[7]")
    public WebElement Contact;

    @FindBy(xpath = "(//li[@class])[8]")
    public WebElement My_Operations;

    @FindBy(xpath = "(//li[@class])[9]")
    public WebElement Administration;

    @FindBy(xpath = "(//li[@class])[10]")
    public WebElement User_Name;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement Manage_Customer;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement Manage_Accounts;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement User_Management;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[4]")
    public WebElement Metrics;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
    public WebElement Health;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[6]")
    public WebElement Configuration;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[7]")
    public WebElement Audits;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[8]")
    public WebElement Logs;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[9]")
    public WebElement User_Info;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[10]")
    public WebElement Password;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[11]")
    public WebElement Sign_Out;

    @FindBy (xpath = "//span[@class]/span[.='Edit']")
    public WebElement Edit;
}
