package Lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HM4 {
    private static double countTriangleArea(double sideA, double sideB, double sideC) throws TriangleTest {
        //вырожденный
        if (sideA < 0 || sideB < 0 || sideC < 0) throw new TriangleTest();
        double halfP = (sideA + sideB + sideC) / 2;
        double square = Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
        return square;
    }

    @Test
    void calcArea() throws TriangleTest {
        double result = countTriangleArea(2, 2, 2);
        Assertions.assertEquals(1.7320508075688772, result);
    }

    @Test
    void badTriangleTest() {
        assertThatExceptionOfType(TriangleTest.class).isThrownBy(
                () -> countTriangleArea(-1, 1, 1));
    }

    private Object assertThatExceptionOfType(Class<TriangleTest> badTriangleExceptionClass) {
    }
}
