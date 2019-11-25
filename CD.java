// Shopping Cart - class file(CD.java)
// A class called CD is created in this file, including a private member: track_count and setter\getter.
// Method toString() is also created here to return CD's track.

package ShoppingCart;

public class CD extends Item {
    
    // private member
    private int track_count;
    
    // Constructor; superclass constructor is called 
    public CD(String title, String description, double price, int trackCount) {
        super(title, description, price);
        this.track_count = trackCount;
    }

    // Getter and setter method for track_count member

    public int getTrackCount() {
        return track_count;
    }

    public void setTrackCount(int trackCount) {
        this.track_count = trackCount;
    }

    //method toString() returns movie length
    public String toString() {
        return super.toString() + "\nTrack Count: " + track_count;
    }

}
