package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import pojos.Applicant;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static io.restassured.RestAssured.given;

public class US_23 {
    Response response;
    Applicant[] applicants;

    ObjectMapper objectMapper = new ObjectMapper();
    SoftAssert softAssert = new SoftAssert();


    @Given("user sets and reads applicants endPoint with valid token")
    public void user_sets_and_reads_applicants_end_point_with_valid_token() {
        response = given().contentType(ContentType.JSON).auth().oauth2(ConfigReader.getProperty("token")).
                when().get(ConfigReader.getProperty("applicant_endpoint"));
        //response.prettyPrint();

    }

    @Given("user reads registrants you created and validate them from your data set")
    public void user_reads_registrants_you_created_and_validate_them_from_your_data_set() throws IOException {
        String [] expectedApplicants = {"Emily","Orhan","ali","Peter","Ibrahim"};
        List<String> expectedApplicants1 = Arrays.asList(expectedApplicants);

        applicants = objectMapper.readValue(response.asString(), Applicant[].class);
        List<String> actualApplic = new ArrayList<>();
        for (int i = 0; i<applicants.length; i++){
            actualApplic.add(applicants[i].getFirstName());
        }
        softAssert.assertTrue(actualApplic.containsAll(expectedApplicants1));
        softAssert.assertAll();



    }

    @Then("User can read and validate each registrants one by one from your database")
    public void user_can_read_and_validate_each_registrants_one_by_one_from_your_database() throws IOException {

        String [] expectedApplicants = {"Emily","Orhan","ali","Peter","Ibrahim"};
        List<String> expectedApplicants1 = Arrays.asList(expectedApplicants);

        applicants = objectMapper.readValue(response.asString(), Applicant[].class);
        List<String> actualApplic = new ArrayList<>();
        for (int i = 0; i<applicants.length; i++){
            actualApplic.add(applicants[i].getFirstName());
        }

        for (int j = 0; j<expectedApplicants1.size(); j++){
            softAssert.assertTrue(actualApplic.contains(expectedApplicants1.get(j)));
            softAssert.assertAll();


        }

    }

}
