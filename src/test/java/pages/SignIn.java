package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignIn {
    public SignIn(){ PageFactory.initElements(Driver.getDriver(),this); }
    @FindBy(id = "username")
    public WebElement usernameBox;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInButton;
    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement cancelButton;
    @FindBy(xpath = "(//div[@class='alert alert-warning fade show'])[1]")
    public WebElement forgetPassword;
    @FindBy(xpath = "(//div[@class='alert alert-warning fade show'])[2]")
    public WebElement registerButton;
}
