package fizzbuzz;

public class FizzBuzz {
    public String play(int number) {
        StringBuilder sb = new StringBuilder();
        if (number % 3 == 0)
            sb.append("Fizz");
        if (number % 5 == 0)
            sb.append("Buzz");

        return sb.length() == 0 ? String.valueOf(number) : sb.toString();
    }
}
