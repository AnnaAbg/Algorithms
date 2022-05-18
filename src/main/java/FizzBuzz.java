public class FizzBuzz {

    public String fizzBuzzAlgorithm(Integer m) {

        String number1 = "Good Number";
        String number2 = "Bad Number";
        String number3 = "Poor Number";
        String doesNotSatisfyCondition = "-1";

        if ((m % 3 == 0) && (m % 5 == 0)) {
            return "Good Number";
        } else if (m % 3 == 0) {
            return "Bad Number";
        } else if (m % 5 == 0) {
            return "Poor Number";
        } else {
            return "-1";
        }
    }
}
