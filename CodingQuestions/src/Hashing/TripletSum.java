package Hashing;

import java.util.Arrays;

public class TripletSum {

    public static boolean bruteforce(int[] arr, int n, int target) {

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int currSum = arr[i] + arr[j] + arr[k];
                    if (currSum == target) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean find3Numbers(int[] arr, int n, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            int difference = target - arr[i];
            if (twoSum(arr, i + 1, difference)) {
                return true;
            }
        }

        return false;
    }

    private static boolean twoSum(int[] arr, int start, int target) {

        int low = start;
        int high = arr.length - 1;

        while (low < high) {
            int currSum = arr[low] + arr[high];
            if (currSum == target) {
                return true;
            }

            if (currSum > target) {
                high--;
            } else {
                low++;
            }
        }

        return false;
    }

}
