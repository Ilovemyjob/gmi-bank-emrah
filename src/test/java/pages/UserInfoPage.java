package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserInfoPage {
    public UserInfoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="firstName")
    public WebElement firstname;

    @FindBy (id="lastName")
    public WebElement lastName;

    @FindBy (id="email")
    public WebElement email;

    @FindBy (id="langKey")
    public WebElement language;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement save;
}
