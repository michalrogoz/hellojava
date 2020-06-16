package hello_world;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ZliczanieLiczb {

    public static void main(String[] args) {

        float liczba1 = 1.55f;
        float liczba2 = 2f;
        float liczba3 = 3f;
        float liczba4 = 4f;

        Set<Float> naszZbior = new HashSet<>();
        naszZbior.add(liczba1);
        naszZbior.add(liczba2);
        naszZbior.add(liczba3);
        naszZbior.add(liczba4);

        float min = 0f;
        float max = 2.55f;

        zliczLiczbyZZakresu(naszZbior, min, max);


    }

    static public int zliczLiczbyZZakresu(Set<Float> zbiorLiczb, float minimalnaLiczba, float maksymalnaLiczba) {

        ArrayList<Float> listaLiczb = new ArrayList<>(zbiorLiczb); // set na liste
        listaLiczb.sort(Comparator.reverseOrder()); // sortujemy liste

        System.out.println("Dwie największe liczby to:");
        System.out.println(listaLiczb.get(0));
        System.out.println(listaLiczb.get(1));

        int ileLiczb=0;
        for (int i = 0; i < listaLiczb.size() ; i++) {
            float aktualnaLiczba = listaLiczb.get(i);
            if(aktualnaLiczba >= minimalnaLiczba && aktualnaLiczba <= maksymalnaLiczba){
                ileLiczb++;
            }
        }
        System.out.println("Liczb w zakresie jest: " + ileLiczb);

        return ileLiczb;
    }


}
