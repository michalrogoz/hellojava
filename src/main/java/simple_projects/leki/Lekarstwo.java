package simple_projects.leki;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class Lekarstwo {

    String nazwa;
    String producet;
    double cena;
    Set<Skladnik> skladniki;
    double refundacja;
    boolean naRecepte;

    public Lekarstwo(String nazwa, String producet, double cena, Set<Skladnik> skladniki, double refundacja, boolean naRecepte) {
        this.nazwa = nazwa;
        this.producet = producet;
        this.cena = cena;
        this.skladniki = skladniki;
        this.refundacja = refundacja;
        this.naRecepte = naRecepte;
    }

    public double podajCeneLeku(boolean czyRefundowany) {

        if (czyRefundowany) {
            return cena - refundacja;
        } else {
            return cena;
        }
    }

    public void wyswietl() {
        System.out.println(nazwa);
        System.out.println(producet);
        System.out.println("Cena to:" + cena);
    }

    public String sprzedajLek(boolean refundacja, boolean posiadaRecepte) {

        if (naRecepte) {
            if (posiadaRecepte) {
                double cenaLeku = podajCeneLeku(refundacja);
                return "Sprzedano";
            } else {
                return "Nie masz recepty!";
            }
        } else {

            double cenaLeku = podajCeneLeku(refundacja);
            return "Spoko, nie jest na recepte! Sprzedano!";
        }
    }


    public void serializuj(String nazwaPliku) throws IOException {
        FileWriter writer = new FileWriter(nazwaPliku);
        BufferedWriter bw = new BufferedWriter(writer);

        bw.write(this.toString()); // bw.write( to co chcesz zapisac! .toString() )

        bw.close();
    }

    @Override
    public String toString() {
        return "simple_projects.leki.Lekarstwo{" +
                "nazwa='" + nazwa + '\'' +
                ", producet='" + producet + '\'' +
                ", cena=" + cena +
                ", skladniki=" + skladniki +
                ", refundacja=" + refundacja +
                ", naRecepte=" + naRecepte +
                '}';
    }
}
