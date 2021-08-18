import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleAndSquareTest {
    private RectangleAndSquare rectangleAndSquare;

    @BeforeEach
    public void createObject(){rectangleAndSquare = new RectangleAndSquare();}

    @Nested
    public class AreaOfRectangle {
        @Test
        public void toCalculateAreaWhenLengthAndBreadthArePositive() {
            assertEquals(25, rectangleAndSquare.AreaOfRectangle(5, 5));
        }

        @Test
        public void toCalculateAreaWhenLengthAndBreadthAreNegative() {
            assertEquals(0, rectangleAndSquare.AreaOfRectangle(-5, -5));
        }

        @Test
        public void toCalculateAreaWhenLengthIsPositiveAndBreadthIsNegative() {
            assertEquals(0, rectangleAndSquare.AreaOfRectangle(5, -5));
        }

        @Test
        public void toCalculateAreaWhenLengthIsNegativeAndBreadthIsPositive() {
            assertEquals(0, rectangleAndSquare.AreaOfRectangle(-5, 5));
        }
    }

}
