import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeOnTheRightTest {

    @Test
    public void testNegativeOnTheRightHappyPath() {

        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        NegativeOnTheRight nr = new NegativeOnTheRight();
        int[] actualResult = nr.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
