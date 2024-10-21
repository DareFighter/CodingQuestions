package Arrays;

/*Given an integer array arr[]. You need to find and return the maximum sum possible from all the subarrays.

Examples:

Input: arr[] = [1, 2, 3, -2, 5]
Output: 9
Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5).

Input: arr[] = [-1, -2, -3, -4]
Output: -1
Explanation: Max subarray sum is -1 of element (-1).

Input: arr[] = [5, 4, 7]
Output: 16
Explanation: Max subarray sum is 16 of elements (5, 4, 7)

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 105
-107 ≤ arr[i] ≤ 107
*/

public class MaximumSubArraySum {

    public static int maxSubArraySum_bruteForce(int[] arr) {
        int sum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;

            for (int j = 1; j < arr.length; j++) {
                currentSum += arr[j];
                sum = Math.max(sum, currentSum);
            }
        }

        return sum;
    }

    public static int MaximumSubArraySum(int[] arr) {
        int maxEnding = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            sum = Math.max(maxEnding, sum);
        }

        return sum;
    }

}
