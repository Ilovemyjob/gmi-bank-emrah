package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
public RegistrationPage(){
    PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id = "account-menu")
    public WebElement accountmenu;
    @FindBy(xpath = "//a[@class='dropdown-item'][2]")
    public WebElement register;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn;
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstname;
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastname;
    @FindBy(xpath = "//input[@id='address']")
    public WebElement address;
    @FindBy(xpath = "//input[@id='mobilephone']")
    public WebElement mobilephone;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement firstPassword;
    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement secondPassword;
    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement registerbutton;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement ssntextinvalid;
    @FindBy(xpath = "//div[contains(text(),'Your mobile phone number is invalid')]")
    public WebElement mobilephonetextinvalid;
    @FindBy(xpath = "//div[contains(text(),'This field is invalid')]")
    public WebElement emailtextinvalid;

    @FindBy(xpath = "//div[contains(text(),'Your email is required.')]")
    public WebElement emailtext;
    @FindBy(xpath = "//div[contains(text(),'Your address is required')]")
    public WebElement addresstext;
    @FindBy(xpath = "//div[contains(text(),'Your mobilephone is required')]")
    public WebElement mobilephonetext;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement ssntext;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement firstnametext;
    @FindBy(xpath = "//div[contains(text(),'Your Last Name is required')]")
    public WebElement lastnametext;
    @FindBy(xpath = "//div[contains(text(),'Your username is required')]")
    public WebElement usernametext;
    @FindBy(xpath = "//div[contains(text(),'Your password is required.')]")
    public WebElement passwordtext;
    @FindBy(xpath = "//div[contains(text(),'Your confirmation password is required.')]")
    public WebElement newpasswordtext;
    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    public WebElement message;

    @FindBy(xpath = "//*[contains(text(),'Registration saved!')]")
    public WebElement greenApproveMessage;

}

