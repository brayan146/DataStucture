import org.example.Sorts.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuicckSortTests {
    @Test
    public void QuickSortTest() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int[] expected = {5, 6, 7, 11, 12, 13};
        Assertions.assertArrayEquals(expected, arr);
    }
}
