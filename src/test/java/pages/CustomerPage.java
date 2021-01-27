package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CustomerPage {
    public CustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[contains(text(),'My Operations')]")
    public WebElement My_Operation;

    @FindBy(xpath = "//a[contains(text(),'Transfer Money')]")
    public WebElement Transfer_Money;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement fromAccount;

    @FindBy(xpath = "//select[@id='toAccountId']")
    public WebElement toAccount;

    @FindBy(xpath = "//input[@id='balance']")
    public WebElement Balance;


    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement Description;

    @FindBy(xpath = "//button[@id='make-transfer']")
    public WebElement MakeTransfer;

    @FindBy(xpath = "//div[contains(text(),'This field is required.')]")
    public WebElement description_required;

    @FindBy(xpath = "//div[contains(text(),'Transfer is succesfull')]")
    public WebElement successfull;


}
