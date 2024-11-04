package Searching;

public class FloorInaSortedArray {

    public static int findFloor(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;
        int floorIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= k) {
                floorIndex = mid;
                low = mid + 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            }

        }

        return floorIndex;
    }

}
