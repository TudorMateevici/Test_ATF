package stepDefinitions;

import enums.keys;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apiguardian.api.API;
import preconditions.APISetup;
import preconditions.ScenarioContext;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class TestFeatureTwoAPI {
    private static Response response;

    // Logger for logging messages
    private static final Logger logger = LogManager.getLogger(TestFeatureTwoAPI.class);

    //  @TC_3_POST_CALL

    @Given("authentication API call done")
    public void authenticationAPICallDoneAndTokenIsGenerated(){
        Object token = (ScenarioContext.getInstance().getValueFromContext(keys.TOKEN));
        logger.info("Token: " + token);
    }

    @When("a POST request is sent with the proper json file")
    public void aPOSTRequestIsSentWithTheProperJsonFile() throws IOException {
        APISetup.resfullBookerPostCall();
        logger.info("POST request sent with: " + APISetup.responseBody);
    }

    @Then("new record created successfully and status code {int} with booking ID are returned in response")
    public void newRecordCreatedSuccessfullyAndResponseStatusCodeWithBookingIDIsReturnedInResponse(int expectedStatusCode) throws IOException {
        assertEquals("Assertion Failed", expectedStatusCode, APISetup.statusCode);
        logger.info("Response status code: " + APISetup.statusCode);
        logger.info("New booking ID: " + APISetup.getBookingId());
    }

    @Given("a POST request already done")
    public void aPOSTRequestAlreadyDone() throws IOException {
        // Perform a POST request and save the booking ID in ScenarioContext
        APISetup.resfullBookerPostCall();
        logger.info("New Booking ID: " + APISetup.getBookingId());
    }

    //  @TC_4_GET_CALL

    @When("a GET request is sent to endpoint {string} with the required booking id")
    public void aGETRequestIsSentToEndpointWithTheRequiredBookingId(String endpoint) throws IOException {
        // Perform a GET request using the booking ID from ScenarioContext
        RequestSpecification retrieveRequest =
             given()
            .contentType("application/json")
                     .basePath(endpoint);
        response = retrieveRequest.get(APISetup.getBookingId());
        logger.info("Booking ID: " + APISetup.getBookingId());
    }

    @Then("in response all info related to the used booking id should be displayed")
    public void inResponseAllInfoRelatedToTheUsedBookingIdShouldBeDisplayed() {
        logger.info("Booking reservation info: " + response.getBody().asPrettyString());

    }

    // @TC_5_DELETE_CALL

    @When("a DELETE request is sent to endpoint {string} with the required booking id")
    public void aDELETERequestIsSentToEndpointWithTheRequiredBookingId(String endpoint){
        Object token = ScenarioContext.getInstance().getValueFromContext(keys.TOKEN).toString();
        logger.info("Token: " + token);
        RequestSpecification deleteRequest =
                given()
                        .contentType("application/json")
                        .basePath(endpoint)
                        .header("Cookie", token);
        response = deleteRequest.delete(APISetup.getBookingId());
        logger.info("Booking ID: " + APISetup.getBookingId());
    }

    @Then("in response status code {int} with message: {string} should be displayed")
    public void inResponseStatusCodeWithMessageShouldBeDisplayed(int expectedStatusCode, String expectedMessage) {
        assertEquals("Assertion Failed !!!",expectedStatusCode, response.getStatusCode());
        assertEquals("Assertion Failed !!!", expectedMessage, response.getBody().asPrettyString());
        logger.info("Status code: " + response.getStatusCode() + " " + "Response body: " + response.getBody().asPrettyString());
    }

//    @Test
//    public void auth(){
//        APISetup.userAuthentication();
//        Object token = (ScenarioContext.getInstance().getValueFromContext(keys.TOKEN));
//        logger.info("Token: " + token);
//    }
}
