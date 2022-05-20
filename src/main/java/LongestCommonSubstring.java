public class LongestCommonSubstring {

    public String longestCommonSubstringAlgorithm(String str1, String str2, String str3) {

        if ((str1.length() > 0 && str2.length() > 0 && str3.length() > 0)) {

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            str3 = str3.toLowerCase();

            String result = "";

            if (str1.length() > str2.length()) {
                str2 = str1;
            }
            if (str1.length() > str3.length()) {
                str3 = str1;
            }

            String subString = "";
            int j = 0;
            for (int i = 0; i < str1.length(); i++) {
                subString = str1.substring(j, i + 1);
                if (str2.contains(subString) && str3.contains(subString)) {
                    result = subString;
                } else {
                    j++;
                }

            }

            return result;
        }

        return "Empty string";
    }
}
