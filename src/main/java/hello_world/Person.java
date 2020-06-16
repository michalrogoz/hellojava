package hello_world;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Person {
    int id;
    String first_name;
    String last_name;
    List<Double> salary;

    public Person() {
    }

    public Person(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    //Zaokrąglanie double do 2 miejsc po przecinku
    public double getYearSalary() {
        double sum = 0.0;
        for (Double aDouble : salary) {
            sum += aDouble;
        }
        return sum;
    }

    public double getAverageSalary() {
        double average = getYearSalary() / salary.size();
        return round(average);
    }

    public double getMaxSalary() {
        double maxSalary = salary.get(0);
        for (double gms : salary) {
            if (gms > maxSalary) {
                maxSalary = gms;
            }
        }
        return round(maxSalary);
    }

    public double getMinSalary() {
        double minSalary = salary.get(0);

        for (double gms : salary) {
            if (gms < minSalary) {
                minSalary = gms;
            }
        }
        return round(minSalary);
    }

    @Override
    public String toString() {
        return ("\nid: " + id + "\tFirs Name: " + first_name + "\tLast Name: " + last_name + "\nRoczne wynagrodzenie: " + getYearSalary()
                + "\tSrednie wynagrodzenie: " + getAverageSalary() + "\tnajwyższa wypłata miesieczna: " + getMaxSalary()
                + "\tnajniższa wypłata miesieczna: " + getMinSalary());
    }

    private double round(double number) {
        return new BigDecimal(number)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }
}
