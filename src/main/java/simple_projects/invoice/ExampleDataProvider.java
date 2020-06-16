package simple_projects.invoice;

public class ExampleDataProvider {

    Item mleko = new Item("mleko", 4.99);
    Item ser = new Item("ser", 9.99);
    Item chleb = new Item("chleb", 3.99);


    Element elMleko = new Element(mleko, 3);
    Element elSer = new Element(ser, 1);
    Element elChleb = new Element(chleb, 5);


    public Invoice getExampleInvoice() {
        Invoice in = new Invoice();
        in.elements.add(elMleko);
        in.elements.add(elSer);
        in.elements.add(elChleb);
        return in;
    }

    public Invoice getExampleInvoice2() {
        Invoice in = new Invoice();
        in.elements.add(elMleko);
        in.elements.add(elSer);
        return in;
    }

}
