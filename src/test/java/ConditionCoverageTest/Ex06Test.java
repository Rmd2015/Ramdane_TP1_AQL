package ConditionCoverageTest;
import org.example.Exo6.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Ex06Test {
    @Test
    public void FizzBuzzTest() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }


    @Test
    public void FizzBuzzZeroTest() {
        assertThrows(IllegalArgumentException.class,()->{FizzBuzz.fizzBuzz(0);});
    }

    @Test
    public void FizzBuzzNegativeTest() {
        assertThrows(IllegalArgumentException.class,()->{FizzBuzz.fizzBuzz(-1);});
    }
}
