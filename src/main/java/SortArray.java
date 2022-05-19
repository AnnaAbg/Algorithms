import java.util.Arrays;

public class SortArray {

    public static int[] sortArrayAlgorithm(int[] array) {
        if (array.length == 0) {

            return new int[]{};
        }
        Arrays.sort(array);
        return array;
    }
}
