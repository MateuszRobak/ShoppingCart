package ShoppingCart;


import java.util.ArrayList;

public class Book extends Product{
    int quantity;
    public Book(String name, String description, int price, int quantity){
        super(name, description, price,quantity);
    }

}
