// Shopping Cart - class file(Movie.java)
// A class called Movie is created in this file, including a private member: length and setter\getter.
// Method toString() is also created here to return movie length.

package ShoppingCart;

public class Movie extends Item {

    // private member
    private int length;

    // Constructor; superclass constructor is called  
    public Movie(String title, String description, double price, int length) {
        super(title, description, price);
        this.length = length;   
    }
    
    // Getter and setter method for length member
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    //method toString() returns movie length
    public String toString() {
        return super.toString() + "\nLength: " + length +" mins";
    }

}
