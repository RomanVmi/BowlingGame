import org.junit.Test;

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
}
