import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hangman game = new Hangman("hangman", 8);

        System.out.println("Welcome to Hangman!\n");

        while (!game.isComplete() && game.getAttemptsLeft() > 0) {
            System.out.println("Word: " + game.getCurrentGuess());
            System.out.println("Attempts remaining: " + game.getAttemptsLeft());
            System.out.print("Guess a letter: ");
            String input = scanner.nextLine();
            if (input.length() != 1) {
                System.out.println("Please enter a single letter.");
                continue;
            }
            char guess = input.charAt(0);
            if (!game.guessLetter(guess)) {
                System.out.println("Incorrect guess!\n");
            }
        }

        if (game.isComplete()) {
            System.out.println("\nCongratulations! You've guessed the word: " + game.getCurrentGuess());
        } else {
            System.out.println("\nGame Over! The word was: " + "hangman");
        }

        scanner.close();
    }
}
