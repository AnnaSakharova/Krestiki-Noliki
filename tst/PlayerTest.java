import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        final String inputValue = "Anna";
        final String expectedValue = "Anna";

        final Player player = new Player(inputValue, null);

        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void getFigure() {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = inputValue;

        final Player player = new Player(null, inputValue);

        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);
    }
}