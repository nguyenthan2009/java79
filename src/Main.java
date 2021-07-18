import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("C05","Chăn",100);
        Product product2 = new Product("C06","ga", 200);
        ProductManager Manager = new ProductManager();

        Manager.addproduct(new Product("C05","Máy giặt",300));
        Manager.addproduct(product1);
        Manager.addproduct(product2);
        Manager.showList();
        Manager.deleteProduct(product1);
        Manager.showList();
        Manager.changeproduct(product2,product1);
        Manager.showList();
        Manager.getProducts().sort(Manager);
        Manager.showList();

    }
}
