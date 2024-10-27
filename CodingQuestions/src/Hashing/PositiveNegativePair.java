package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class PositiveNegativePair {

    /*
     * n = 8
     * arr[] = {1,3,6,-2,-1,-3,2,7}
     * Output: -1 1 -3 3 -2 2
     * Explanation: 1, 3 and 2 are present
     * pairwise positive and negative. 6 and
     * 7 have no pair.
     */
    public static ArrayList<Integer> findPairs(int arr[], int n) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(Math.abs(arr[i]))) {
                int curr = arr[i];
                if (curr < 0) {
                    res.add(-curr);
                    res.add(Math.abs(curr));
                } else {

                    res.add(curr);
                    res.add(Math.abs(arr[i]));
                }
            } else {
                var num = arr[i];
                if (num < 0) {
                    num = Math.abs(num);
                }

                map.put(num, i);
            }
        }

        return res;
    }

}
