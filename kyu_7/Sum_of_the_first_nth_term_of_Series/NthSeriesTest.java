package kyu_7.Sum_of_the_first_nth_term_of_Series;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;


public class NthSeriesTest {

    @Test
    public void test1() {
        assertEquals("1.57", NthSeries.seriesSum(5));
    }
    @Test
    public void test2() {
        assertEquals("1.77", NthSeries.seriesSum(9));
    }
    @Test
    public void test3() {
        assertEquals("1.94", NthSeries.seriesSum(15));
    }
}
