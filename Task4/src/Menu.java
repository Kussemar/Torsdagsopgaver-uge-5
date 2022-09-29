import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<String> options;

    public Menu(ArrayList<String> options) {
        this.options = options;
    }

    public int showMenu(){
        System.out.println("Type a number to choose ");
       for(String s:options){ //Laver et for-each loop, for at få den til atk øre
           System.out.println(s);
       }
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }

}
