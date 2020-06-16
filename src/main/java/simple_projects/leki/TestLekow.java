package simple_projects.leki;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class TestLekow {

    public static void main(String[] args) {

        Set<Skladnik> skladanikiApapu = new HashSet<>();
        skladanikiApapu.add(new Skladnik("cosTam", 100));
        skladanikiApapu.add(new Skladnik("cukier", 400));

        Lekarstwo apap = new Lekarstwo("APAP", "PROD", 10, skladanikiApapu, 0, false);


        Set<Skladnik> skladnikiSyropu = new HashSet<>();
        skladnikiSyropu.add(new Skladnik("cosTam", 4));
        skladnikiSyropu.add(new Skladnik("cukier", 150000));

        Lekarstwo syrop = new Lekarstwo("Syrop", "PROD", 100.6, skladnikiSyropu, 80, true);

        System.out.println(apap.podajCeneLeku(false));
        System.out.println(syrop.podajCeneLeku(true));
        System.out.println(syrop.podajCeneLeku(false));


        System.out.println(apap.sprzedajLek(false,false));
        System.out.println(syrop.sprzedajLek(false,true));
        System.out.println(syrop.sprzedajLek(false,false));


        try {
            apap.serializuj("lekarstwa.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Zapisano!");
    }
}
