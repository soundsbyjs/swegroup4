public class Table {
  //variables for each table
    protected int tableNum;
    private boolean clean;
    private boolean occupied;
    private order tableOrder;
  
  //constructor to set table number when added to floor layout
    public Table(int num) {
        tableNum = num;
        clean = true;
        occupied = false;
    }
  //adds an order to table
    public void addOrder(order newOrder){
        tableOrder = newOrder;
    }
  //returns the table order
    public order getOrder() {
        return tableOrder;
    }
  //sets the table status to clean
    public void setClean(String item) {
        clean = true;
    }
  //sets table status to occupied
    public void setOccupied(String item) {
        occupied = true;
    }
  //sets table status to vacant and dirty and removes order information when customers leave
    public void setVacant(String item) {
        occupied = false;
        clean = false;
        tableOrder = null;
    }
  //returns table status as either "Occupied", "Clean", or "Dirty"
    public String getTableStatus() {
        if (occupied) {
          return "Occupied";
        }
        else {
          if (clean) {
            return "Clean";
          }
          else {
            return "Dirty";
          }
        }
    }
}
