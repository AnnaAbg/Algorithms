import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoTest {

    @Test
    public void testSumOfTwoHappyPath() {

        int[] array = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo st = new SumOfTwo();
        int[][] actualResult = st.sumOfTwoAlgorithm(new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12}, 12);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
