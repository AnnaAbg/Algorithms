public class OddIndices {
    public int[] oddIndicesAlgorithm(int[] array) {

        if (array.length != 0) {
            int[] myArray = new int[array.length / 2];
            int j = 0;
            for (int i = 1; i < array.length; i += 2) {
                myArray[j] = array[i];
                j++;
            }
            return myArray;
        }

        return new int[]{};
    }
}
