package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CustomerPageOmer {
    public CustomerPageOmer(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@class])[8]")
    public WebElement My_Operations;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement My_Accounts;

    @FindBy(xpath = "(//td//button[@type='button'])[1]")
    public WebElement View_Transaction1;

    @FindBy(xpath = "(//td//button[@type='button'])[2]")
    public WebElement View_Transaction2;

    @FindBy(xpath = "(//td//button[@type='button'])[3]")
    public WebElement View_Transaction3;

    @FindBy(xpath = "(//td//button[@type='button'])[4]")
    public WebElement View_Transaction4;





}
