import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Utils utils = new Utils();

        String s = utils.readFile("data.json");

        Gson gson = new GsonBuilder().create();
        List<Person> persons = gson.fromJson(s, new TypeToken<List<Person>>() {
        }.getType());

        for (Person person : persons) {
            System.out.println(person.toString());
            System.out.println("salary"+ person.getYearSalary());
        }

        //Stworzenie listy nazwisk z listy osób
        //Sortowanie tych nazwisk
        // lub zamiast nazwisk "id"

        //Sortowanie osob po nazwisku
        //Sortowanie osob po najwyszej rocznej pensji interface Comparable lub Comparator


        System.out.println("Koniec");

    }
}
