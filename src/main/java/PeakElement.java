public class PeakElement {

    public int[] peakElementAlgorithm(int[] array) {

        int[] result = new int[]{};
        if (array.length != 0 || array != null) {
            int countArray = 0;

            if (array[0] > array[1] || array[array.length - 1] > array[array.length - 2]) {
                countArray += 1;
            }

            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    countArray++;
                }
            }
            System.out.println(countArray);


            result = new int[countArray];
            countArray = 0;
            if (array[0] > array[1]) {
                result[0] = array[0];
                countArray++;
            }
            if (array[array.length - 1] > array[array.length - 2]) {
                result[result.length - 1] = array[array.length - 1];
            }

            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    result[countArray] = array[i];
                    countArray++;
                }
            }

        }
        return result;
    }
}
