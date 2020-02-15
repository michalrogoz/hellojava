import java.util.ArrayList;
import java.util.List;

public class Person {
    int id;
    String first_name;
    String last_name;
    List<Double> salary;


    //Zaokrąglanie double do 2 miejsc po przecinku
    public double getYearSalary() {
        double sum = 0.0;
        for (Double aDouble : salary) {
            sum += aDouble;
        }
        return sum;
    }

    //średnia pensja

    //max pensja

    //min pensja

//to ładniejesze
    @Override
    public String toString() {
        return  "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name;

    }
}
