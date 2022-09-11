import utilities.Encoder;
import utilities.FileUtilities;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Path pathToOriginal = Paths.get(System.getProperty("user.dir"),"src", "main", "resources", "original", "listing2.6.txt");
        Path pathToConvert = Paths.get(System.getProperty("user.dir"),"src", "main", "resources", "convert", pathToOriginal.getFileName().toString());
        String source;
//        if(args.length > 0) {
//            if (args[0] != null) {
//                source = args[0];
//                System.out.println(System.getProperty("user.dir") + "/"+ source);
//                System.out.println(System.getProperty("user.dir") + "/"+ source);
//                pathToOriginal = Paths.get(System.getProperty("user.dir"), source);
//                pathToConvert = Paths.get(String.valueOf(pathToOriginal.getParent()), "conv_" + pathToOriginal.getFileName().toString());
//            }
//        }
        String primal = FileUtilities.read(pathToOriginal.toString());
        List<String> arrayOfPrimalChars = Encoder.encodedList(primal);
        String decodedString =  Encoder.decode(arrayOfPrimalChars);
        System.out.println();
        System.out.println(decodedString);
        FileUtilities.write(pathToConvert.toString(), decodedString);
    }
}
