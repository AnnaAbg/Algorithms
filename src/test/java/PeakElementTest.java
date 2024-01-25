import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class PeakElementTest {

    @Order(1)
    @Test
    public void testPeakElementAlgorithmHappyPath() {

        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement pek = new PeakElement();
        int[] actualResult = pek.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testPeakElementAlgorithmNegativeValues() {

        int[] array = {-3, 2, -7, 5, 1, -9, 23, 1};
        int[] expectedResult = {2, 5, 23};

        PeakElement pek = new PeakElement();
        int[] actualResult = pek.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testPeakElementAlgorithmDuplicateValues() {

        int[] array = {5, 5, 5, 5, 7, 5, 5, 5};
        int[] expectedResult = {7};

        PeakElement pek = new PeakElement();
        int[] actualResult = pek.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testPeakElementAlgorithmEmptyArray() {

        int[] array = {8, 8, 8, 8, 8, 8, 8, 8};
        int[] expectedResult = {};

        PeakElement pek = new PeakElement();
        int[] actualResult = pek.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}

