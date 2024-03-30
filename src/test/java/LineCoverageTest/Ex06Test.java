package LineCoverageTest;

import org.example.Exo6.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ex06Test {
    @Test
    public void FizzBuzzTest() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }
}
