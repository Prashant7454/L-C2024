import java.util.Scanner;

public class UserInputHandler {
    private Scanner scanner;

    public UserInputHandler() {
        scanner = new Scanner(System.in);
    }

    public int getUserGuess() {
        System.out.println("Enter your guess between 1 and 100: ");
        int guessedNumber = scanner.nextInt();
        while(!(guessedNumber > 0 && guessedNumber <= 100)) {
            System.out.println("Invalid input. Please enter a number between 1 and 100: ");
            guessedNumber = scanner.nextInt();
        }
        return guessedNumber;
    }

    public void closeScanner() {
        scanner.close();
    }
}
