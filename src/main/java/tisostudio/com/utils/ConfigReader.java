package tisostudio.com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();

    // load props
    static {
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/application.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load application.properties file.");
        }
    }

    /**
     * Retrieves the property value for a given key from the loaded properties.
     *
     * @param key The property key to look up.
     * @return The corresponding property value as a String.
     */
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
