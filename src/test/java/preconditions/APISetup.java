package preconditions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
//google external library's for parsing and generation of a json also allows you to convert Java objects into JSON representation and vice versa.
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import configuration.ConfigurationLoader;
import enums.keys;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class APISetup {

    // Load configuration using ConfigurationLoader
    private static final Map<String, Object> config = ConfigurationLoader.loadConfig();

    // Extract APIUrl from configuration file
    public static String APIUrl = (String) config.get("APIUrl");

    // Extract APIUrl json file location from configuration file
    public static String jsonFile = (String) config.get("jsonFile");

    public static String responseBody;


    private static String bookingId;

    public static String getBookingId() {
        return bookingId;
    }

    public static int statusCode;

    public static void userAuthentication() {
        RestAssured.baseURI = APIUrl;
        RequestSpecification authRequest = given()
                .contentType("application/json")
                .body("{\"username\": \"admin\", \"password\": \"password123\"}");
        // Variables to store response
        Response response = authRequest.post("/auth");
        String output = parseTokenFromResponse(response);
        ScenarioContext.getInstance().saveValueToContext(keys.TOKEN,output);
    }
    //Json parser method and data extraction method
    private static String parseTokenFromResponse(Response response) {
        // Clean the response body by removing curly braces and quotes
        String cleanResponse = response.getBody().asPrettyString().replaceAll("[{}\"]", "");
        // Parse the cleaned JSON string into a JsonObject using Gson
        JsonObject jsonObject = new Gson().fromJson("{" + cleanResponse + "}", JsonObject.class);
        // Return the data - example assuming a "token" key in the response
        String token = jsonObject.get("token").getAsString();
        return "token=" + token;
    }
//    Post Call request
    public static void resfullBookerPostCall() throws IOException {
        RestAssured.baseURI = APIUrl;
        // Read the content of the JSON file into a string
        String jsonFileContent = new String(Files.readAllBytes(Paths.get(jsonFile)));
        RequestSpecification postRequest = given()
                .contentType("application/json")
                .body(jsonFileContent);
        Response response = postRequest.post("/booking");
        responseBody = response.getBody().asPrettyString();
        bookingId = response.jsonPath().get("bookingid").toString();
        statusCode = response.getStatusCode();

    }
}
