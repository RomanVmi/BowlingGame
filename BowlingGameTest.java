import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Рома on 05.05.2015.
 */
public class BowlingGameTest {

    @Test
    public void CreateGame() {
        BowlingGame game = new BowlingGame();
    }

    @Test
    public void canRoll() {
        BowlingGame game = new BowlingGame();
        game.roll(0);
    }

    private void rollSpare(BowlingGame game) {
        game.roll(5);
        game.roll(5);
    }
    
    private void rollMany(BowlingGame game, int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void gutterGame() {
        BowlingGame game = new BowlingGame();
        rollMany(game, 20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void allOnes() {
        BowlingGame game = new BowlingGame();
        rollMany(game, 20, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void oneSpare() {
        BowlingGame game = new BowlingGame();
        rollSpare(game);
        game.roll(3);
        rollMany(game, 17, 0);
        assertEquals(16, game.score());
    }

    @Test
    public void oneFiveFiveOne() {
        BowlingGame game = new BowlingGame();
        game.roll(1);
        rollSpare(game);
        game.roll(1);
        rollMany(game, 16, 0);
        assertEquals(12, game.score());
    }

}
