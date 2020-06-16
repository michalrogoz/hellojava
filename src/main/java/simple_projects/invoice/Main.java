package simple_projects.invoice;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
         *  Tylko za pierwszym uruchomieniem programu zeby wygenerowac dane do pliku :)
         * */
//        ExampleDataProvider dp = new ExampleDataProvider();
//
//        Client clientAdam = new Client("Adam Kowalski", "ul.Sloneczna");
//        Client clientBasia = new Client("Basia Nowak", "ul.Deszczowa");
//
//        clientAdam.factury.add(dp.getExampleInvoice());
//        clientAdam.factury.add(dp.getExampleInvoice2());
//        clientBasia.factury.add(dp.getExampleInvoice2());
//
//        ArrayList<Client> clients = new ArrayList<>();
//        clients.add(clientAdam);
//        clients.add(clientBasia);
//
//        FilesManager filesManager = new FilesManager();
//        filesManager.loadDataToFile("dane",clients);


        FilesManager filesManager = new FilesManager();
        Printer printer = new Printer();
        MyScanner myScanner = new MyScanner();

        //wczytywanie z pliku
        ArrayList<Client> clients = filesManager.loadDataFromFile("dane");

        //wyswietlanie wszystkich klientow i ich faktur
        String print = printer.printInvoiceForAllClients(clients);
        System.out.println(print);

        //dodawanie nowej faktury
        myScanner.addNewInvoiceForClient(clients);

        //zapisywanie nowego stanu rzeczy do pliku
        filesManager.loadDataToFile("dane", clients);

        //koniec programu

    }
}
