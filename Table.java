public class Table {
  //variables for each table
    protected int tableNum;
    private boolean clean;
    private boolean occupied;
  
  //constructor to set table number when added to floor layout
    public Table(int num) {
        tableNum = num;
        clean = true;
        occupied = false;
    }
  //sets the table status to clean
    public void setClean(String item) {
        clean = true;
    }
  //sets table status to occupied
    public void setOccupied(String item) {
        occupied = true;
    }
  //sets table status to vacant and dirty when customers leave
    public void setVacant(String item) {
        occupied = false;
        clean = false;
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