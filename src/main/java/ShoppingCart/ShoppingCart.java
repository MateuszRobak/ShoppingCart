package ShoppingCart;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> shoppingCart = new ArrayList<>();

    private void noProductsAvaiable(Product product) {
        System.out.println("No " + product.getName() +" avaiable\n");
    }

    private void subtractProductQuantity(Product product) {
        product.setQuantity(product.getQuantity() - 1);
    }

    private void addItemToShoppingCart(Product product) {
        CartItem cartItem = new CartItem(product, 1);
        shoppingCart.add(cartItem);
        subtractProductQuantity(product);
    }

    private boolean isItemInShoppingCart(CartItem item, Product product){
        return item.product.getName().equals(product.getName());
    }

    private void addQuantityToItemInShoppingCart(Product product) {
        boolean exists = false;
        for (CartItem item : shoppingCart) {
            if (isItemInShoppingCart(item,product)) {
                item.quantity++;
                subtractProductQuantity(product);
                exists = true;
                break;
            }
        }
        if (!exists) {
            addItemToShoppingCart(product);
        }

    }

    private boolean isShoppingCartEmpty() {
        return shoppingCart.isEmpty();
    }

    private boolean isNoInventoryInProduct(Product product) {
        return product.getQuantity() == 0;
    }

    public void addProduct(Product product) {
        if (isNoInventoryInProduct(product)) {
            noProductsAvaiable(product);
            return;
        }
        if (isShoppingCartEmpty()) {
            addItemToShoppingCart(product);
        } else {
            addQuantityToItemInShoppingCart(product);
        }
    }

    public void showShoppingCart() {
        System.out.println("YOUR SHOPPING CART \n");
        for (CartItem item : shoppingCart) {
            System.out.println("Product Name: " + item.product.getName());
            System.out.println("Product Description: " + item.product.getDescription());
            System.out.println("Product Price: " + item.product.getPrice());
            System.out.println("Product Quantity: " + item.quantity + "\n\n");
        }
    }
}


