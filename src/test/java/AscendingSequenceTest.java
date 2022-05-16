import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AscendingSequenceTest {


    AscendingSequence as;

    @BeforeEach
        //  if you want to execute some statements before all the test cases
    void setUp () {
        as = new AscendingSequence();
    }


    // to run test we use the annotation @Test

    @Order(1)
    @RepeatedTest(50)
    @Test
    public void testAscendingSequenceHappyPathPositiveNumber() {

        // Triple AAA pattern for the whole code: arrange - act -assert



        // Arrange;
        // 0,1,2,3,4,5;
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};// what we expect
        // for positive numbers

        // Act
        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);


        // Assert
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumber(){

        // Arrange;
        // -10,-9,-8,-7;
        int start = -10;
        int end= -7;
        int step= 1;
        int [] expectedResult = {-10,-9,-8,-7};
        // for negative numbers

        // Act
        AscendingSequence as = new AscendingSequence();
        int [] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        // Assert
        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Order(3)
    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNumber(){

        // Arrange;
        int start = -5;
        int end= 5;
        int step= 1;
        int [] expectedResult = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        // for negative numbers

        // Act
        AscendingSequence as = new AscendingSequence();
        int [] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        // Assert
        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Order(4)
    @Test
    public void testAscendingSequenceHappyPathStepTwo(){

        // Arrange;
        int start = 0;
        int end= 5; // the length of the array 6;
        int step= 2;
        int [] expectedResult = {0,2,4};// 3


        // Act
        AscendingSequence as = new AscendingSequence();
        int [] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        // Assert
        Assertions.assertArrayEquals(expectedResult,actualResult);

    }


    // Negative Test Scenarios
    // incorrect values, incorrect result
    @Test
    public void testAscendingSequenceStartLargerThanEnd(){

        int start = 5;
        int end= 0;
        int step= 2;
        int [] expectedResult = {};

        int [] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }


    @Test
    public void testAscendingSequenceNegativeStep(){

        int start = 0;
        int end= 5;
        int step= -1;
        int [] expectedResult = {};

        int [] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Test
    public void testAscendingSequenceStepIsZero(){


        int start = 5;
        int end= 0;
        int step= 0;
        int [] expectedResult = {};

        int [] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Test
    public void testAscendingSequence(){


        int start = -5;
        int end= 5;
        int step= 2;
        int [] expectedResult = {-5,-3,-1,1,3,5};

        int [] actualResult = as.ascendingSequenceAlgorithm(start,end,step);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
}
