package simple_projects.leki;

public class Skladnik {
    String nazwa;
    int zawartosc;

    public Skladnik(String nazwa, int zawartosc) {
        this.nazwa = nazwa;
        this.zawartosc = zawartosc;
    }

    @Override
    public String toString() {
        return "simple_projects.leki.Skladnik{" +
                "nazwa='" + nazwa + '\'' +
                ", zawartosc=" + zawartosc +
                '}';
    }
}
