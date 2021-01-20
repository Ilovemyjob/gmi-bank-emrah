package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPageOmer {

    public RegistrationPageOmer() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "firstPassword")
    public WebElement password;

    @FindBy(xpath = "(//li[@class='point'])[1]")
    public WebElement passwordStrentgh1;

    @FindBy(xpath = "(//li[@class='point'])[2]")
    public WebElement passwordStrentgh2;

    @FindBy(xpath = "(//li[@class='point'])[3]")
    public WebElement passwordStrentgh3;

    @FindBy(xpath = "(//li[@class='point'])[4]")
    public WebElement passwordStrentgh4;

    @FindBy(xpath = "(//li[@class='point'])[5]")
    public WebElement passwordStrentgh5;


}
