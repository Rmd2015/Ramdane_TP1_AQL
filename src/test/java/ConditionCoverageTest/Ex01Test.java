package ConditionCoverageTest;

import org.example.Exo1.Palidrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ex01Test {

    @Test
    public void IsPalindromeConditionCoverageTest(){
        //chaine null
        assertThrows(NullPointerException.class,()->{Palidrome.isPalindrome(null);});
        //chaine  empty
        assertTrue(Palidrome.isPalindrome(""));
        //une seule character
        assertTrue(Palidrome.isPalindrome("r"));
        //nonpalindrome chaine
        assertFalse(Palidrome.isPalindrome("rmd"));
        //palindrome chaine
        assertTrue(Palidrome.isPalindrome("radar"));
    }

}
