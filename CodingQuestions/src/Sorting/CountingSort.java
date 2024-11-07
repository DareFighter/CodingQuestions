package Sorting;

public class CountingSort {

    public static void bruteforce(int[] arr, int k) {
        int[] count = new int[k];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i < k; i++) {

            for (int j = 0; j < count[i]; j++) {
                arr[index] = i;
                index++;
            }
        }
    }

    public static void countSort(int[] arr, int k) {
        int[] count = new int[k];
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i < k; i++) {
            count[i] = count[i - 1] + count[i];
        }
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
