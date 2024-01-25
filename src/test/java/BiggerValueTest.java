import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    @Order(1)
    @Test
    public void testBiggerValueHappyPath() {

        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testBiggerValueNegative() {

        int a = -3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testBiggerValueHappyPass3() {

        int a = -3333;
        int b = 3333;
        int expectedResult = 3333;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
