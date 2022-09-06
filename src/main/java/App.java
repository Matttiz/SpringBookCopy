import utils.CorrectValueMap;
import utils.Encoder;
import utils.ReadFile;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

       Path path = Paths.get(System.getProperty("user.dir"),"src", "main", "resources", "orginal.txt");
       String primal = ReadFile.read(path.toString());

//       String primal = "\uE01D\uE020\uE049\uE048\uE040\uE043\uE041\uE04F\uE04C\uE03B\uE04E\uE043\uE049\uE048\n" +
//               "\uE01D\uE020\uE049\uE047\uE04A\uE049\uE048\uE03F\uE048\uE04E\uE030\uE03D\uE03B\uE048";
       List<String> arrayOfPrimalChars = Encoder.encodedList(primal);
       String decodedString =  Encoder.decode(arrayOfPrimalChars);
       System.out.println();
       System.out.println(decodedString);
    }
}
