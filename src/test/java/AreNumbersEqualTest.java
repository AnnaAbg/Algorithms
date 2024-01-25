import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathEqualNumbers() {

        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathLess() {

        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathGreater() {

        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
