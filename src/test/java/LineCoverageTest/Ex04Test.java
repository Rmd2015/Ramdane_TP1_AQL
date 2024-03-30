package LineCoverageTest;

import org.example.Exo4.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Ex04Test {
    @Test
    public void SolveOneRootTest() {
        double[] expected = {-1.0};
        double[] actual = QuadraticEquation.solve(1, 2, 1);
        assertArrayEquals(expected, actual, 0.0001);
    }
}
