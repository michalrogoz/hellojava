package hello_world.account_exercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        testujKonto();
        testujKonwerter();
    }

    private static void testujKonwerter() {
        KonwerterWalut konwerterWalut = new KonwerterWalut();
        Scanner scannerObiekt = new Scanner(System.in);
        System.out.println("Wprowadz $:");
        double dolary = scannerObiekt.nextDouble();
        double wynik2 = konwerterWalut.przeliczDolaryNaPln(dolary);
        System.out.println("wynik" + wynik2);
        scannerObiekt.close();
    }

    private static void testujKonto() {
        KontoBankowe kontoBankowe = new KontoBankowe();
        System.out.println(kontoBankowe.balans);
        kontoBankowe.zmiejszStanKonta(15);
        boolean czyDodatnie = kontoBankowe.czyDodatnie();
        System.out.println(czyDodatnie);
    }
}
