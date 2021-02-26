package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.States;
import utilities.ConfigReader;
import utilities.ReadToTxt;
import utilities.WriteToTxt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;

public class US_22 {
        Response response_post;

        States[] states;

    @Given("User set the state api end point with valid token")
    public void user_set_the_state_api_end_point_with_valid_token() {
        response_post=given().
              auth().
              oauth2(ConfigReader.getProperty("token")).
              when().
              get(ConfigReader.getProperty("states_endpoint"));

    //    response_post.prettyPrint();

    }
    List<Integer> actualAllStates = new ArrayList<>();

    @Given("User deserilializing all data to Java")
    public void user_deserilializing_all_data_to_java() throws IOException {
       // JsonPath jsonPath = response_post.jsonPath();
        //jsonPath.prettyPrint();
        //   jsonPath.get();

        ObjectMapper objectMapper = new ObjectMapper();
        states=objectMapper.readValue(response_post.asString(), States[].class);
    //    System.out.println(states.toString());
      //  System.out.println(states[0].getId().toString());

        for (int i = 0; i < states.length; i++) {
            if(states[i].getId()!=null){
                actualAllStates.add(states[i].getId());
            }
        }
        System.out.println(actualAllStates);

    }

    @Given("User set all state information to related files")
    public void user_set_all_state_information_to_related_files() {

        WriteToTxt.statesInfo("C:\\Users\\Administrator\\IdeaProjects\\gmi-bank-emrah\\StatesInfo.txt",states);
    }
    List<Integer> expectedAllStates= ReadToTxt.returnAllStates("C:\\Users\\Administrator\\IdeaProjects\\gmi-bank-emrah\\StatesInfo.txt");

    @Given("User validata states from data set")
    public void user_validata_states_from_data_set() {
        System.out.println(expectedAllStates);

        Assert.assertEquals("not verift",expectedAllStates ,actualAllStates);
        //Assert.assertTrue(actualAllStates.containsAll(expectedAllStates));
    }

    @Given("User validate states one by one")
    public void user_validate_states_one_by_one() {

        for (int i = 0; i < states.length; i++) {
            if(states[i].getId()!=null) {
               // Assert.assertTrue(states[i].getName().contains(expectedAllStates.get(i)));



            }}


    }
}
