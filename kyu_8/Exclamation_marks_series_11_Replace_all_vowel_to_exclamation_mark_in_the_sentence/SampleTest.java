package kyu_8.Exclamation_marks_series_11_Replace_all_vowel_to_exclamation_mark_in_the_sentence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTest {
    @Test
    public void basicTests() {
        assertEquals("H!!",      Solution.replace("Hi!"));
        assertEquals("!H!! H!!", Solution.replace("!Hi! Hi!"));
        assertEquals("!!!!!",    Solution.replace("aeiou"));
        assertEquals("!BCD!",    Solution.replace("ABCDE"));
    }
}