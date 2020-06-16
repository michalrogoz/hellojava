package language_parts.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTester {

    // https://regex101.com

    public static void main(String[] args) {
        String text = Source.source;

        String regex = "Województwo\\s(\\w*-?\\w*)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> discricts = new ArrayList<>();
        while (matcher.find()) {
            discricts.add(matcher.group(1));
        }

        for (String s : discricts) {
            System.out.println(s);
        }
    }

    // Lista państw i ich stolic Europa - być może że 2 grupy będą potrzebne


}
