import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordManager {

    private final ArrayList<String> words = new ArrayList<>();
    String currentDifficulty;

    WordManager() {  // default difficulty
        currentDifficulty = "easy";
        loadWordsFromTextFile("src/resources/easy_words.txt");
    }

    public void setDifficulty() {

        Scanner scanner = new Scanner(System.in);

        String pathOfFile;

        System.out.print("Select Difficulty (Easy, Medium, Hard): ");
        String difficulty = scanner.nextLine().toLowerCase();

        switch (difficulty) {
            case "easy" -> pathOfFile = "src/resources/easy_words.txt";
            case "medium" -> pathOfFile = "src/resources/medium_words.txt";
            case "hard" -> pathOfFile = "src/resources/hard_words.txt";
            default -> {
                System.out.println("Invalid choice. Defaulting to easy.\n");
                difficulty = "easy";
                pathOfFile = "src/resources/easy_words.txt";
            }
        }

        currentDifficulty = difficulty;
        loadWordsFromTextFile(pathOfFile);
        System.out.println("Words are loaded successfully from (" + pathOfFile + ")\n");
    }

    public void loadWordsFromTextFile(String pathOfFile) {

        words.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(pathOfFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not find file.\n");
        }
        catch (IOException e) {
            System.out.println("Something went wrong.\n");
        }
    }

    public String getRandomWord() {

        Random random = new Random();

        return words.get(random.nextInt(words.size())).toLowerCase();
    }
}
