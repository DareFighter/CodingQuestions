package Hashing;

import java.util.*;

public class LongestConsecutiveSub {

    public static int findLongesetConseqSubSeq(int[] arr) {
        // code here
        if (arr.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        // Add all elements to the HashSet for fast lookups.
        for (int num : arr) {
            set.add(num);
        }

        int longestStreak = 0;

        // Iterate through each element and find the start of each sequence.
        for (int num : arr) {
            // Check if this is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count the consecutive sequence from the current number
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

}
