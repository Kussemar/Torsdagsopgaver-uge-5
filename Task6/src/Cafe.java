import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<String> coffeeMenu;

    public void loadMenuData() {

        try {
            File file = new File("coffees.txt");
            Scanner filereader = new Scanner(file);
                      while(filereader.hasNextLine()){
                coffeeMenu.add(filereader.nextLine());
            }
        }catch(Exception e){
            System.out.println("File not found. Check path and filename");

        }
    }

    public Cafe() {
        this.coffeeMenu = new ArrayList<>();
    }
}