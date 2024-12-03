package interfaces;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));

        // Apply a 10% discount
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        store.applyDiscount(tenPercentDiscount);

        // Apply a fixed discount of $50
        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        store.applyDiscount(fiftyDollarsDiscount);
    }
}

