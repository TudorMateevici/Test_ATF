package preconditions;

import java.util.HashMap;
import java.util.Map;
import enums.keys;

public class ScenarioContext {
        // Singleton instance to ensure a single instance of ScenarioContext
        private static ScenarioContext instance;

        // Declaration of a generic collection to store context values
        private final Map<keys, Object> scenarioContext;
        // Private constructor to initialize the scenarioContext as a HashMap
        private ScenarioContext() {
            scenarioContext = new HashMap<>();
        }

        // Singleton pattern: Method to get or create the singleton instance
        public static ScenarioContext getInstance() {
            if (instance == null) {
                instance = new ScenarioContext();
            }
            return instance;
        }
        // Method to save a key-value pair to the scenario context
        public void saveValueToContext(keys key, Object value) {
            scenarioContext.put(key, value);
        }
        // Method to retrieve a value from the scenario context based on the key
        public Object getValueFromContext(keys key) {
            return scenarioContext.get(key);
        }
        // Method to clear the entire scenario context
        public void clearContext() {
            scenarioContext.clear();
        }
    }

