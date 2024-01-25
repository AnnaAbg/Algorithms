import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    @Order(1)
    @Test
    public void testSumArrayHappyPathPositive() {

        int[] myArray = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(myArray);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrayNegative() {

        int[] myArray = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(myArray);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSumArrayNegativeNumbers() {

        int[] myArray = {-0, -1, -2, -3, -4, -5};
        int expectedResult = -15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(myArray);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testSumArrayHappyPathPositiveNumbers() {

        int[] myArray = {7, 3};
        int expectedResult = 10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(myArray);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testSumArrayHappyPathZero() {

        int[] myArray = {0};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(myArray);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testSumArrayEmptyArray() {

        int[] myArray = {};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(myArray);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}



