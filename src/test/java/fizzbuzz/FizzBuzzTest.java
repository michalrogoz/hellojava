package fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "2"),
                Arguments.of(3, "Fizz"),
                Arguments.of(5, "Buzz"),
                Arguments.of(15, "p1.FizzBuzz"),
                Arguments.of(30, "p1.FizzBuzz"),
                Arguments.of(33, "Fizz"),
                Arguments.of(55, "Buzz"));
    }

    @MethodSource("input")
    @ParameterizedTest
    void name(int input, String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.play(input);
        assertEquals(expected, result);

    }

}