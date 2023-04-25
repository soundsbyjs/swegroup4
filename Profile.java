import java.util.*;
import java.io.*;
import java.util.Scanner;
//importing objects necessary for writing to file

public class Profile {
    protected int userID = 0;
    protected int userPin = 0;
    protected String userRole = "";
    protected float userRating;
    protected float numRatings;
    protected float totalRating;
    private String fileString = "";
    //variables each profile will need
    public Profile (int newID, int newPin, String newRole){
        userID = newID;
        userPin = newPin;
        userRole = newRole;
        userRating = 0;
        numRatings = 0;
        totalRating = 0;
        //sets variables for the the profile
        PrintWriter pw = null;
        //creating a printer object
        try{
            File loginFile = new File ("profileInfo.txt");
            Scanner scanWords = new Scanner (loginFile);
            pw = new PrintWriter(loginFile);
            //creates object to print to file
            do{
                if(scanWords.hasNextLine()==false){
                    pw.println(userID+":"+userPin+":"+userRole+":"+userRating+":"+numRatings+":"+totalRating);
                }
                //checks on the last line and prints after
            }while (scanWords.hasNextLine()==true);
            //loops at least once, and stops after there are no more lines
        }
        catch(IOException ioex){
            System.out.println ("Error: " + ioex.getMessage());
        }
        finally{
            pw.close();
        }
    }
    //constructor to create a profile
    public int getID(){
        return userID;
    }
    //returns the userID for the profile
    public int getPin(){
        return userPin;
    }
    //returns the userPin for the profile
    public String getRole(){
        return userRole;
    }
    // returns the userRole for the profile
    public float getRating(){
        return userRating;
    }
    public void setRating (int newRating){
        totalRating = totalRating + newRating;
        numRatings++;
        userRating = totalRating / numRatings;
    }
    //calculates the userRating for the profile
    public void setID (int newID){
        userID = newID;
    }
    //sets the userID to a new inputted userID, if changes are needed
    public void setPin (int newPin){
        userPin = newPin;
    }
    //sets the userPin to a new inputted userPin, if changes are needed
    public void setRole (String newRole){
        userRole = newRole;
    }
    //sets the userRole to a new inputted userRole, if positions change
}
