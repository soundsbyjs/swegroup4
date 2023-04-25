import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    protected ArrayList<List<Item>> menuItems;
    public Menu(ArrayList<List<Item>> menuList)
    {
        FileReader fr;
        ///creating a Reader object
        try {
            File menuFile = new File("Menu.txt");
            Scanner scanMenu = new Scanner(menuFile);
            fr = new FileReader(menuFile);
            ///creating a File object and a Scanner object
            String currentCate = null;
            String currentName = null;
            Float currentCost = null;
            String currentDesc = null;
            Item newItem;
            List<Item> newItemList = new ArrayList<Item>();
            ///creating variables to aid with the scanning process
            do{
                String line = scanMenu.nextLine();
                String[] parts = line.split(":");
                String key = parts[0].trim();
                String value = parts[1].trim();
                ///creating variables used to store and define the current Line
                switch(key) {
                    case "Category":
                        currentCate = value;
                    case "Name":
                        currentName = value;
                    case "Cost":
                        currentCost = Float.parseFloat(value);
                    case "Description":
                        currentDesc = value;
                    default:
                        break;
                }
                ///depending on what prefix a line has, the value will be saved as the current
                /// Category, Name, Cost, or Description. If no prefix is found, no value is added.
                if(currentName != null && currentCost != null && currentDesc != null) {
                    newItem = new Item(currentName,currentCost,currentDesc,currentCate);
                    newItemList.add(newItem);
                    currentName = null;
                    currentCost = null;
                    currentDesc = null;
                    ///once all the variables are set to a value, an Item is created using them,
                    ///added to newItemList, and the Name/Cost/Description are reset to null.
                }
                if(line.equals("-"))
                {
                    menuList.add(newItemList);
                    ///if the line is "-", which in the .txt denotes the end of a category,
                    /// the current newItemList is added to menuList.
                }
            } while(scanMenu.hasNextLine());
            fr.close();
            menuItems = menuList;
        }
        catch(IOException ioex) {
            System.out.println ("Error: " + ioex.getMessage());
        }
    }
}
