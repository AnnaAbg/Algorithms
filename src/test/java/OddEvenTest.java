import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Order(1)
    @Test
    public void testOddEvenHappyPathOddPositive() {

        long number = 345;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }


    @Order(3)
    @Test
    public void testOddEvenOddHappyPathOddNegative() {

        long number = -345;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }


    @Order(2)
    @Test
    public void testOddEvenHappyPathEvenPositive() {

        long number = 2;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);


        Assertions.assertEquals(expectedResult, actualResult);

    }


    @Order(4)
    @Test
    public void testOddEvenHappyPathEvenNegative() {

        long number = -2;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);


        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(5)
    @Test
    public void testOddEvenUndefinedPositive() {

        long number = 2147483648L;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);


        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(6)
    @Test
    public void testOddEvenUndefinedNegative() {

        long number = -2147483649L;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);


        Assertions.assertEquals(expectedResult, actualResult);

    }


    @Order(7)
    @Test
    public void testOddEvenHappyZero() {

        long number = 0;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEvenAlgorithm(number);


        Assertions.assertEquals(expectedResult, actualResult);

    }

}


