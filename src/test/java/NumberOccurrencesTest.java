import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class NumberOccurrencesTest {

    NumberOccurrences noc;

    @BeforeEach
    void setUp() {
        noc = new NumberOccurrences();
    }


    @Order(1)
    @Test
    public void testNumberOccurrencesHappyPath() {


        int[] array = new int[]{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][] expectedResult = new int[][]{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};


        int[][] actualResult = noc.numberOccurrencesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testNumberOccurrencesNegativeValues() {
        int[] array = new int[]{-1, -5, -7, -1, -6, -1, -5, -6, -7, -7, -1, -6, -1, -5, -25, -1};
        int[][] expectedResult = new int[][]{{-25, 1}, {-7, 3}, {-6, 3}, {-5, 3}, {-1, 6}};


        int[][] actualResult = noc.numberOccurrencesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testNumberOccurrencesZeroValues() {
        int[] array = new int[]{0, 0, 0, 0, 0, 0, 0, 0,};
        int[][] expectedResult = new int[][]{{0, 8}};


        int[][] actualResult = noc.numberOccurrencesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testNumberOccurrencesEmptyValues() {
        int[] array = new int[]{};
        int[][] expectedResult = new int[][]{};


        int[][] actualResult = noc.numberOccurrencesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}

