public class RemoveDuplicates {

    public String removeDuplicatesAlgorithm(String str) {

        String result = "";
        if (str != "") {
            str = str.toLowerCase().trim();
            for (int i = 0; i < str.length(); i++) {
                result += String.valueOf(str.charAt(i));
                str = str.replace(String.valueOf(str.charAt(i)), "");
            }

        }
        return result;
    }
}
