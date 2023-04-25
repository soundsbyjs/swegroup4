import java.util.ArrayList;

public class Order {
  //variables for each order
    private int tableNum;
    private ArrayList<String> items;
  
  //constructor which adds a table number when an order is created
    public Order(int num) {
        tableNum = num;
        items = new ArrayList<String>();
    }
  //adds an item to an order
    public void addItem(String item) {
        items.add(item);
    }
  //removes an item from an order in case user made a mistake
    public void removeItem(String item) {
        items.remove(item);
    }
  //returns the table number the order belongs to
    public int getTableNum() {
        return tableNum;
    }
  //returns the list of the items in the order
    public ArrayList<String> getItems() {
        return items;
    }
}