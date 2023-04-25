import java.util.ArrayList;

public class Floor {
  //variables for floor
  private ArrayList<String> tables;
  
  //constructor adds 30 tables when creating floor status
    public Floor() {
        for (int i =0; i < 30; i++) {
          t1.table(i+1);
          tables.add(t1);
        }
    }
  //adds a new table to floor layout
    public void addTable(table table) {
        tables.add(table);
    }
  //removes a table from floor layout
    public void removeTable(table table) {
        tables.remove(table);
    }
  //returns a table to check it's stats
    public table getTable() {
        for (table table : tables) {
            if (table.getTableNum() == tableNum) {
                return table;
            }
        }
        return null;
    }
}
