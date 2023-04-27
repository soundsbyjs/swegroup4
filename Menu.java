import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    protected ArrayList<List<Item>> menuItems = new ArrayList<>();
    protected List<Item> appetizersList = new ArrayList<>();
    protected List<Item> saladsList = new ArrayList<>();
    protected List<Item> entreesList = new ArrayList<>();
    protected List<Item> jFavoritesList = new ArrayList<>();
    protected List<Item> burgersList = new ArrayList<>();
    public Menu()
    {
        menuItems.add(appetizersList);
        menuItems.add(saladsList);
        menuItems.add(entreesList);
        menuItems.add(jFavoritesList);
        menuItems.add(burgersList);
        FileReader fr;
        ///creates a Reader object
        try {
            File menuList = new File("Menu.txt");
            Scanner scanMenu = new Scanner(menuList);
            fr = new FileReader(menuList);
            ///creates a File object and a Scanner object
            do{
                String line = scanMenu.nextLine();
                String[] substrings = line.split(":");
                switch(substrings[3])
                {
                    case "Appetizers":
                        appetizersList.add(new Item(substrings[0],Float.parseFloat(substrings[1]),substrings[2],substrings[3]));
                    case "Salads":
                        saladsList.add(new Item(substrings[0],Float.parseFloat(substrings[1]),substrings[2],substrings[3]));
                    case "Entrees":
                        entreesList.add(new Item(substrings[0],Float.parseFloat(substrings[1]),substrings[2],substrings[3]));
                    case "J's Favorites":
                        jFavoritesList.add(new Item(substrings[0],Float.parseFloat(substrings[1]),substrings[2],substrings[3]));
                    case "Burgers":
                        burgersList.add(new Item(substrings[0],Float.parseFloat(substrings[1]),substrings[2],substrings[3]));
                }
                ///splits each line into 4 different strings, all of which are used to create a new Item.
                ///this item is stored in one of the Lists depending on substrings[3] (the category)
            } while(scanMenu.hasNextLine());
            fr.close();
        }
        catch(IOException ioex) {
            System.out.println ("Error: " + ioex.getMessage());
        }
    }
}
