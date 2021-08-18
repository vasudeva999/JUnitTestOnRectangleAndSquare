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
            assertEquals(25, rectangleAndSquare.areaOfRectangle(5, 5));
        }

        @Test
        public void toCalculateAreaWhenLengthAndBreadthAreNegative() {
            assertEquals(0, rectangleAndSquare.areaOfRectangle(-5, -5));
        }

        @Test
        public void toCalculateAreaWhenLengthIsPositiveAndBreadthIsNegative() {
            assertEquals(0, rectangleAndSquare.areaOfRectangle(5, -5));
        }

        @Test
        public void toCalculateAreaWhenLengthIsNegativeAndBreadthIsPositive() {
            assertEquals(0, rectangleAndSquare.areaOfRectangle(-5, 5));
        }
    }

    @Nested
    public class PerimeterOfRectangle {
        @Test
        public void toCalculatePerimeterWhenLengthAndBreadthArePositive(){
            assertEquals(20, rectangleAndSquare.perimeterOfRectangle(5, 5));
        }

        @Test
        public void toCalculatePerimeterWhenLengthAndBreadthAreNegative(){
            assertEquals(0, rectangleAndSquare.perimeterOfRectangle(-5, -5));
        }

        @Test
        public void toCalculatePerimeterWhenLengthIsPositiveAndBreadthIsNegative(){
            assertEquals(0, rectangleAndSquare.perimeterOfRectangle(5, -5));
        }

        @Test
        public void toCalculatePerimeterWhenLengthIsNegativeAndBreadthIsPositive(){
            assertEquals(0, rectangleAndSquare.perimeterOfRectangle(-5, 5));
        }
    }

    @Nested
    public class AreaOfSquare {
        @Test
        public void toCalculatedAreaOfSquareWhenSideIsPositive(){assertEquals(25, rectangleAndSquare.areaOfSquare(5));}

        @Test
        public void toCalculatedAreaOfSquareWhenSideIsNegative(){assertEquals(0, rectangleAndSquare.areaOfSquare(-5));}
    }

}
