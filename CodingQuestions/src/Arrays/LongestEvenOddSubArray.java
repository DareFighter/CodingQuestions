package Arrays;

/*
 * Problem 
 * Ex: [10,12,14,7,8]
 * To find the length of longest even odd subarray the subarray can be alternating even and odd
 * or odd and even
 * 14,7,8 even,odd,even so the the length is 3;
 */

public class LongestEvenOddSubArray {

    public static int lengthOfLongestEvenOddSubArray(int[] arr) {
        int res = 1;

        int currLength = 1;
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = arr[i - 1];
            if ((isEven(curr) && isOdd(prev)) || (isEven(prev) && isOdd(curr))) {
                currLength++;
                res = Math.max(res, currLength);
            } else {
                currLength = 1;
            }
        }

        return res;
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    private static boolean isOdd(int num) {
        return num % 2 != 0;
    }
}
