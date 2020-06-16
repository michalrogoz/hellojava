package hello_world.szyfr;

import java.util.Scanner;

public class Szyfr {

    public static void main(String[] args) {

        Szyfr szyfr = new Szyfr();
        szyfr.zrobZadanie();

    }

    public void zrobZadanie() {
        int offset = 10;
        String alfabet = "AĄBCĆDEĘFGHIJKLŁMNŃOÓPRSŚTUWYZŹŻ";

        System.out.println("Wprowadz slowo: ");
        Scanner scanner = new Scanner(System.in);

        String slowo = scanner.nextLine().toUpperCase();
        StringBuilder slowoZaszyfrowane = new StringBuilder();
        StringBuilder slowoDeszyfrowane = new StringBuilder();

        int index = 0;


        // Zmieniłem troszkę to co pisaliśmy, ta pętla w środu sprawdzająca literkę w alfabecie była niepotrzeba bo alfabet.indexOf() robi to za nas, czyli zwraca pod jakim indeksem jest literka :)

        for (int i = 0; i < slowo.length(); i++) {
            char literka = slowo.charAt(i);
            index = alfabet.indexOf(literka); // rownie dobrze mogłoby być: alfabet.indexOf(slowo.charAt(i);) to już jak wolisz, co Ci lepiej czytać
            char literkaSzyfr = alfabet.charAt((index + offset) % alfabet.length());
            slowoZaszyfrowane.append(literkaSzyfr);
        }

        // Czesc dla ambitnych
        // To powinno działać ale dla offestu nie jakiegoś dużego (czyli jak ustawisz 10 to na pewno działa) sprawdź sobie kiedy przestaje :)
        // index - offset + alfabet.length() - to się tak jakby przekręca dla dużych offsetów, ale nie mam czasu nad tym pomyśleć

        for (int i = 0; i < slowoZaszyfrowane.length(); i++) {
            char literka = slowoZaszyfrowane.charAt(i);
            index = alfabet.indexOf(literka);
            char literkaDesz = alfabet.charAt((index - offset + alfabet.length()) % alfabet.length());
            slowoDeszyfrowane.append(literkaDesz);
        }

        System.out.println(slowoZaszyfrowane.toString());
        System.out.println(slowoDeszyfrowane.toString());
    }
}
