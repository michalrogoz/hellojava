package simple_projects.invoice;

import java.util.ArrayList;

public class Printer {

    private final String lineSeparator = "------------------------------";
    private final String newline = "\n";


    public String printInvoiceForAllClients(ArrayList<Client> clients) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < clients.size(); i++) {
            sb.append(printInvoice(clients.get(i)));

        }
        return sb.toString();
    }

    public String printInvoice(Client client) {
        StringBuilder sb = new StringBuilder();

        sb.append(client.toString());
        sb.append(newline);
        sb.append(lineSeparator);
        sb.append(newline);

        for (int i = 0; i < client.factury.size(); i++) {
            sb.append("Faktura: ");
            sb.append(newline);

            sb.append(printElements(client.factury.get(i)));

            sb.append(newline);
            sb.append("Suma calkowita: " + client.factury.get(i).obliczSume());
            sb.append(newline);

            sb.append(newline);
            sb.append(lineSeparator);
            sb.append(newline);
        }

        return sb.toString();
    }


    public String printElements(Invoice invoice) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < invoice.elements.size(); i++) {
            sb.append(invoice.elements.get(i).toString());
            sb.append(newline);
        }
        return sb.toString();
    }


}
