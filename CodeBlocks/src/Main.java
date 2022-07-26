public class Main {
    public static void main(String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("User1", position);
        position = calculateHighScorePosition(900);
        displayHighScorePosition("User2", position);
        position = calculateHighScorePosition(400);
        displayHighScorePosition("User3", position);
        position = calculateHighScorePosition(50);
        displayHighScorePosition("User4", position);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println("Player " + playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) return 1;
        else if (score >= 500) return 2;
        else if (score >= 100) return 3;
        else return 4;
    }
}
