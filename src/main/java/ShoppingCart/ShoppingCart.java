package ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public ArrayList<Product> shoppingCart = new ArrayList<>();

    public String noProductsAvaiable(){
        String noProductAvailable = "No products avaiable";
        return noProductAvailable;
    }

    public void addProduct(Product product) {
        if(product.getQuantity() == 0){
            noProductsAvaiable();
        }
        else if(shoppingCart.contains(product)) {
            int item = shoppingCart.indexOf(product);
            shoppingCart.get(item).setQuantity(shoppingCart.get(item).getQuantity()+1);
        } else {
            shoppingCart.add(product);
            product.setQuantity(1);
        }

    }

    public void removeProduct(Product product){
        int item = shoppingCart.indexOf(product);
        if(shoppingCart.get(item).getQuantity() > 1){
            shoppingCart.get(item).setQuantity(shoppingCart.get(item).getQuantity()-1);
        }
    }

    public void showShoppingCart(){
        for(Product product: shoppingCart) {
            int item = shoppingCart.indexOf(product);
            System.out.println("Product ID: " + shoppingCart.get(item).getId());
            System.out.println("Product Name: " + shoppingCart.get(item).getName());
            System.out.println("Product Description: " + shoppingCart.get(item).getDescription());
            System.out.println("Produt Quantity: " + shoppingCart.get(item).getQuantity());
            System.out.println("Product Price: " + shoppingCart.get(item).getPrice() + "\n");
        }
    }
}

