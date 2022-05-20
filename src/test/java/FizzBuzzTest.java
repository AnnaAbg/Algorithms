import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class FizzBuzzTest {

    @Order(1)
    @Test
    public void testFizzBuzzHappyPathMultipleOf3And5() {

        int m = 15;
        String expectedResult = "Good Number";

        FizzBuzz fb = new FizzBuzz();
        String actualResult = fb.fizzBuzzAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testFizzBuzzHappyPathMultipleOf3() {

        int m = 21;
        String expectedResult = "Bad Number";

        FizzBuzz fb = new FizzBuzz();
        String actualResult = fb.fizzBuzzAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testFizzBuzzHappyPathMultipleOf5() {

        int m = 25;
        String expectedResult = "Poor Number";

        FizzBuzz fb = new FizzBuzz();
        String actualResult = fb.fizzBuzzAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testFizzBuzzDoesNotSatisfyCondition() {

        int m = 2;
        String expectedResult = "-1";

        FizzBuzz fb = new FizzBuzz();
        String actualResult = fb.fizzBuzzAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(5)
    @Test
    public void testFizzBuzzMultipleOfZeroValue() {

        int m = 0;
        String expectedResult = "Good Number";

        FizzBuzz fb = new FizzBuzz();
        String actualResult = fb.fizzBuzzAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
