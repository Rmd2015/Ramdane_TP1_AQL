package BranchCoverageTest;
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
        assertThrows(NullPointerException.class,()->{BinarySearch.binarySearch(null, 5);});

    }
    @Test
    public void BinarySearchEmptyArrayTest() {
        int[] array = {};
        int element = 5;
        int expectedIndex = -1;
        int actualIndex = BinarySearch.binarySearch(array, element);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void BinarySearchElementAtFirstIndexTest() {
        int[] array = {1, 3, 5, 7, 9};
        int element = 1;
        int expectedIndex = 0;
        int actualIndex = BinarySearch.binarySearch(array, element);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void BinarySearchElementAtLastIndexTest() {
        int[] array = {1, 3, 5, 7, 9};
        int element = 9;
        int expectedIndex = 4;
        int actualIndex = BinarySearch.binarySearch(array, element);
        assertEquals(expectedIndex, actualIndex);
    }
}
