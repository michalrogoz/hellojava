package simple_projects.invoice;

import java.io.Serializable;
import java.util.ArrayList;

public class Invoice implements Serializable {

    public ArrayList<Element> elements = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(ArrayList<Element> elements) {
        this.elements = elements;

    }

    public double obliczSume() {
        double suma = 0;

        for (int i = 0; i < elements.size(); i++) {
            suma = suma + elements.get(i).obliczWartosc();
        }
        return suma;
    }

}
