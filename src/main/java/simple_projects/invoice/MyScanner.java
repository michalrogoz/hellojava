package simple_projects.invoice;

import java.util.ArrayList;
import java.util.Scanner;

public class MyScanner {

    private Scanner scanner = new Scanner(System.in);


    public void addNewInvoiceForClient(ArrayList<Client> clients){
        System.out.println("Dla ktorego klienta dodac nowa fakture? Podaj identyfikator");
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(i + "-" + clients.get(i).toString());
        }
        int id = scanner.nextInt();
        scanner.nextLine();

        Invoice newInvoice = getDataForNewInvoice();

        clients.get(id).factury.add(newInvoice);

    }

    private Invoice getDataForNewInvoice(){
        Invoice invoice = new Invoice();

        String wybor = "t";

        while(wybor.equals("t")) {

            System.out.println("Wprowadz element");
            System.out.println("Nazwa artykulu:");
            String name = scanner.nextLine();
            System.out.println("Cena jednostkowa:");
            double price = scanner.nextDouble();
            System.out.println("Ilosc:");
            int amount = scanner.nextInt();
            scanner.nextLine(); // to musi byc, bez tego scaner ma problemy z odczytaniem kolejnej lini - czyli decyzji

            invoice.elements.add(new Element(new Item(name, price), amount));

            System.out.println("Czy dodac kolejny element? Jesli tak wprowadz t lub T");
            wybor = scanner.nextLine().toLowerCase();
        }

        return invoice;
    }


}
