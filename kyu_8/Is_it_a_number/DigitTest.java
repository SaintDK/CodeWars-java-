package kyu_8.Is_it_a_number;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DigitTest {

    MyUtilities myUtil = new MyUtilities();

    @Test
    public void test0() throws Exception
    {
        assertEquals(false,myUtil.isDigit("s2324"));
    }
    @Test
    public void test1() throws Exception
    {
        assertEquals(true,myUtil.isDigit("-234.4"));
    }

}