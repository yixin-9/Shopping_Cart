// Shopping Cart - class file(Customer.java)
// A class called Customer is created in this file, including four private members: ID, first_name, last_name, cart and setter\getter.

package ShoppingCart;

public class Customer {
    
    // four private members
    private int ID;
    private String first_name;
    private String last_name;
    private ShoppingCart cart;

    // Constructor
    public Customer(int id, String firstName, String lastName) {
    ID = id;
    this.first_name = firstName;
    this.last_name = lastName;
    this.cart = new ShoppingCart();
    }

    // Setter and getter for four members
    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        this.ID = iD;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String firstName) {
        this.first_name = firstName;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

}
