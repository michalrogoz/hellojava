package hello_world.student_exercise_obiektowosc;

import java.util.List;

public class Student {

    public String imie;
    public String nazwisko;
    public List<Float> oceny;
    public int numerIndeksu;

    public Student() {
    }

    public Student(String _imie, String _nazwisko, List<Float> _oceny, int _numerIndeksu) {
        this.imie = _imie;
        this.nazwisko = _nazwisko;
        this.oceny = _oceny;
        this.numerIndeksu = _numerIndeksu;
    }


    public float obliczSredniaOcen() {

        float sumaOcen = 0;

        for (int i = 0; i < oceny.size(); i++) {
            float aktualnaOcena = oceny.get(i);
            sumaOcen = sumaOcen + aktualnaOcena;
        }

        return sumaOcen / oceny.size();
    }

}
