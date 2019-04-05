package ShoppingCart;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> shoppingCart = new ArrayList<>();

    private void noProductsAvaiable() {
        System.out.println("No products avaiable");
    }

    private void subtractProductQuantity(Product product) {
        product.setQuantity(product.getQuantity() - 1);
    }

    private void addItemToShoppingCart(Product product) {
        CartItem cartItem = new CartItem(product, 1);
        shoppingCart.add(cartItem);
        subtractProductQuantity(product);
    }

    private void addQuantityToItemInShoppingCart(Product product) {
        for (CartItem item : shoppingCart) {
            if (shoppingCart.contains(item)) {
                item.quantity++;
                subtractProductQuantity(product);
            } else {
                addItemToShoppingCart(product);
            }
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
            noProductsAvaiable();
            return;
        }
        if (isShoppingCartEmpty()) {
            addItemToShoppingCart(product);
        } else {
            addQuantityToItemInShoppingCart(product);
        }
    }

    public void showShoppingCart() {
        for (CartItem item : shoppingCart) {
            System.out.println("Product Name: " + item.product.getName());
            System.out.println("Product Description: " + item.product.getDescription());
            System.out.println("Product Price: " + item.product.getPrice());
            System.out.println("Product Quantity: " + item.quantity + "\n");
        }
    }
}


