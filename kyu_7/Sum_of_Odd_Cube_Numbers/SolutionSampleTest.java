package kyu_7.Sum_of_Odd_Cube_Numbers;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class SolutionSampleTest {
    @Test
    public void testSomething() {

        assertEquals(0, FindOddCubes.cubeOdd(new int[] {-5, -5, 5, 5}));
        assertEquals(28, FindOddCubes.cubeOdd(new int[] {1, 2, 3, 4}));
        assertEquals(0, FindOddCubes.cubeOdd(new int[] {-3, -2, 2, 3}));

    }
}