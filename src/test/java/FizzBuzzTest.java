import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void returnsFizzFor3() {
        String word = fizzBuzz.get(3);
        assertEquals("Fizz", word);
    }

    @Test
    public void returnsBuzzFor5() {
        String word = fizzBuzz.get(5);
        assertEquals("Buzz", word);
    }

    @Test
    public void returnsNumberFor2() {
        String word = fizzBuzz.get(2);
        assertEquals("2", word);
    }

    @Test
    public void returnsFizzBuzzFor30() {
        String word = fizzBuzz.get(30);
        assertEquals("FizzBuzz", word);
    }

    //TODO przerobić na test parametryzowany

}