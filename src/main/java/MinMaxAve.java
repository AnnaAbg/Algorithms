public class MinMaxAve {

    public int[] minMaxAveAlgorithm(int[] array, int min, int max) {
        if (array.length == 0 || min < 0 || min > max || max > array.length - 1) {

            return new int[]{};
        }

        int minValue = array[min];
        int maxValue = array[max];
        int average = 0;
        int sum = 0;

        for (int i = min; i <= max; i++) {
            if (minValue < array[i]) {
                maxValue = array[i];

            }
            if (minValue > array[i]) {
                minValue = array[i];
            }
            sum += array[i];

        }
        average = sum / (maxValue - minValue + 1);
        int[] result = {minValue, maxValue, average};

        return result;
    }
}
