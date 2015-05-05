/**
 * Created by Рома on 05.05.2015.
 */
public class BowlingGame {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        for (int i = 0; i < currentRoll; i++) {
            if (rolls[i] + rolls[i+1] == 10) { //spare
                score += 10 + rolls [i+2];
                i++;
            }   else {
                score += rolls[i];
            }
        }
        return score;
    }
}
