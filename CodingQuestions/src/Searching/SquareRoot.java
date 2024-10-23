package Searching;

/*
 Given an integer n, find the square root of n. If n is not a perfect square, then return the floor value.

    Floor value of any number is the greatest Integer which is less than or equal to that number

Examples:

Input: n = 5
Output: 2
Explanation: Since, 5 is not a perfect square, floor of square_root of 5 is 2.

Input: n = 4
Output: 2
Explanation: Since, 4 is a perfect square, so its square root is 2.

Constraints:
1 ≤ n ≤ 107
 */

public class SquareRoot {

    public static int bruteforce(int num) {
        int i = 1;

        while (i * i <= num) {
            i++;
        }

        return i - 1;
    }

    public static long floorSqrt(long n) {
        if (n == 0 || n == 1) {
            return n;
        }

        long start = 0;
        long end = n;
        long result = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid < n) {
                start = mid + 1;
                result = end;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}
