package Recursion;

import java.util.ArrayList;
import java.util.*;

public class PossibleWords {

    private static final String[] KEYPAD = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    public static ArrayList<String> possibleWords(int a[], int N) {
        var res = new ArrayList<String>();

        if (N == 0) {
            return res;
        }

        // Start recursive backtracking from the first index
        backTrack(res, a, N, "", 0);

        return res;
    }

    private static void backTrack(ArrayList<String> result, int[] a, int N, String current, int index) {
        // Base case : if current string length equals N add to result
        if (index == N) {
            result.add(current);
            return;
        }

        String letters = KEYPAD[a[index]];

        // Recurse for each letter that the current digit can represent
        for (char letter : letters.toCharArray()) {
            backTrack(result, a, N, current + letter, index + 1);
        }
    }

}
