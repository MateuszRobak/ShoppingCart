//package ShoppingCart;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import static org.testng.Assert.*;
//
//public class ShoppingCartTest {
//
//    @Test
//    public void testAddProduct() {
//        Product product = new Book(1);
//        ShoppingCart shoppingCart = new ShoppingCart();
//        shoppingCart.addProduct(product);
//        Assert.assertEquals(product.getQuantity(), 0);
//    }
//
//    @Test
//    public void testAddProduct2(){
//        Product product = new Book(0);
//        ShoppingCart shoppingCart = new ShoppingCart();
//        shoppingCart.addProduct(product);
//        Assert.assertEquals(shoppingCart.shoppingCart.size(),0);
//        Assert.assertEquals(shoppingCart.noProductsAvaiable(),"No products avaiable");
//    }
//
//    @Test
//    public void testShowShoppingCart() {
//    }
//}