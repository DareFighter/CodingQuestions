package Arrays;

public class CheckArraySortedAndRotated {

    public static boolean checkRotatedAndSorted(int arr[], int num) {

        // Your code here
        int increasingBreaks = 0;
        int decreasigBreaks = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                decreasigBreaks++;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                increasingBreaks++;
            }
        }

        return (increasingBreaks == 1 || decreasigBreaks == 1);

    }

}
