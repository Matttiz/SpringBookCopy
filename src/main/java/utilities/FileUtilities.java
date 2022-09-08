package utilities;

import lombok.SneakyThrows;

import java.io.*;

public class FileUtilities {


    @SneakyThrows
    public static String read(String path){
        File file = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String content = new String();
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
            content += line;
        }
        return content;
    };

    @SneakyThrows
    public static void write(String path, String content){
        FileWriter file = new FileWriter(path);
        BufferedWriter writer = new BufferedWriter(file);
        writer.write(content);
        writer.close();
    }
}
