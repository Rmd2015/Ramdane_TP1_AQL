package ConditionCoverageTest;

import org.example.Exo2.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ex02Test {
    @Test
    public void IsAnagramWithNonAnagramsTest() {
        assertFalse(Anagram.isAnagram("hello", "world"));
        // couvre une condition où deux chaînes ne sont pas des anagrammes.
    }
    @Test
    public void IsAnagramWithAnagramsOfDifferentLengthTest() {
        assertFalse(Anagram.isAnagram("listen", "silentttt"));
        //couvre une condition où deux chaînes sont de longueurs différentes, donc elles ne peuvent pas être des anagrammes.
    }
    @Test
    public void IsAnagramValidTest() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
        //couverture de condition complète
    }
    @Test
    public void IsAnagramNullInputTest() {
        assertThrows(NullPointerException.class,()->{Anagram.isAnagram(null,"hh");});
        //coverture de la condition if(s1==null)
    }

}
