package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Countries;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_26 {
    Response response;

    @Given("User enter Api endpoint  {string}")
    public void user_enter_api_endpoint(String endPoint) {
        response = given().contentType(ContentType.JSON).auth().oauth2(ConfigReader.getProperty("token")).
                when().get(endPoint);
        //response.prettyPrint();

    }

    @Given("User can PATCH request to REST API with endpoint {string} and id {int}")
    public void user_can_patch_request_to_rest_api_with_endpoint_and_id(String countryName, int id) {
       Map<String ,Object> countryPatch = new HashMap<>();
       countryPatch.put("id", id);
        countryPatch.put("name" , countryName);
        countryPatch.put("state" , null);

        response= given().contentType(ContentType.JSON).auth().oauth2(ConfigReader.getProperty("token")).
                when().body(countryPatch).put("https://www.gmibank.com/api/tp-countries/22316");
       System.out.println(response.getStatusCode());

        System.out.println("******************************************************");

        System.out.println(response.getBody().toString());

    }
    @Then("User verifies the updated country")
    public void user_verifies_the_updated_country() {
        int id = 22316;
        Countries contryup = new Countries("France", null);
        response= given().contentType(ContentType.JSON).auth().oauth2(ConfigReader.getProperty("token")).
                when().get(ConfigReader.getProperty("countries_endpoint") + "/" + id);
        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(contryup.getName(), jsonPath.getString("name"));


    }
}
