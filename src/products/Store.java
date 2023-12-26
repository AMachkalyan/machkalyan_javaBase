package products;

import java.util.ArrayList;
import java.util.List;

public class Store {
    Product product;
    List<Product> productList = new ArrayList<>();
    public void addProduct(Product product) {
        productList.add(product);
    }
    public List<Product> showProducts() {
        return productList;
    }
}
