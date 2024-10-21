package Arrays;

import java.util.HashMap;

public class TwoSum {

    public static boolean isSumPresent(int sum, int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int difference = sum - arr[i];
            if (map.containsKey(difference)) {
                return true;
            } else {
                map.put(arr[i], i);
            }
        }

        return false;
    }
}
