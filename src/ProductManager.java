import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManager<E>implements Comparator<Product> {
    List<Product> products = new ArrayList<>();


    public ProductManager(){

    }

    public List<Product> getProducts() {
        return products;
    }

    public void addproduct(Product product){
        products.add(product);
    }
    public void deleteProduct(Product product){
        for(int i=0;i<products.size();i++){
            if(products.get(i).getName().equals(product.getName())){
                products.remove(i);
            }
        }
    }
    public void changeproduct(Product product,Product newproduct){
        for(int i=0;i<products.size();i++){
            if(products.get(i).getName().equals(product.getName())){
                products.set(i,newproduct);
            }
        }

    }
    public void showList(){
        System.out.println(products);
    }

    @Override
    public int compare(Product o1, Product o2) {
        if(o2.getCost()< o1.getCost()){
            return 1;
        }else if(o2.getCost()> o1.getCost()){
            return -1;
        }else{
            return 0;
        }
    }
}
