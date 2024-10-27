package Recursion;

import java.util.ArrayList;

public class Practice {

    // input String[] = ["abc","def"];
    // res should be [ad,ae,af,bd,be,bf,cd,ce,cf];

    public static ArrayList<String> allWords(String[] words, int N) {
        ArrayList<String> res = new ArrayList<>();

        if (N == 0) {
            return res;
        }
        backTrack(res, words, N, "", 0);
        return res;
    }

    private static void backTrack(ArrayList<String> res, String[] words, int N, String current, int index) {
        if (index == N) {
            res.add(current);
            return;
        }

        String word = words[index];

        for (var letter : word.toCharArray()) {
            backTrack(res, words, N, current + letter, index + 1);
        }
    }

}
