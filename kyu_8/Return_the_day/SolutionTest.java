package kyu_8.Return_the_day;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

class SolutionTest {
    @Test
    void testSomething() {
        assertEquals("Sunday",DayOfWeek.getDay(1));
        assertEquals("Monday",DayOfWeek.getDay(2));
        assertEquals("Tuesday",DayOfWeek.getDay(3));
        assertEquals("Wrong, please enter a number between 1 and 7",DayOfWeek.getDay(8));
        assertEquals("Wrong, please enter a number between 1 and 7",DayOfWeek.getDay(20));
    }
}
