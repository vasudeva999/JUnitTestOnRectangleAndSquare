import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleAndSquareTest {
    @Nested
    public class AreaOfRectangle {
        @Test
        public void toCalculateAreaWhenLengthAndBreadthArePositive() {
            RectangleAndSquare rectangleAndSquare = new RectangleAndSquare(5, 6);
            assertEquals(30, rectangleAndSquare.areaOfRectangleOrSquare());
        }

        @Test
        public void toCalculateAreaWhenLengthAndBreadthAreNegative() {
            RectangleAndSquare rectangleAndSquare = new RectangleAndSquare(-5, -6);
            assertEquals(0, rectangleAndSquare.areaOfRectangleOrSquare());
        }

        @Test
        public void toCalculateAreaWhenLengthIsPositiveAndBreadthIsNegative() {
            RectangleAndSquare rectangleAndSquare = new RectangleAndSquare(5, -6);
            assertEquals(0, rectangleAndSquare.areaOfRectangleOrSquare());
        }

        @Test
        public void toCalculateAreaWhenLengthIsNegativeAndBreadthIsPositive() {
            RectangleAndSquare rectangleAndSquare = new RectangleAndSquare(-5, 6);
            assertEquals(0, rectangleAndSquare.areaOfRectangleOrSquare());
        }
    }

    @Nested
    public class PerimeterOfRectangle {
        @Test
        public void toCalculatePerimeterWhenLengthAndBreadthArePositive(){
            RectangleAndSquare rectangleAndSquare = new RectangleAndSquare(5, 6);
            assertEquals(22, rectangleAndSquare.perimeterOfRectangleOrSquare());
        }

        @Test
        public void toCalculatePerimeterWhenLengthAndBreadthAreNegative(){
            RectangleAndSquare rectangleAndSquare = new RectangleAndSquare(-5, -6);
            assertEquals(0, rectangleAndSquare.perimeterOfRectangleOrSquare());
        }

        @Test
        public void toCalculatePerimeterWhenLengthIsPositiveAndBreadthIsNegative(){
            RectangleAndSquare rectangleAndSquare = new RectangleAndSquare(5, -6);
            assertEquals(0, rectangleAndSquare.perimeterOfRectangleOrSquare());
        }

        @Test
        public void toCalculatePerimeterWhenLengthIsNegativeAndBreadthIsPositive(){
            RectangleAndSquare rectangleAndSquare = new RectangleAndSquare(-5, 6);
            assertEquals(0, rectangleAndSquare.perimeterOfRectangleOrSquare());
        }
    }

    @Nested
    public class AreaOfSquare {
        @Test
        public void toCalculatedAreaOfSquareWhenSideIsPositive(){
            RectangleAndSquare rectangleAndSquare = new RectangleAndSquare(5);
            assertEquals(25, rectangleAndSquare.areaOfRectangleOrSquare());
        }

        @Test
        public void toCalculatedAreaOfSquareWhenSideIsNegative(){
            RectangleAndSquare rectangleAndSquare = new RectangleAndSquare(-5);
            assertEquals(0, rectangleAndSquare.areaOfRectangleOrSquare());
        }
    }

    @Nested
    public class PerimeterOfSquare {
        @Test
        public void toCalculatedPerimeterOfSquareWhenSideIsPositive(){
            RectangleAndSquare rectangleAndSquare = new RectangleAndSquare(5);
            assertEquals(20, rectangleAndSquare.perimeterOfRectangleOrSquare());
        }

        @Test
        public void toCalculatedPerimeterOfSquareWhenSideIsNegative(){
            RectangleAndSquare rectangleAndSquare = new RectangleAndSquare(-5);
            assertEquals(0, rectangleAndSquare.perimeterOfRectangleOrSquare());
        }
    }

}
