// Buying.java
// This program consists of one main file:Buying and six class files: Customer, ShoppingCart, Item, Book, Movie and CD.
// This Buying.java file is created to test all the method from class files. 
// It shows the status of a customer's shopping cart by adding Items.
// Will add more functions such as remove item and shows shopping cart total in future

package ShoppingCart;

public class Buying {

    public static void main(String[] args) {

    // create a customer and all the items
    Customer customer = new Customer(8681,"Destine","John");

    Book book1 = new Book("Sorry I don't ","Fiction",25,200);
    Book book2 = new Book("Say Yes ","Fiction",30,120);
    Book book3 = new Book("Future ","Fiction",25,210);
    
    Movie movie1 = new Movie("Final Destination","Thriller",50,90);
    Movie movie2 = new Movie("What's Wrong","Comedy",60,140); 
    
    CD cd1 = new CD("Swift","Jazz Music",55.50,15);
    
    // create a shopping cart for the customer
    ShoppingCart cart = customer.getCart();

    //addItem
    cart.addItem(book2);
    cart.addItem(book1);
    cart.addItem(movie1);
    cart.addItem(cd1);

    customer.setCart(cart);

    // Print customer details
    System.out.println("ID: " + customer.getID() + "\nFirst name: " + customer.getFirstName() + "\nLast name: " + customer.getLastName());

    // Print items in cart
    System.out.println("\n\nCART ITEMS\n");
    cart.printItems();

}

    
}