package LineCoverageTest;

import org.example.Exo2.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Ex02Test {
    @Test
    public void IsAnagramValidTest() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    public void IsAnagramNullInputTest() {
        assertThrows(NullPointerException.class,()->{Anagram.isAnagram(null,null);});
    }

    @Test
    public void IsAnagramDifferentLengthTest() {
        assertFalse(Anagram.isAnagram("rmdd", "mrd"));
    }

    @Test
    public void IsAnagramSameLengthInvalidTest() {
        assertFalse(Anagram.isAnagram("rmd", "oussama"));
    }

    @Test
    public void IsAnagramEmptyStringsTest() {
        assertTrue(Anagram.isAnagram("", ""));
    }

    @Test
    public void IsAnagramWithSpacesTest() {
        assertTrue(Anagram.isAnagram("debit card", "bad credit"));
    }

}
