import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {

    @Order(1)
    @Test
    public void testMinMaxAveHappyPath() {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int min = 2;
        int max = 6;

        int [] expectedResult = {3,7,5};

        MinMaxAve mma = new  MinMaxAve();
        int [] actualResult = mma. minMaxAveAlgorithm(array,min,max);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Order(2)
    @Test
    public void testMinMaxAveArraysLength() {

        int [] array = {7};
        int min = 0;
        int max = 0;

        int [] expectedResult = {7,7,7};

        MinMaxAve mma = new  MinMaxAve();
        int [] actualResult = mma. minMaxAveAlgorithm(array,min,max);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Order(3)
    @Test
    public void testMinMaxAveArrayZeroValues() {

        int [] array = {0,0,0,0};
        int min = 2;
        int max = 3;

        int [] expectedResult = {0,0,0};

        MinMaxAve mma = new  MinMaxAve();
        int [] actualResult = mma. minMaxAveAlgorithm(array,min,max);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Order(4)
    @Test
    public void testMinMaxAveTwoValuesNegative() {

        int [] array = {2,10};
        int min = 0;
        int max = 3;

        int [] expectedResult = {};

        MinMaxAve mma = new  MinMaxAve();
        int [] actualResult = mma. minMaxAveAlgorithm(array,min,max);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Order(4)
    @Test
    public void testMinMaxAveMaxNegative() {

        int [] array = {2,10};
        int min = 0;
        int max = -3;

        int [] expectedResult = {};

        MinMaxAve mma = new  MinMaxAve();
        int [] actualResult = mma. minMaxAveAlgorithm(array,min,max);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test
    public void testMinMaxAveEmptyArray() {

        int [] array = {};
        int min = 2;
        int max = 6;

        int [] expectedResult = new int[] {};

        MinMaxAve mma = new  MinMaxAve();
        int [] actualResult = mma. minMaxAveAlgorithm(array,min,max);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
}
