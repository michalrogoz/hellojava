package hello_world;

public class HelloWorld {

    public static void main(String[] args) {

        String imie = "magda";
        int wiek = 14;
        wypiszImieIWiek(imie, wiek);

        wypiszLiczbe(wiek);
        int a = 5;
        int b = 6;

        dodaj(a, b);
        dodaj(50, 21);

        int suma = dodaj(a, b);
        suma = suma + 10;
        System.out.println(suma);

    }

    static int dodaj(int skladnik1, int skladnik2) {
        int suma = skladnik1 + skladnik2;
        System.out.println(suma);

        return suma;
    }

    static void wypiszImieIWiek(String toJestImieDoWypisania, int wiekDoWypisania) {

        System.out.println("Cześć, moje imię to " + toJestImieDoWypisania);
        System.out.println("Mam lat " + wiekDoWypisania);
    }


    static void wypiszLiczbe(int liczba) {
        System.out.println("Cześć! Zrobie to za ciebie");
        System.out.println(liczba);
    }
}
