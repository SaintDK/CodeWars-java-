package kyu_8.Is_this_a_triangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TriangleTesterTest {
    @Test
    public void publicTests() {
        assertEquals(true, TriangleTester.isTriangle(1,2,2));
        assertEquals(false, TriangleTester.isTriangle(7,2,2));
    }
}