package LineCoverageTest;

import org.example.Exo3.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ex03Test {
    @Test
    public void BinarySearchElementFoundTest() {
        int[] array = {1, 3, 5, 7, 9};
        int element = 5;
        int expectedIndex = 2;
        int actualIndex = BinarySearch.binarySearch(array, element);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void BinarySearchElementNotFoundTest() {
        int[] array = {1, 3, 5, 7, 9};
        int element = 6;
        int expectedIndex = -1;
        int actualIndex = BinarySearch.binarySearch(array, element);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void BinarySearchNullArrayTest() {
        assertThrows(NullPointerException.class,()->{
            BinarySearch.binarySearch(null,1);
        });
    }

    @Test
    public void BinarySearchEmptyArrayTest() {
        int[] array = {};
        int element = 5;
        int expectedIndex = -1;
        int actualIndex = BinarySearch.binarySearch(array, element);
        assertEquals(expectedIndex, actualIndex);
    }
}
