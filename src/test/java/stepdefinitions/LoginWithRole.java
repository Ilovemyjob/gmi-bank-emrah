package stepdefinitions;


import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class LoginWithRole {
    @Given("login as a customer")
    public void login_as_a_customer() {
        ReusableMethods.signInToApp(ConfigReader.getProperty("Customer_username"),
                ConfigReader.getProperty("Customer_password"));
    }

    @Given("login as an employee")
    public void login_as_an_employee() {
        ReusableMethods.signInToApp(ConfigReader.getProperty("Employee_username"),
                ConfigReader.getProperty("Employee_password"));
    }


    @Given("login as an admin")
    public void login_as_an_admin() {
        ReusableMethods.signInToApp(ConfigReader.getProperty("Admin_username"),
                ConfigReader.getProperty("Admin_password"));
    }
}
