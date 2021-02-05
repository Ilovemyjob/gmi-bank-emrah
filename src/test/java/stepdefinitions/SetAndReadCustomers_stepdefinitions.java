package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SetAndReadCustomers_stepdefinitions {
    Response response;
    SoftAssert softAssert =new SoftAssert();
    @Given("user set and read customers endpoint with valid token")
    public void user_set_and_read_customers_endpoint_with_valid_token() {
          response=given().
                  auth().oauth2(ConfigReader.getProperty("token")).
                  when().get(ConfigReader.getProperty("customers_endpoint"));
          response.prettyPrint();

    }
    @Given("user verifies customers data  with data set from database")
    public void user_verifies_customers_data_with_data_set_from_database() {
        String[] expectedCustomersName= {"Mariana","Ali","Jacqueline","Wendell"};
        List<String> expectedCustomersNameList = Arrays.asList(expectedCustomersName);

        JsonPath jsonPath =response.jsonPath();

        List<String> customers =jsonPath.getList("firstName");
        softAssert.assertTrue(customers.containsAll(expectedCustomersNameList));

    }

    @Then("user validates customers data one by one from database")
    public void user_validates_customers_data_one_by_one_from_database() {
        String[] expectedCustomersName= {"Mariana","Ali","Jacqueline","Wendell"};
        List<String> expectedCustomersNameList = Arrays.asList(expectedCustomersName);
        JsonPath jsonPath =response.jsonPath();

        List<String> customers =jsonPath.getList("firstName");

        for(String customerName:expectedCustomersNameList){
            softAssert.assertTrue(customers.contains(customerName));
        }
          softAssert.assertAll();
    }
}
