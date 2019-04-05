package ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Product romper = new Romper(3);
        Product book = new Book(4);
        ShoppingCart shoppingCart = new ShoppingCart();


        shoppingCart.addProduct(romper);
        shoppingCart.addProduct(book);

        shoppingCart.showShoppingCart();


        System.out.println("Romper quantity: " + romper.getQuantity());
        System.out.println("Book quantity: " + book.getQuantity());
    }
}
