package stepDefinitions;

import browsers.WebDriverSetup;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import preconditions.APISetup;
import preconditions.ScenarioContext;


public class Hooks {

    // Logger for logging messages
    private static final Logger logger = LogManager.getLogger(Hooks.class);

    // Before hook: Initialize logger and perform clear before any test run

    @Before
    public static void beforeScenario(Scenario scenario) {
        ScenarioContext.getInstance().clearContext();
        String currentScenarioName = scenario.getName();
        logger.info("Logger initialized for scenario: " + currentScenarioName);
    }

    // Before hook with tag "@UI": Initialize setUpDriver method before each UI test
    @Before("@UI")
    public static void openBrowser(){
        WebDriverSetup.setUpDriver();
    }

    // After hook with tag "@UI": Initialize tearDown method after each UI test
    @After("@UI")
    public static void closeBrowser(){
        WebDriverSetup.tearDown();
    }

    // Before hook with tag "@API": Performs API user authentication before each API test
    @Before("@API")
    public static void userAuthenticationRequest(){
        APISetup.userAuthentication();
    }

}
