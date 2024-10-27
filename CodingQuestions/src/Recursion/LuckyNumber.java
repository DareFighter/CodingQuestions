package Recursion;

public class LuckyNumber {

    public static boolean isLucky(int N) {
        return isLuckyHelper(N, 2);
    }

    private static boolean isLuckyHelper(int N, int k) {
        if (k > N) {
            return true;
        }

        // if N is in a position that get's deleted return false
        if (N % k == 0) {
            return false;
        }
        // Recalculate N's position in the next round of deletions
        // N now refers to its new position in the next filtered list
        N = N - (N / k);

        // Check the next iteration with k incremented by 1
        return isLuckyHelper(N, k + 1);
    }
}