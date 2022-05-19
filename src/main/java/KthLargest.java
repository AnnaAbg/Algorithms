import java.util.Arrays;

public class KthLargest {

    public int kthLargestAlgorithm(int[] array, int k) {

        Arrays.sort(array);
        return array[array.length - k];
    }
}
