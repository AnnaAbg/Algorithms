import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonSubstringTest {

    @Test
    public void testLongestCommonSubstringHappyPath() {

        String str1 = "Smaze";
        String str2 = "amazing";
        String str3 = "amazon";
        String expectedResult = "maz";

        LongestCommonSubstring lcstr = new LongestCommonSubstring();
        String actualResult = lcstr.longestCommonSubstringAlgorithm(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
