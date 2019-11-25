// Shopping Cart - class file(ShoppingCart.java)
// A class called ShoppingCart is created in this file, including two private members: item_list[] and item_bought and setter\getter.
// Add Item and Print Item functions are also built in this file.

package ShoppingCart;

public class ShoppingCart {

    private static int MAX_CART_SIZE = 25;

    // two private members
    private Item items_list[];
    private int item_bought;

    // Constructor 
    public ShoppingCart() {
        items_list = new Item[MAX_CART_SIZE];
        item_bought = 0;
    }

    // Getter and setter for two members
    public Item[] getItemsList() {
        return items_list;
    }

    public void setItemsList(Item[] itemsList) {
        this.items_list = itemsList;
    }

    public int getItemBought() {
        return item_bought;
    }

    public void setItemBought(int itemBought) {
        this.item_bought = itemBought;
    }

    // Add item function and check if the cart is not full else add item and increase item_bought by 1
    public void addItem(Item item) {
        if(item_bought==MAX_CART_SIZE) {
            System.out.println("Cart is FULL");
        }else {
            items_list[item_bought] = item;
            item_bought +=1;
        }

    }

    // This fucntion is used to print out all the items it links to the toString function
    public void printItems() {

        for(int i =0;i<item_bought;i++) {
            System.out.println(items_list[i]+"\n");
        }
    }

}

