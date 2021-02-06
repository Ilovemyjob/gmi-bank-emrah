package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.States;
import utilities.ConfigReader;

import javax.swing.plaf.nimbus.State;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    @Given("User deserilializing all data to Java")
    public void user_deserilializing_all_data_to_java() throws IOException {
        JsonPath jsonPath = response_post.jsonPath();

        //jsonPath.prettyPrint();
        //   jsonPath.get();

        ObjectMapper objectMapper = new ObjectMapper();
        states=objectMapper.readValue(response_post.asString(), States[].class);
    //    System.out.println(states.toString());
        List<Object> allList = new ArrayList<>();
      //  System.out.println(states[0].getId().toString());


        for (int i = 0; i < states.length; i++) {
            if(states[i].getId()!=null){
                allList.add(states[i].getId());
//            allList.add(states[i].getTpcountry());
//            allList.add(states[i].getName());

            }


        }

        System.out.println(allList);


    }

    @Given("User set all state information to related files")
    public void user_set_all_state_information_to_related_files() {



    }

    @Given("User validata states from data set")
    public void user_validata_states_from_data_set() {

    }

    @Given("User validate states one by one")
    public void user_validate_states_one_by_one() {

    }
}
