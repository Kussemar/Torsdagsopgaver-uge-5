import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner afventer brugeren skriver sit navn for at fortsætte.
        // System in vil have noget fra os.
        System.out.println("Please type your name");
        String name = in.nextLine(); //Printer næsten line
        System.out.println("Name is: " + name);

        System.out.println("Please type your age");
        int age = in.nextInt();
        System.out.println("Your age is: " + age);

        int result = 67;
        System.out.println("You can retire in: " + (result - age) + " years");
        in.close(); //Lukker vores scanner.
    }
}