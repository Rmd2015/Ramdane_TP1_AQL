package ConditionCoverageTest;
import org.example.Exo4.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Ex04Test {
    @Test
    public void SolveOneRootTest() {
        double[] expected = {-1.0};
        double[] actual = QuadraticEquation.solve(1, 2, 1);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void SolveNoRootsTest() {
        assertNull(QuadraticEquation.solve(1, 1, 1));
    }

    @Test
    public void SolveWithZeroATest() {
        assertThrows( IllegalArgumentException.class,()->{QuadraticEquation.solve(0, 2, 1);});
    }
}
