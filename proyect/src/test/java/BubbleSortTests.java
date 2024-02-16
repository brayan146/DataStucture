import org.example.Sorts.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTests {
    @Test
    public void BubbleSortTest() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        BubbleSort.bubbleSort(arr);
        int[] expected = {5, 6, 7, 11, 12, 13};
        Assertions.assertArrayEquals(expected, arr);
    }
}
