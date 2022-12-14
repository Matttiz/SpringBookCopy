package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Encoder {

    public static List<String> encodedList(String primal) {
        AtomicInteger nbrOfChars = new AtomicInteger(0);
        return new ArrayList<>(primal.chars()
                .mapToObj(myChar -> String.valueOf((char) myChar))
                .collect(Collectors.groupingBy(myChar -> nbrOfChars.getAndIncrement(), Collectors.joining()))
                .values());
    }

    public static String decode(List<String> arrayOfPrimalChars){
        StringBuilder character = new StringBuilder();
        String decodedString ;
        for(String encodedChar : arrayOfPrimalChars){
            decodedString = CorrectValueMap.getValue(encodedChar);
            if (decodedString == null) {
                System.out.println("1 string: " + encodedChar);
                System.out.println("2 code: " + StringUtils.escapeNonAscii(encodedChar));
                System.out.println("3 value: "+ decodedString);
            }
            character.append(CorrectValueMap.getValue(encodedChar));
        }
        return character.toString();

    }
}
