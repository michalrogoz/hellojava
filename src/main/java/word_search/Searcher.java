package word_search;

import java.util.Arrays;
import java.util.Optional;

public class Searcher implements GenericSearcher {
    final Word[] words;

    public Searcher(Word[] words) {
        this.words = words;
    }

    public Optional<Integer> naiveSearch(String word) {
        for (Word value : words) {
            if (word.equals(value.text)) {
                return Optional.of(value.position);
            }
        }
        return Optional.empty();
    }

    public String naiveSearch(String word, boolean parsed) {
        return parseResult(naiveSearch(word));
    }

    private static String parseResult(Optional<Integer> i) {
        return i.map(String::valueOf)
                .orElse("Not found");
    }

    public Optional<Integer> binarySearch(String word) {

        Arrays.sort(words);

        int start = 0;
        int end = words.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            int comparison = word.compareTo(words[middle].text);

            // Check if x is present at mid
            if (comparison == 0) {
                do {
                    middle--;
                } while (word.equals(words[middle].text));
                middle++;

                return Optional.of(words[middle].position);
            }

            if (comparison > 0) { // If x greater, ignore left half
                start = middle + 1;
            } else { // If x is smaller, ignore right half
                end = middle - 1;
            }
        }
        return Optional.empty();
    }


}
