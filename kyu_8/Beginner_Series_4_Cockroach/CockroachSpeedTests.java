package kyu_8.Beginner_Series_4_Cockroach;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CockroachSpeedTests{
    @Test
    public void basicTests() throws Exception{
        Cockroach cockroach = new Cockroach();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
        assertEquals(30, cockroach.cockroachSpeed(1.09));
        assertEquals(0, cockroach.cockroachSpeed(0));
    }
}