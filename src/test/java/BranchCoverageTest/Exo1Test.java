package BranchCoverageTest;

import org.example.Exo1.Palidrome;
import org.example.Exo1.PalindromeCorrection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Exo1Test {
  @Test
    public void PalidromeBranchCoverageTest()
  {
      //COVERTURE DE BRANCAHE ON NE RENTRE PAS DANS LE DETAIILES.
      Assertions.assertTrue(PalindromeCorrection.isPalindrome("rar"));
  }

}
