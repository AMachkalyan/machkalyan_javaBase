package products;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(Product.BREAD);
        store.addProduct(Product.EGGS);
        store.addProduct(Product.MILK);
        store.addProduct(Product.JUICE);
        store.addProduct(Product.TOMATOES);
        System.out.println(store.showProducts());
    }
}
