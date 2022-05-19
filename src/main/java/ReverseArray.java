public class ReverseArray {

    public static int[] reverseArrayAlgorithm(int[] array) {

        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }
        return reversedArray;
    }
}
