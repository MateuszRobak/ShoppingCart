package ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product romper = new Romper(2);
        ShoppingCart shoppingCart = new ShoppingCart();


        shoppingCart.addProduct(romper);
        shoppingCart.showShoppingCart();
        System.out.println("Romper quantity: " + romper.getQuantity());









    }

}
