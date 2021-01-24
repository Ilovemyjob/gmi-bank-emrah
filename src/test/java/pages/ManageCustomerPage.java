package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManageCustomerPage {
    public ManageCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "tp-customer-heading")
    public WebElement customerPageText;
    @FindBy(id = "jh-create-entity")
    public WebElement createCustomerButton;
    @FindBy(xpath = "//th")
    public WebElement listOfHeaders;


}
