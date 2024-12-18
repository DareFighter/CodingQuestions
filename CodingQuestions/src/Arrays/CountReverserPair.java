package Arrays;

public class CountReverserPair {

    // a pair is said to be reverse pair if i >= 0 && i < j && j < N && arr[i] > 2 *
    // arr[j]
    public static int bruteforce(int N, int arr[]) {
        int maxCount = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > 2 * arr[j]) {
                    maxCount++;
                }
            }
        }
        return maxCount;
    }

    public static int countReversePairs(int[] arr) {
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }

    private static int mergeSortAndCount(int[] arr, int left, int right) {
        if (left >= right) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        int count = mergeSortAndCount(arr, left, mid) + mergeSortAndCount(arr, mid + 1, right);
        count += countAndMerge(arr, left, mid, right);
        return count;
    }

    private static int countAndMerge(int[] arr, int left, int mid, int right) {
        // Counting
        int count = 0;
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && arr[i] > 2L * arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        // Merging the two halves
        int[] temp = new int[right - left + 1];
        int i = left, k = 0;
        j = mid + 1;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, 0, arr, left, temp.length);
        return count;
    }
}
