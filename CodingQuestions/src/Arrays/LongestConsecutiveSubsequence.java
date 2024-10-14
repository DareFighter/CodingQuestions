package Arrays;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {

    public static int findLongestSubsequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr);
        int longestSubsequenceCount = 1;
        int currentCount = 1;

        for (int i = 1; i < arr.length; i++) {

            //if previous element is same without consecutive then continue
            if(arr[i] == arr[i-1]){
                continue;
            }

            if (arr[i] == arr[i - 1] + 1) {
                currentCount++;
            } else if (arr[i] != arr[i - 1]) {
                currentCount = 1;
            }

            longestSubsequenceCount = Math.max(longestSubsequenceCount, currentCount);
        }

        return longestSubsequenceCount;
    }

}
