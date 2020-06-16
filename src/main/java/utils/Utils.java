package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Utils {

    public String readFile(String path) {
        try {
            return Files.lines(Paths.get(path)).collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }



}
