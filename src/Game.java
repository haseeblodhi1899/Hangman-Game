import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private final WordManager wordManager = new WordManager();
    private final ScoreManager scoreManager = new ScoreManager();
    private final Scanner scanner;
    private static final int MAX_GUESSES = 6;

    Game(Scanner scannerP) {
        this.scanner = scannerP;
    }

    public void start() {

        int choice;

        do {
            System.out.println("˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟");
            System.out.println("  Welcome to Java Hangman  ");
            System.out.println("˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟˟");
            System.out.println("1. New Game");
            System.out.println("2. View Score");
            System.out.println("3. Instructions");
            System.out.println("4. Difficulty Settings");
            System.out.println("5. Quit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            System.out.println();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    playGame();
                    scoreManager.incrementTotalGamesPlayed();
                }
                case 2 -> scoreManager.viewScore();
                case 3 -> instructions();
                case 4 -> wordManager.setDifficulty();
                case 5 -> System.out.println("Thanks for playing!");
                default -> System.out.println("Invalid choice, try again please.\n");
            }
        } while (choice != 5);
    }

    private void playGame() {

        String difficulty = wordManager.currentDifficulty;
        System.out.println("˟˟˟ " + difficulty.toUpperCase() + " MODE ˟˟˟\n");

        String word = wordManager.getRandomWord();
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        while (wrongGuesses < MAX_GUESSES) {

            System.out.println(HangmanArt.getHangmanArt(wrongGuesses));

            System.out.print("Word: ");

            for (char letter : wordState) {
                System.out.print(letter + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!\n");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')) {
                    System.out.println(HangmanArt.getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN! (with " + wrongGuesses + "/" + MAX_GUESSES + " wrong guesses)");
                    System.out.println("The word was: " + word + "\n");
                    scoreManager.incrementScore();
                    break;
                }
            }
            else {
                wrongGuesses++;
                System.out.println("Wrong guess!\n");
            }
        }

        if (wrongGuesses >= MAX_GUESSES) {
            System.out.println(HangmanArt.getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word + "\n");
        }
    }

    private void instructions() {

        System.out.println("Instructions:");
        System.out.println("1. The game randomly selects a word from a predefined list.");
        System.out.println("2. Your task is to guess the word one letter at a time.");
        System.out.println("3. For every correct guess, the letter will be revealed in its proper position.");
        System.out.println("4. For every incorrect guess, a part of the hangman drawing is added.");
        System.out.println("5. You are allowed a maximum of 6 wrong guesses before the game is over.");
        System.out.println("6. If you manage to guess the entire word before the hangman is fully drawn, you win!");
        System.out.println("7. If the hangman drawing is completed (after 6 wrong guesses), the game is lost.");
        System.out.println("Good luck and have fun!\n");
    }
}
