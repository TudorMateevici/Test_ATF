package configuration;

import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.Map;

public class ConfigurationLoader {

//Variable that holds the name of yaml config file
    private static final String configFile = "config.yaml";

/*Method for loading the configuration settings from the YAML file,
and parse the YAML content via SnakeYAML library.
getResourceAsStream method is used for obtaining an input stream for reading the file,
after which the YAML content is then loaded into a Map<String, Object> and returned.*/
    public static Map<String, Object> loadConfig() {
        Yaml yaml = new Yaml();
        InputStream inputStream = ConfigurationLoader.class.getClassLoader().getResourceAsStream(configFile);
        return yaml.load(inputStream);
    }


    /*Method main loads the configuration and returns specific values:
    - driverPath
    - UIUrl
    - APIUrl
    - jsonFile
     From the loaded config map, and prints them out. */
    public static void main(String[] args) {
        Map<String, Object> config = loadConfig();

        String driverPath = (String) config.get("driverPath");
        String UIUrl = (String) config.get("UIUrl");
        String APIUrl = (String) config.get("APIUrl");
        String jsonFile = (String) config.get("jsonFile");

        // Use the configuration values in your test code
        System.out.println("Driver Path Chrome: " + driverPath);
        System.out.println("UI Url " + UIUrl);
        System.out.println("API Url: " + APIUrl);
        System.out.println("json File location: " + jsonFile);
    }

}
