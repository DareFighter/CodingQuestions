package Sorting;

public class QuickSort {

    public static int Partition(int arr[], int low, int high){
        int pivot = arr[low];
        int i = low - 1, j = high + 1;

        while(true){
            do{
                i++;
            }while(arr[i] < pivot);

            do {
                j--;
            }while (arr[j] > pivot);

            if(i >= j){
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void Sort(int[] arr, int low, int high){
        if(low < high){
            int pi = Partition(arr,low, high);

            Sort(arr,low,pi);
            Sort(arr,pi+1,high);
        }
    }
}
