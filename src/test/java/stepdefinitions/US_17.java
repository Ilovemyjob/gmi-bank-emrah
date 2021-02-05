package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_17 {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    @Given("User enter as Admin")
    public void user_enter_as_admin() {
        homePage.userIcon.click();
        ReusableMethods.waitFor(2);
        homePage.signIn.click();
        loginPage.usernameBox.sendKeys(ConfigReader.getProperty("Admin_username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("Admin_password"));
        loginPage.signInButton.click();
        ReusableMethods.waitFor(2);
    }

    @Given("Go to User Management")
    public void go_to_user_management() {
        adminPage.Administration.click();
        ReusableMethods.waitFor(2);
        adminPage.User_Management.click();
        ReusableMethods.waitFor(2);


    }

    @Given("Admin can activate a role as user")
    public void admin_can_activate_a_role_as_user() {
adminPage.Edit.click();
      }

    @Given("Admin can activate a role as employee")
    public void admin_can_activate_a_role_as_employee() {
     }

    @Given("Admin can activate a role as manager")
    public void admin_can_activate_a_role_as_manager() {
     }

    @Given("Admin can activate a role as admin")
    public void admin_can_activate_a_role_as_admin() {
    }

    @Given("Admin can view all user info \\(admin, manager, employee and user)")
    public void admin_can_view_all_user_info_admin_manager_employee_and_user() {
    }

    @Given("Admin can edit all user info  \\(admin, manager, employee and user)")
    public void admin_can_edit_all_user_info_admin_manager_employee_and_user() {
    }

    @Given("Admin can delete all user info  \\(admin, manager, employee and user)")
    public void admin_can_delete_all_user_info_admin_manager_employee_and_user() {
    }
}
