package hello_world.student_exercise_obiektowosc;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student studentMaciek = new Student();

        List<Float> ocenyMacka = new ArrayList<>();
        ocenyMacka.add(4.0f);
        ocenyMacka.add(5.0f);
        ocenyMacka.add(3.0f);


        studentMaciek.imie = "Maciek";
        studentMaciek.nazwisko = "ZCX1";
        studentMaciek.numerIndeksu = 1234455;
        studentMaciek.oceny = ocenyMacka;


        List<Float> ocenyAni = new ArrayList<>();
        ocenyMacka.add(4.0f);
        ocenyMacka.add(5.0f);
        ocenyMacka.add(3.0f);


        Student studentkaAnia = new Student("Ania", "Kowalska", ocenyAni, 987654);

        studentkaAnia.obliczSredniaOcen();

        List<Student> studenci = new ArrayList<>();
        studenci.add(studentMaciek);
        studenci.add(studentkaAnia);

    }


//    List<hello_world.student_exercise.Student> pobierzStudentowONajwyzszejSredniej(List<hello_world.student_exercise.Student> wszyscyStudenci){
//
//
//    }

}
