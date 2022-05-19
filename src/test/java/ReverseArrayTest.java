import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseArrayTest {


    @Order(1)
    @Test
    public void testReverseArrayHappyPath() {

        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray rev = new ReverseArray();
        int[] actualResult = rev.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testReverseArrayNegative() {

        int[] array = {-2, -7, -3, -10};
        int[] expectedResult = {-10, -3, -7, -2};

        ReverseArray rev = new ReverseArray();
        int[] actualResult = rev.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testReverseArrayZero() {

        int[] array = {1, 0, 1, 0};
        int[] expectedResult = {0, 1, 0, 1};

        ReverseArray rev = new ReverseArray();
        int[] actualResult = rev.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
