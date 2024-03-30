package LineCoverageTest;
import org.example.Exo5.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Ex05Test {
    @Test
    public void ToRomanTest() {
        assertEquals("I", RomanNumeral.toRoman(1));
    }
}
