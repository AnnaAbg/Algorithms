public class AscendingSequence {
    // 0,1,2,3,4,5;

    public int[] ascendingSequenceAlgorithm(int start, int end, int step) {

        // Rules for ascending sequence  // if the data are valid
        if (step > 0 && start < end) {
            //int[] result = new int[end - start + 1]; // +1 is to count all the elements after sub - for the first 3 tests
            // int[] result = new int[(end - start + 1) / step] ; // for the test StepTwo
            int[] result = new int[((end - start) / step) +1] ; // for the last test


            for (int i = 0; i < result.length; i++) {
                if (start <= end) {
                    result[i] = start;
                    start += step;
                    // if start is > then end we are not count anything
                }
            }
            return result;

        }
        return new int[]{};  // if the data are not valid

    }
}

