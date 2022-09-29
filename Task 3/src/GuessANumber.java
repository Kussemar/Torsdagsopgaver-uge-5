import java.util.Random;
import java.util.Scanner;


public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess() {
        Scanner scanner = new Scanner(System.in);
        int tryCount = 0;

        while (true) {
            System.out.println("Enter your guess ( 1-100):");

            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == rnd_number) {
                System.out.println("Correct! You Win");
                System.out.println("It took you " + tryCount + " tries ");
                break; // Når man vinder så stopper gamet

            } else if (rnd_number > playerGuess) {
                System.out.println("Nope! The number is higher. Guess again");
            } else {
                System.out.println("Nope! The number is lower. Guess again");


            }

        }
        scanner.close();
    }
}
        // Create a Scanner object
        // Read user input

        //use hasNextInt to check if input is numeric, 
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison (was it the right number?)
        //   If it was NOT the right number, let the user try again by calling this method recursively
        //   (If you are not sure how to do recursion, you can use a loop instead)
        //   Help the user by revealing whether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively




