package simple_projects.invoice;

import org.apache.commons.math3.util.Precision;

import java.io.Serializable;

public class Element implements Serializable {
    private Item artykul;
    private int ilosc;

    public Element() {
    }

    public Element(Item artykul, int ilosc) {
        this.artykul = artykul;
        this.ilosc = ilosc;
    }

    public double obliczWartosc() {
        return Precision.round(ilosc * artykul.getPrice(),2); // w mavenie dodana biblioteka do zaokraglania double
    }

    @Override
    public String toString() {
        return artykul + "\t" + ilosc + "\tPodsuma: " + obliczWartosc();
    }
}
