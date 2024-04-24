/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", getTriangleType(1, 2, 3));
        assertEquals("NotATriangle", getTriangleType(3, 1, 1));
        assertEquals("NotATriangle", getTriangleType(1, 1, 2));
    }

    @Test
    public void testEquilateral() {
        assertEquals("Equilateral", getTriangleType(3, 3, 3));
    }

    @Test
    public void testIsosceles() {
        assertEquals("Isosceles", getTriangleType(3, 3, 2));
        assertEquals("Isosceles", getTriangleType(3, 2, 3));
        assertEquals("Isosceles", getTriangleType(2, 3, 3));
    }

    @Test
    public void testScalene() {
        assertEquals("Scalene", getTriangleType(3, 4, 5));
        assertEquals("Scalene", getTriangleType(5, 4, 3));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("Right triangle", checkRightTriangle(3, 4, 5));
        assertEquals("Right triangle", checkRightTriangle(5, 12, 13));
        assertEquals("Right triangle", checkRightTriangle(8, 6, 10));
    }

    private String getTriangleType(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "NotATriangle";
        } else if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    private String checkRightTriangle(int a, int b, int c) {
        int[] sides = {a, b, c};
        java.util.Arrays.sort(sides);

        int x = sides[0];
        int y = sides[1];
        int z = sides[2];

        if (x * x + y * y == z * z) {
            return "Right triangle";
        } else {
            return "Not a right triangle";
        }
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
