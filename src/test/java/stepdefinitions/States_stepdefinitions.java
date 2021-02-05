package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;

import java.util.List;

import static io.restassured.RestAssured.given;

public class States_stepdefinitions {
    Response response;
    @Given("user sets and reads states endPoint with valid token")
    public void user_sets_and_reads_states_end_point_with_valid_token() {
         response=given().auth().oauth2(ConfigReader.getProperty("token")).when().get(ConfigReader.getProperty("states_endpoint"));
         response.prettyPrint();
    }

    @Given("user delete each state one by one")
    public void user_delete_each_state_one_by_one()  {
        int[] deletedStatesIds={73696,73697,73698,73699,73700};

        for (int  id:deletedStatesIds){
              response=given().auth().oauth2(ConfigReader.getProperty("token")).when().delete(ConfigReader.getProperty("states_endpoint")+"/"+id);
              Assert.assertEquals(204,response.getStatusCode());
    }

    }

    @Then("user verifies that each state is deleted")
    public void user_verifies_that_each_state_is_deleted() {
        response=given().auth().oauth2(ConfigReader.getProperty("token")).when().get(ConfigReader.getProperty("states_endpoint"));

        JsonPath jsonPath=response.jsonPath();
        List<Integer> statesIds= jsonPath.getList("id");
        int[] deletedStatesIds={73696,73697,73698,73699,73700};
        for(int id:deletedStatesIds){
            Assert.assertFalse(statesIds.contains(id));
        }


    }

}
