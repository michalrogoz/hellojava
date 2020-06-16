package simple_projects.shop;

public class Product {
    String nazwa;
    double cena;
    String opis;


    public Product(String nazwa, double cena, String opis) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", opis='" + opis + '\'' +
                '}';
    }
}
