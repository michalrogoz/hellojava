public class FizzBuzz {

    //TODO refaktor tej funkcji
    public String get(int number) {
        if (number%3==0)
        {

            if (number%5==0)
            {
                return "FizzBuzz";
            }
            else
            {
                return "Fizz";
            }
        }
        else
        {
            if(number%5==0)
            {
                return "Buzz";
            }
            else {
                return String.valueOf(number);
            }
        }
    }


}
