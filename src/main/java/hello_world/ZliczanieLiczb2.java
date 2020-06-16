package hello_world;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ZliczanieLiczb2 {

    public static void main(String[] args) {

        ZliczanieLiczb2 obiektZadanie3 = new ZliczanieLiczb2();

        Scanner scanner = new Scanner(System.in);
        List<Integer> listaLiczb = new ArrayList<>();


        int aktualnaLiczbaInt = wczytajLiczbe(scanner);

        while (!(aktualnaLiczbaInt == 0 || aktualnaLiczbaInt == -1)) {

            listaLiczb.add(aktualnaLiczbaInt);
            aktualnaLiczbaInt = wczytajLiczbe(scanner);

        }

        dajDwieNajwiekszeLiczby(listaLiczb);

        obliczSumeLiczbParzystych(listaLiczb);

        obiektZadanie3.obliczSredniaLiczbNieparzystych(listaLiczb);

        System.out.println("Koniec programu");


    }

    private void obliczSredniaLiczbNieparzystych(List<Integer> listaLiczb) {
        double suma = 0;
        int ile = 0;
        for (int i = 0; i < listaLiczb.size(); i++) {

            int aktualnaLiczba = listaLiczb.get(i);
            if (aktualnaLiczba % 2 != 0) {
                suma = suma + aktualnaLiczba;
                ile++;
            }
        }

        double srednia = suma / ile;

        System.out.println("Srednia z nieparzystych to: " + srednia);

    }

    private static void obliczSumeLiczbParzystych(List<Integer> listaLiczb) {
        int suma = 0;
        for (int i = 0; i < listaLiczb.size(); i++) {

            int aktualnaLiczba = listaLiczb.get(i);
            if (aktualnaLiczba % 2 == 0) {
                suma = suma + aktualnaLiczba;
//                suma += aktualnaLiczba; // to samo co wyzej tylko inaczej
            }
        }
        System.out.println("Suma parzystych to: " + suma);
    }


    private static void dajDwieNajwiekszeLiczby(List<Integer> listaLiczb) {
        listaLiczb.sort(Comparator.reverseOrder());
        System.out.println("Dwie największe to:");
        System.out.println(listaLiczb.get(0));
        System.out.println(listaLiczb.get(1));
    }

    private static int wczytajLiczbe(Scanner scanner) {
        System.out.println("Podaj liczbe:");
        String aktualnaLiczbaString = scanner.nextLine();
        return Integer.valueOf(aktualnaLiczbaString);
    }
}
