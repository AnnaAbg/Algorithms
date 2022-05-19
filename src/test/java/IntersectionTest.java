import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntersectionTest {

    @Order(1)
    @Test
    public void testIntersectionHappyPath() {

        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection in = new Intersection();
        int[] actualResult = in.intersectionAlgorithm(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testIntersectionNegative() {

        int[] arr1 = {1, 2, 4, 5, 8, 9};
        int[] arr2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        Intersection in = new Intersection();
        int[] actualResult = in.intersectionAlgorithm(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testIntersectionEmptyValue() {

        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 45};
        int[] expectedResult = {};

        Intersection in = new Intersection();
        int[] actualResult = in.intersectionAlgorithm(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
