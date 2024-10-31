import java.util.Scanner;

public class Prompter {
    private final Scanner scanner;

    public Prompter() {
        this.scanner = new Scanner(System.in);
    }

    public String pickItemType() {
        System.out.println("What type of item should fill the jar?");
        return scanner.nextLine();
    }

    public int pickMaxNumber(String itemType) {
        System.out.printf("%nWhat is the maximum amount of %s? ", itemType);
        String maxItemString = scanner.nextLine();
        return Integer.parseInt(maxItemString);
    }

    public int playerGuess(String itemType, int maxItemNumber) {
        System.out.printf("%nHow many %s are in the jar? Pick a number between 1 and %d: ", itemType, maxItemNumber);
        String startingGuess = scanner.nextLine();
        return Integer.parseInt(startingGuess);
    }

    public int checkForGuess(int guess, int maxItemNumber) {
        while (guess > maxItemNumber) {
            System.out.print("Your guess must be less than maximum amount: ");
            String stringGuess = scanner.nextLine();
            guess = Integer.parseInt(stringGuess);
        }
        return guess;
    }

    public void playerFeedback(int guess, int secretNumber, String feedback) {
        System.out.println("Your guess is " + feedback);
    }

    public void winningMessage(int numberOfGuesses) {
        System.out.printf("Hooray! You won in %d attempts%n", numberOfGuesses);
    }
}
