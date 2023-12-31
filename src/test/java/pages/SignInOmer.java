package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignInOmer {
    public SignInOmer(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (name = "username")
    public WebElement username;

    @FindBy (name = "password")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement sign_in;
}
