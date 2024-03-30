package BranchCoverageTest;
import org.example.Exo6.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Ex06Test {
    @Test
    public void FizzBuzzTest() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }


    @Test
    public void FizzBuzzMultipleOf3Test() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void FizzBuzzMultipleOf5Test() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void FizzBuzzMultipleOf15Test() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }
    @Test
    public void FizzBuzzLessOrEqualsThanOne(){
        assertThrows(IllegalArgumentException.class,()->{
            FizzBuzz.fizzBuzz(0);
        });
    }
}
