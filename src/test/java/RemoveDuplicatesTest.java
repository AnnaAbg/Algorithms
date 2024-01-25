import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class RemoveDuplicatesTest {

    @Order(1)
    @Test
    public void testRemoveDuplicatesHappyPath() {

        String str = "AABBCCaabbcc";
        String expectedResult = "abc";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.removeDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testRemoveDuplicatesEmptyString() {

        String str = "";
        String expectedResult = "";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.removeDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testRemoveDuplicatesTrimSpaces() {

        String str = "   AABBCCaabbcc     ";
        String expectedResult = "abc";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.removeDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
