package simple_projects.shop;

public class ProductAmount {
    Product product;
    int amount;

    public ProductAmount(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return
                product.nazwa +
                ", amount=" + amount +
                '}';
    }
}
