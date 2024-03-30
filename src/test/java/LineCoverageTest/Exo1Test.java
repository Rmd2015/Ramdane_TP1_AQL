package LineCoverageTest;

import org.example.Exo1.Palidrome;
import BranchCoverageTest.PalindromeCorrection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exo1Test {
    @Test
    public void PalindromeLineCoverageTest() {
      Assertions.assertTrue(Palidrome.isPalindrome("rar"));
        Assertions.assertTrue(Palidrome.isPalindrome("ramdane"));
        Assertions.assertTrue(Palidrome.isPalindrome("hello"));
        Assertions.assertThrows(NullPointerException.class, () -> {
            Palidrome.isPalindrome(null);
        });
    }
    @Test
    public void PalidromeCorrectionLineCoverageTest(){
        Assertions.assertTrue(PalindromeCorrection.isPalindrome("radar"));
        Assertions.assertTrue(PalindromeCorrection.isPalindrome("rar"));
        Assertions.assertTrue(PalindromeCorrection.isPalindrome("word"));
        Assertions.assertThrows(NullPointerException.class, () -> {
            PalindromeCorrection.isPalindrome(null);
        });

    }
}
