package simple_projects.invoice;

import java.io.Serializable;
import java.util.ArrayList;

public class Client implements Serializable {
    private String name;
    private String adress;
    public ArrayList<Invoice> factury = new ArrayList<>();

    public Client() {
    }

    public Client(String name, String adress) {
        this.name = name;
        this.adress = adress;

    }

    @Override
    public String toString() {
        return name + "\t" + adress;
    }
}
