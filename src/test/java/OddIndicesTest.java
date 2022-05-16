import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Order(1)
    @Test
    public void testOddIndicesHappyPathPositive() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices od = new OddIndices();
        int[] actualResult = od.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


    @Order(2)
    @Test
    public void testOddIndicesHappyPathNegative() {
        int[] array = {45, -590, 234, -985, 12, -68};
        int[] expectedResult = {-590, -985, -68};

        OddIndices od = new OddIndices();
        int[] actualResult = od.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


    @Order(3)
    @Test
    public void testOddIndicesEmptyArray() {
        int[] array = {};
        int[] expectedResult = {};

        OddIndices od = new OddIndices();
        int[] actualResult = od.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);


    }

}
