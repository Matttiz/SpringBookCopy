import utilities.Encoder;
import utilities.FileUtilities;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class App {
    public static void main(String[] args) {
       Path pathToOriginal = Paths.get(System.getProperty("user.dir"),"src", "main", "resources", "original", "listing1.6.txt");
       String primal = FileUtilities.read(pathToOriginal.toString());
       List<String> arrayOfPrimalChars = Encoder.encodedList(primal);
       String decodedString =  Encoder.decode(arrayOfPrimalChars);
       System.out.println();
       System.out.println(decodedString);
       Path pathToConvert = Paths.get(System.getProperty("user.dir"),"src", "main", "resources", "convert", pathToOriginal.getFileName().toString());
       FileUtilities.write(pathToConvert.toString(), decodedString);
    }
}
