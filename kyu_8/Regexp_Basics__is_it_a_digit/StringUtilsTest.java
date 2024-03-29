package kyu_8.Regexp_Basics__is_it_a_digit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void fixedTests() {
        assertFalse(StringUtils.isDigit(""));
        assertTrue(StringUtils.isDigit("7"));
        assertFalse(StringUtils.isDigit(" "));
        assertFalse(StringUtils.isDigit("a"));
        assertFalse(StringUtils.isDigit("a5"));
        assertFalse(StringUtils.isDigit("14"));
    }
}