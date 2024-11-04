package Arrays;

import java.util.HashSet;

public class KthDistance {

    public static boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        boolean res = false;

        for (int i = 0; i < arr.length - k; i++) {

            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j <= i + k; j++) {
                if (set.contains(arr[j])) {
                    res = true;
                    return res;
                } else {
                    set.add(arr[j]);
                }
            }
        }

        return res;
    }

}