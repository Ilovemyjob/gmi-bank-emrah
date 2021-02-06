package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.DatabaseConnector;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US_29 {
    ResultSet resultSetUser;
    String userDataQuery = "SELECT * FROM " + ConfigReader.getProperty("usersTableName");
    List<String> userFirstName = new ArrayList<>();

    ResultSet resultSetCountry;
    String countriesDataQuery = "SELECT *  FROM " + ConfigReader.getProperty("countriesTableName");
    List<String> countryList = new ArrayList<>();

    ResultSet resultSetStates;
    String statesDataQuery = "SELECT * FROM " + ConfigReader.getProperty("statesTableName");
    List<String> statesList = new ArrayList<>();

    // ******************************************************Background
    @Given("User connects GMI database")
    public void user_connects_gmi_database() {
        resultSetUser = DatabaseConnector.getResultSet(userDataQuery);
        resultSetCountry = DatabaseConnector.getResultSet(countriesDataQuery);
        resultSetStates = DatabaseConnector.getResultSet(statesDataQuery);
    }

    // ******************************************************@T28_164
    @Given("User read all user data from database")
    public void user_read_all_user_data_from_database() throws SQLException {
        ResultSetMetaData userMetaData = resultSetUser.getMetaData();
        int columnCount = userMetaData.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.println(userMetaData.getColumnName(i));
        }

        while (resultSetUser.next()) {
            String firstname = resultSetUser.getString("first_name");
            userFirstName.add(firstname);
        }

        System.out.println(userFirstName);
    }


    @Then("user validate all user data")
    public void user_validate_all_user_data() throws SQLException {

        String userFirstnameQuery = "SELECT first_name FROM " + ConfigReader.getProperty("usersTableName");
        resultSetUser = DatabaseConnector.getResultSet(userFirstnameQuery);
        List<String> actualFirstName = new ArrayList<>();

        while (resultSetUser.next()) {
            String firstname = resultSetUser.getString("first_name");
            actualFirstName.add(firstname);
        }

        Assert.assertEquals(userFirstName, actualFirstName);
    }


    // ****************************************************** @T28_165
    @Given("User read all countries infos from database")
    public void user_read_all_countries_infos_from_database() throws SQLException {

        ResultSetMetaData countryMetaData = resultSetCountry.getMetaData();
        int columnCount = countryMetaData.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.println(countryMetaData.getColumnName(i));
        }

        while (resultSetCountry.next()) {
            String country = resultSetCountry.getString("name");
            countryList.add(country);
        }

        System.out.println(countryList);
    }

    @Then("user validate all countries infos")
    public void user_validate_all_countries_infos() throws SQLException {

        String countryNameQuery = "SELECT name FROM " + ConfigReader.getProperty("countriesTableName");
        resultSetCountry = DatabaseConnector.getResultSet(countryNameQuery);
        List<String> actualCountry = new ArrayList<>();

        while (resultSetCountry.next()) {
            String firstname = resultSetCountry.getString("name");
            actualCountry.add(firstname);
        }

        Assert.assertEquals(countryList, actualCountry);

    }

    // ******************************************************* @T28_166
    @Given("User read all states of related to USA from database")
    public void user_read_all_states_of_related_to_usa_from_database() throws SQLException {

        ResultSetMetaData statesMetaData = resultSetStates.getMetaData();
        int columnCount = statesMetaData.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.println(statesMetaData.getColumnName(i));
        }

        String statesDataQuery = "SELECT * FROM public.tp_state WHERE name  = 'Washington' ";
        resultSetStates = DatabaseConnector.getResultSet(statesDataQuery);

        while (resultSetStates.next()) {
            String states = resultSetStates.getString("name");
            statesList.add(states);
        }

        System.out.println(statesList);
    }

    @Then("user validate all states of related to USA")
    public void user_validate_all_states_of_related_to_usa() throws SQLException {

        String statesDataQuery = "SELECT * FROM public.tp_state";
        resultSetStates = DatabaseConnector.getResultSet(statesDataQuery);
        List<String> allStatesList = new ArrayList<>();


        while (resultSetStates.next()) {
            String states = resultSetStates.getString("name");
            allStatesList.add(states);
        }

        Assert.assertTrue(allStatesList.containsAll(statesList));
    }
}
