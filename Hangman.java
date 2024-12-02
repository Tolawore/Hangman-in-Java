public class Hangman {
    private String word;
    private StringBuilder currentGuess;
    private int attemptsLeft;

    public Hangman(String word, int attempts) {
        this.word = word;
        this.attemptsLeft = attempts;
        this.currentGuess = new StringBuilder("_".repeat(word.length()));
    }

    public boolean guessLetter(char letter) {
        boolean isCorrect = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                currentGuess.setCharAt(i, letter);
                isCorrect = true;
            }
        }
        if (!isCorrect) {
            attemptsLeft--;
        }
        return isCorrect;
    }

    public String getCurrentGuess() {
        return currentGuess.toString();
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public boolean isComplete() {
        return !currentGuess.toString().contains("_");
    }
}
