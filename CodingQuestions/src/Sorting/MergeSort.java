package Sorting;

public class MergeSort {

    // [1,3,5,7]
    // [0,2,6,8,9]
    // [0,1,2,3]
    // [5,6,7,8,9]
    // naive approach
    public static void MergeWithoutExtraSpace(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;

        while (i < arr1.length) {
            if (arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                FixArray2(arr2);
            }

            i++;
        }
    }

    public static void FixArray2(int[] arr) {
        int first = arr[0];
        int i;
        for (i = 1; i < arr.length && arr[i] < first; i++) {
            if (arr[i] < arr[i - 1]) {
                arr[i - 1] = arr[i];
            }
            arr[i - 1] = first;
        }
    }

    public static void sort(int arr[], int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
            merge(arr, left, right, middle);
        }
    }

    private static void merge(int arr[], int left, int right, int middle) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[middle + j + 1];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
