package word_search;

import java.util.Optional;

public interface GenericSearcher {
    Optional<Integer> naiveSearch(String key);
    Optional<Integer> binarySearch(String key);


//    Komunikat dla użytkownika:
//    jeśli znaleziono: "Found word : <word> at index: <index>"
//    jeśli nie znaleziono: "Word <word> not found"
}
