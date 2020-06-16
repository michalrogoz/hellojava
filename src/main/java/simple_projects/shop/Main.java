package simple_projects.shop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        Users users = new Users();
        users.wczytajZPliku();

        Cart shopInventory = new Cart();
        shopInventory.wczytajZPliku();

        User activeUser = main.modulLogowania(users, scanner);

        String czyKoniec = null;
        do {
            ProductAmount productAmount = main.modulSzczegolow(shopInventory, scanner);
            main.modulKupna(activeUser, productAmount, shopInventory, scanner);

            System.out.println("Konczymy zakupy? (T|dowolny)");
            czyKoniec = scanner.nextLine();

        } while (!czyKoniec.equals("T"));

        main.modulKonca(activeUser, scanner);

    }

    private void modulKonca(User user, Scanner scanner) {
        System.out.println("Kupujesz? (T) czy wychodzisz (dowolny)");
        String decyzja = scanner.nextLine();
        if (decyzja.equals("T")) {
            double suma = 0;
            for (ProductAmount productAmount : user.usersCart.productAmountsList) {
                suma += productAmount.product.cena * productAmount.amount;
            }
            System.out.println("Wartosc zamowienia to: " + suma);
            System.out.println("Dziekujemy za zakupy!");
        } else {
            System.out.println("Zapraszamy kolejnym razem!");
        }

    }

    private void modulKupna(User activeUser, ProductAmount productAmount, Cart shopInventory, Scanner scanner) {
        System.out.println("Czy chcesz dodać do koszyka? (T|N)");
        String decyzja = scanner.nextLine();

        if (decyzja.equals("T")) {

            System.out.println("Ile chcesz dodać?");
            int ile = Integer.valueOf(scanner.nextLine());

            if (productAmount.amount >= ile) {
                activeUser.usersCart.productAmountsList.add(new ProductAmount(productAmount.product, ile));
                productAmount.amount = productAmount.amount - ile;
                System.out.println("Dodano do koszyka!");

            } else
                System.out.println("Tyle nie mamy!");
        }

    }

    private ProductAmount modulSzczegolow(Cart shopInventory, Scanner scanner) {
        ProductAmount productAmount = null;
        do {
            shopInventory.wyswietlWszystko();
            System.out.println("Podaj nazwe wybranego produktu:");
            String nazwaProduktu = scanner.nextLine();
            productAmount = shopInventory.wyszukajElement(nazwaProduktu);
        }
        while (productAmount == null);

        System.out.println(productAmount.product.toString() );
        return productAmount;
    }

    private User modulLogowania(Users users, Scanner scanner) {
        User user = null;
        do {
            System.out.println("Podaj login:");
            String login = scanner.nextLine();
            System.out.println("Podaj haslo:");
            String haslo = scanner.nextLine();

            user = users.zaloguj(login, haslo);
        } while (user == null);

        return user;

    }


}
