public class NegativeOnTheRight {

    public int[] negativeOnTheRightAlgorithm(int[] array) {

        int n = array.length;
        int result[] = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] >= 0)
                result[j++] = array[i];
        }

        if (j == n || j == 0) {
            return array;
        }

        for (int i = 0; i < n; i++) {
            if (array[i] < 0)
                result[j++] = array[i];
        }

        for (int i = 0; i < n; i++) {
            array[i] = result[i];
        }
        return result;
    }
}
