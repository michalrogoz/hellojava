package simple_projects.shop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<ProductAmount> productAmountsList = new ArrayList<>();

    public void wyswietlWszystko(){
        for(ProductAmount productAmount : productAmountsList){
            System.out.println(productAmount.toString());
        }
    }

    public ProductAmount wyszukajElement(String nazwa){
        for(ProductAmount productAmount : productAmountsList){
            if(productAmount.product.nazwa.equals(nazwa)){
                return productAmount;
            }
        }
        System.out.println("Nie znaleziono!");
        return null;
    }

    public void wczytajZPliku() {
        String fileName = "products.txt";
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String currentLine = br.readLine();

            while (currentLine != null) {
                String[] split = currentLine.split(",");
                int ilosc = Integer.valueOf(split[0]);
                String nazwa = split[1];
                double cena = Double.valueOf(split[2]);
                String opis = split[3];

                ProductAmount newProductAmount = new ProductAmount(new Product(nazwa,cena,opis),ilosc);
                productAmountsList.add(newProductAmount);

                currentLine = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
