import java.util.Arrays;

public class NumberOccurrences {

    public int[][] numberOccurrencesAlgorithm(int[] array) {

        if (array.length > 0) {
            Arrays.sort(array);
            int number = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++)
                    if (array[j] == array[i]) {
                        break;
                    } else {
                        number++;
                        break;
                    }
            }
            int[][] result = new int[number + 1][2];
            number = 0;
            int count = 0;
            for (int i = 0; i < array.length; i += count) {
                result[number][0] = array[i];
                count = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == array[i]) {
                        count++;
                    }
                }
                result[number][1] = count;
                number++;
            }
            return result;
        }
        return new int[][]{};
    }
}
