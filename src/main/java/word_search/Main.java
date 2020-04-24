package word_search;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> solutionStrings = Arrays.asList("mars", "ogilvy", "sky", "meteor");

        AtomicInteger pos = new AtomicInteger();
        Word[] words = Files.lines(Paths.get("z3data1.txt"))
                .flatMap(line -> Stream.of(line.split(" ")))
                .map(s -> new Word(pos.getAndIncrement(), s))
                .toArray(Word[]::new);

        Searcher searcher = new Searcher(words);
        for (String s : solutionStrings) {

            System.out.println(s);
            String firstOccurencePosition = parseResult(searcher.naiveSearch(s));
            System.out.println("Naive search - " + firstOccurencePosition);
            String firstOccurencePositionBinarySearch = parseResult(searcher.binarySearch(s));
            System.out.println("Binary search - " + firstOccurencePositionBinarySearch);
            System.out.println();
        }
    }

    private static String parseResult(Optional<Integer> i) {
        return i.map(String::valueOf)
                .orElse("Not found");
    }

}
