public class ScoreManager {

    private int score;
    private int totalGamesPlayed;

    ScoreManager() {
        score = 0;
        totalGamesPlayed = 0;
    }

    public void incrementScore() {
        score++;
    }

    public void incrementTotalGamesPlayed() {
        totalGamesPlayed++;
    }

    public void viewScore() {
        System.out.println("Your score: " + score + "/" + totalGamesPlayed + "\n");
    }
}
