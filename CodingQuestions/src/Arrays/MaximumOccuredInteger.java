package Arrays;

public class MaximumOccuredInteger {

    public static int maxOccured(int n, int l[], int r[], int maxx) {
        int[] freq = new int[maxx + 2];

        for (int i = 0; i < n; i++) {
            freq[l[i]] += 1;
            freq[r[i] + 1] -= 1;
        }

        int maxOccured = freq[0];
        int result = 0;
        int currentSum = freq[0];

        for (int i = 1; i <= maxx; i++) {
            currentSum += freq[i];
            if (currentSum > maxOccured) {
                maxOccured = currentSum;
                result = i;
            }
        }

        return result;
    }
}
