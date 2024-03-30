package ConditionCoverageTest;
import org.example.Exo5.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Ex05Test {
    @Test
    public void ToRomanTest() {
        assertEquals("I", RomanNumeral.toRoman(1));
    }

    public void ToRomanOutOfRangeLowTest() {
        assertThrows(IllegalArgumentException.class,()->{RomanNumeral.toRoman(0);});
    }

    @Test
    public void ToRomanOutOfRangeHighTest() {
        assertThrows(IllegalArgumentException.class,()->{RomanNumeral.toRoman(4000);});
    }
}
