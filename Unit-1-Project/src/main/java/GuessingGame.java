public class GuessingGame {
    public static void main(String[] args) {
        // Prompter to accept player input
        Prompter prompter = new Prompter();

        String itemType = prompter.pickItemType();
        int maxItems = prompter.pickMaxNumber(itemType); 

        // Creates a new Jar object
        Jar jar = new Jar(itemType, maxItems);
        
        // Method to choose random number of items
        jar.fill();

        int secretNumber = jar.getPresentNumber(); 
        int guess;
        int numberOfGuesses = 0;

        do {
            guess = prompter.playerGuess(itemType, maxItems);
            
            // Check if the guess is a valid one
            if (guess > maxItems || guess < 0) {
                prompter.checkForGuess(guess, maxItems);
                continue; // Skip to the next iteration
            }

            // Gives player feedback on guess
            if (guess > secretNumber) {
                prompter.playerFeedback(guess, secretNumber, "too high");
            } else if (guess < secretNumber) {
                prompter.playerFeedback(guess, secretNumber, "too low");
            }

            numberOfGuesses++;

        } while (guess != secretNumber);

        prompter.winningMessage(numberOfGuesses);
    }
}
