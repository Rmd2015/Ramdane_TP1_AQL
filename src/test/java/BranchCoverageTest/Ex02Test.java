package BranchCoverageTest;

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
       assertThrows(NullPointerException.class,()->{Anagram.isAnagram(null,"dts");});
    }

    @Test
    public void IsAnagramDifferentLengthTest() {
        assertFalse(Anagram.isAnagram("listen", "silentt"));
    }

    @Test
    public void IsAnagramSameLengthInvalidTest() {
        assertFalse(Anagram.isAnagram("listen", "hello"));
        //couvre une branche où les deux chaînes ont la même longueur et sont des anagrammes.
    }

    @Test
    public void IsAnagramEmptyStringsTest() {
        assertTrue(Anagram.isAnagram("", ""));
    }

    @Test
    public void IsAnagramWithSpacesTest() {
        assertTrue(Anagram.isAnagram("Astronomer", "Moon starer"));
    }

    @Test
    public void IsAnagramWithNonAnagramsTest() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }

    @Test
    public void IsAnagramWithAnagramsOfDifferentLengthTest() {
        assertFalse(Anagram.isAnagram("listen", "silentttt"));
    }

    @Test
    public void IsAnagramWithSameLengthAnagramsTest() {
        assertTrue(Anagram.isAnagram("silent", "listen"));
    }
}
