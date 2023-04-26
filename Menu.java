import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    protected ArrayList<List<Item>> menuItems;
    public Menu()
    {
        File menuAppetizers = new File("Menu_Appetizers.txt");
        File menuSalads = new File("Menu_Salads.txt");
        File menuEntrees = new File("Menu_Entrees.txt");
        File menuJFavorites = new File("Menu_JFavorites.txt");
        File menuBurgers = new File("Menu_Burgers.txt");
        menuItems.add(scanMenu(menuAppetizers));
    }
    public List<Item> scanMenu(File fileName)
    {
        FileReader fr;
        ///creating a Reader object
        String currentCate = null;
        String currentName = null;
        Float currentCost = null;
        String currentDesc = null;
        int lineNum = 0;
        List<Item> newItemList = new ArrayList<Item>();
        ///creating variables to aid with the scanning process
        try {
            Scanner scanMenu = new Scanner(fileName);
            fr = new FileReader(fileName);
            ///creating a File object and a Scanner object
            do{
                String line = scanMenu.nextLine();
                if(currentCate == null)
                {
                    currentCate = line;
                }
                else {
                    switch(lineNum % 4)
                    {
                        case 1:
                            currentName = line;
                        case 2:
                            currentCost = Float.parseFloat(line);
                        case 3:
                            currentDesc = line;
                        case 0:
                            newItemList.add(new Item(currentName,currentCost,currentDesc,currentCate));
                    }
                }
                lineNum++;
            } while(scanMenu.hasNextLine());
            fr.close();
        }
        catch(IOException ioex) {
            System.out.println ("Error: " + ioex.getMessage());
        }
        return newItemList;
    }
}
