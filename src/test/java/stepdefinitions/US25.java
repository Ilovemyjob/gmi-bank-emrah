package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

    public class US25 {

        Response response_get;
        Response response_post;
        @Given("User set country endPoint with valid token")
        public void userSetCountryEndPointWithValidToken() {
            response_get=given().
                    contentType(ContentType.JSON).
                    auth().
                    oauth2(ConfigReader.getProperty("token")).
                    when().
                    get(ConfigReader.getProperty("countries_endpoint"));
            //    response.prettyPrint();
        }

        @And("User can Just create each country {int} by {int}")
        public void userCanJustCreateEachCountryBy(int arg0, int arg1) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", "Emr");
            map.put("states", null);
            response_post=given().
                    contentType(ContentType.JSON).
                    auth().
                    oauth2(ConfigReader.getProperty("token")).
                    when().
                    body(map).
                    post(ConfigReader.getProperty("countries_endpoint"));
            response_post.prettyPrint();
        }
        @Then("User validate country which is created")
        public void userValidateCountryWhichIsCreated() {
            Assert.assertTrue(response_post.asString().contains("Emr"));
        }
    }

