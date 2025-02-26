public class Game {
    private final RandomNumberGenerator randomNumberGenerator;
    private final UserInputHandler userInputHandler;
    private final int targetNumber;
    private int attempts;

    public Game() {
        this.randomNumberGenerator = new RandomNumberGenerator();
        this.userInputHandler = new UserInputHandler();
        this.targetNumber = randomNumberGenerator.generate(1, 100);
        this.attempts = 0;
    }

    public void start() {
        int guess;
        do {
            guess = userInputHandler.getUserGuess();
            attempts++;
            compairGuess(guess, targetNumber);
        } while (guess != targetNumber);

        userInputHandler.closeScanner();
    }

    private void compairGuess(int guess, int targetNumber) {
        if (guess < targetNumber) {
            System.out.println("Too low! Try again.");
        } else if (guess > targetNumber) {
            System.out.println("Too high! Try again.");
        } else {
            System.out.println("You guessed it in " + attempts + " guesses!");
        }
    }
}
