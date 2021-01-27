package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class EmployeePage {
    public EmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "entity-menu")
    public WebElement myOperationSegment;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement manageAccountAsEmployee;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement manageCustomerAsEmployee;
    

}
