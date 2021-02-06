package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.States;
import utilities.ConfigReader;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class US_24 {

    Response responseGet;
    Response responsePost;

    @Given("User enter API endpoint {string}")
    public void user_enter_api_endpoint(String string) {
        responseGet =
                given().contentType(ContentType.JSON).
                        auth().oauth2(ConfigReader.getProperty("token")).
                        when().
                        get(string);
    }

    @Given("User verifies statusCode as {string} and content type as {string}")
    public void user_verifies_status_code_as_and_content_type_as(String string, String string2) {
        responseGet.then().assertThat().statusCode(200).contentType(ContentType.JSON);

    }

    @Given("User send a POST request to REST API {string} as {string}")
    public void user_send_a_post_request_to_rest_api_as(String string, String string2) {
        States states = new States("ZK", null);
        responsePost =
                given().contentType(ContentType.JSON).
                        auth().oauth2(ConfigReader.getProperty("token")).
                        when().
                        body(states).
                        post(string);
        responsePost.prettyPrint();
    }

    @Then("User verifies the created state {string}")
    public void user_verifies_the_created_state(String string) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        States states[] = objectMapper.readValue(responseGet.asString(), States[].class);

        Assert.assertEquals(states[states.length - 1].getName(), string);
//      List<String> listOfStates = responsePost.as(ArrayList.class);
//      Assert.assertEquals(string, states[0].getName());
//      responsePost.then().assertThat().body("name", Matchers.hasItem("ZK"));
//      JsonPath jsonPath = responsePost.jsonPath();
//      Assert.assertTrue(listOfStates.contains("ZK"));
    }
}
