package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public

class HomePage {
    public HomePage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id = "account-menu")
    public WebElement userIcon;
    @FindBy(id = "login-item")
    public WebElement signIn;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement register;
    @FindBy(xpath = "(//li[@class='dropdown show nav-item']/div/a)[1]")
    public WebElement userInfoLink;
}
