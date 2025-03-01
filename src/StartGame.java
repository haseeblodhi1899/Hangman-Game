import java.util.Scanner;

public class StartGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Game game = new Game(scanner);
        game.start();

        scanner.close();
    }
}
