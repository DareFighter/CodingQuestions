package Searching;

public class Count {

    public static int CountOnes(int[] arr){
        int start = 0;
        int end = arr.length -1;
        int count = 0;

        while(start <= end){
            if(arr[start] == 1){
                count++;
                start++;
            }
            else{
                end--;
            }
        }

        return count;
    }

    public static int CountOne(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while(low < high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == 0){
                low = mid + 1;
            }
            else if(mid == 0 || arr[mid-1] == 0){
                return arr.length - mid;
            }
        }

        return 0;
    }
}
