package Arrays;

import java.util.HashMap;

public class FrequencyCount {

    public static void frequencyCount(int[] arr, int N, int P) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (var num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // now i have the count in the hashmap
        // {2:3, 3:2};
        for (int i = 0; i < arr.length; i++) {
            int key = i + 1;
            if (map.containsKey(key)) {
                arr[i] = map.get(key);
            } else {
                arr[i] = 0;
            }
        }
    }

}
