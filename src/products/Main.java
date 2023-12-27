package products;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listProducts = new ArrayList<>();
        boolean exit = false;
        System.out.println("Welcome! Choose products (for exit enter: exit): ");
        while (!exit) {
            String product = scanner.nextLine();
            if (product.equals("exit")) {
                exit = true;
                System.out.println("Have a nice day!");
            } else {
                listProducts.add(product);
            }
        }
        if (listProducts.isEmpty()) {
            System.out.println("Your basket is empty :(");
        } else {
            System.out.println("Your basket is " + listProducts);
        }
    }
}
