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

    @Test
    public void gutterGame() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());

    }

    @Test
    public void allOnes() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());

    }


}
