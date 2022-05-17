import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPath() {

        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumberAlgorithm(555);

        Assertions.assertTrue(expectedResult, String.valueOf(actualResult));

    }

    @Order(2)
    @Test
    public void testIsPositiveNumberHappyPathZero() {

        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumberAlgorithm(0);

        Assertions.assertTrue(expectedResult, String.valueOf(actualResult));

    }


    @Order(3)
    @Test
    public void testIsPositiveNumberHappyPathNegative() {

        boolean expectedResult = false;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumberAlgorithm(-555);

        Assertions.assertFalse(expectedResult, String.valueOf(actualResult));

    }

    @Order(4)
    @Test
    public void testIsPositiveNumberIntAssertionPositive() {

        int number = 7777;
        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(5)
    @Test
    public void testIsPositiveNumberIntAssertionZero() {

        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }


    @Order(6)
    @Test
    public void testIsPositiveNumberIntAssertionNegative() {

        int number = -33333;
        boolean expectedResult = false;

        IsPositiveNumber pn = new IsPositiveNumber();
        boolean actualResult = pn.isPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
