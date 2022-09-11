package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class CorrectValueMap {
    private static Properties properties = new Properties();

    static {
        try {
//            Path path = Paths.get(System.getProperty("user.dir"),"src", "main", "java", "utilities", "characters.properties");
            Path path = Paths.get(System.getProperty("user.dir"), "characters.properties");
            System.out.println(path);
            InputStream input = new FileInputStream(path.toString());
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getValue(String key) {
        return properties.getProperty(key);
    }
}
