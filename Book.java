// Shopping Cart - class file(Book.java)
// A class called Book is created in this file, including a private member: page_count and setter\getter.
// Method toString() is also created here to return book page count.
 

package ShoppingCart;

public class Book extends Item {

    // private member
    private int page_count;

    // Constructor; superclass constructor is called so that dont need to redefine title, description and price members
    public Book(String title, String description, double price, int pageCount) {
        super(title, description, price);
        this.page_count = pageCount;
    }

    // Getter and setter method for pageCount member
    public int getPageCount() {
        return page_count;
    }

    public void setPageCount(int pageCount) {
        this.page_count = pageCount;
    }

    //method toString() returns book page count
    public String toString() {
        return super.toString()+"\nPage Count: "+page_count+" pages";
    }

}