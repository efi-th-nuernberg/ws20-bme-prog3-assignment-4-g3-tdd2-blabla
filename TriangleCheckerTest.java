import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);
    }

    @Test
    public void testValidEquilateral() {

        // Arrange
        float a = 2;
        float b = 2;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);

    }
    @Test
    public void testValidIsosceles() {

        // Arrange
        float a = 7;
        float b = 5;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
    

        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);

    }
     @Test
    public void testValidNone1() {

        // Arrange
        float a = 7;
        float b = 2;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
    

        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }
     @Test
    public void testValidNone2() {

        // Arrange
        float a = -7;
        float b = 2;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
    

        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }
     @Test
    public void testValidNone3() {

        // Arrange
        float a = 7;
        float b = 2;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
    

        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }
    @Test
    public void testValidNone4() {

        // Arrange
        float a = 0;
        float b = 2;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
    

        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }
    @Test
    public void testValidNone5() {

        // Arrange
        float a = 7;
        float b = -6;
        float c = -4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
    

        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }
    @Test
    public void testValidNone6() {

        // Arrange
        float a = 0;
        float b = 0;
        float c = 0;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
    

        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }
}
