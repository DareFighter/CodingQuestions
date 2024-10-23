package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class IndexesOfSubArraySum {

    public static ArrayList<Integer> bruteForce(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr += arr[j];
                if (curr == target) {
                    res.add(i + 1);
                    res.add(j + 1);
                    return res;
                }
            }
        }

        if (res.size() == 0) {
            res.add(-1);
        }

        return res;
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int target) {

        var res = new ArrayList<Integer>();
        var map = new HashMap<Integer, Integer>();

        int currentSum = 0;
        map.put(0, 0);
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            int difference = currentSum - target;

            if (map.containsKey(difference)) {
                res.add(map.get(difference) + 1);
                res.add(i + 1);
                return res;
            }
            map.put(currentSum, i + 1);
        }

        if (res.size() == 0) {
            res.add(-1);
        }
        return res;
    }

}
