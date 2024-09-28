import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 10;
        
        // Correctly generate the secret number
        int secretNumber = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you guess (between " + MIN + " and " + MAX + "): ");
        int userGuess = scanner.nextInt();

        // Check if the user's guess is within the valid range
        if (userGuess < MIN || userGuess > MAX) {
            System.out.println("Enter the number between the range " + MIN + " and " + MAX + ":");
        } else if (userGuess < secretNumber) {
            System.out.println("The number is too low");
        } else if (userGuess > secretNumber) {
            System.out.println("The number is too high");
        } else {
            System.out.println("You Win!");
        }
        
        scanner.close();
    }
}
