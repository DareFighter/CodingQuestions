package Strings;

public class MultiplyTwoStrings {

    public static String multiplyStrings(String s1, String s2) {
        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }

        // Determine if the result should be negative
        boolean isNegative = (s1.charAt(0) == '-') ^ (s2.charAt(0) == '-');

        // Remove leading '-' if present
        if (s1.charAt(0) == '-') {
            s1.substring(1);
        }

        if (s2.charAt(0) == '-') {
            s2.substring(1);
        }

        // Initialize result array to hold the product
        int n1 = s1.length();
        int n2 = s2.length();
        int[] result = new int[n1 + n2];

        // Multiply each digit and store the results
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        if (isNegative) {
            sb.insert(0, '-');
        }
        return sb.toString();
    }
}
