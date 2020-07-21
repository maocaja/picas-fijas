
import java.util.ResourceBundle;

public class Game {

    public static final int NUMBER_LENGTH = 4;
    public static final String LINE_BREAK = String.format("%n");
    private static int intents = 6;
    private final ResourceBundle labels;

    private final Mastermind mastermind;

    public Game() {
        this.mastermind = new Mastermind();
        this.labels = ResourceBundle.getBundle("com.picasyfijas.resources.applicationMessages");
    }

    Game(int secretNumber) {
        this.mastermind = new Mastermind(secretNumber);
        this.labels = ResourceBundle.getBundle("com.picasyfijas.resources.applicationMessages");
    }

    public String intent(int intent) {
        if (isGameFinish() || (this.mastermind.getFijas(intent) == NUMBER_LENGTH)) {
            return labels.getString("message_game_over") + " " + mastermind.toString();
        } else {
            return labels.getString("fijas") + ": " + this.mastermind.getFijas(intent) +
                    LINE_BREAK +
                    labels.getString("picas") + ": " + this.mastermind.getPicas(intent);
        }
    }

    private boolean isGameFinish() {
        if (intents > 1) {
            --intents;
            return false;
        }
        return true;
    }

}