// Shopping Cart - class file(Item.java)
// A class called Item is created in this file, including three private members: title, description, price and setter\getter.
// Method toString() is also created here to return Item's detail.


package ShoppingCart;

public class Item {

    // three private members
    private String title;
    private String description;
    private double price;

    // Constructor 
    public Item(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    // Setter and getter for three members
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //method toString() returns item's details
    public String toString() {
        return "Title: "+title + "\nDescription: "+description+ "\nPrice: $"+price;
    }

}
