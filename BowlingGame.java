/**
 * Created by Рома on 05.05.2015.
 */
public class BowlingGame {

    private int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}
