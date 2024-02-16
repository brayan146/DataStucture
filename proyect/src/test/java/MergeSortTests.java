import org.example.Sorts.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortTests {
    @Test
    public void MergeSortTest() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        MergeSort.mergeSort(arr);
        int[] expected = {5, 6, 7, 11, 12, 13};
        Assertions.assertArrayEquals(expected, arr);
    }


}
