package Sorting;

public class MergeSort {

    //[1,3,5,7]
    //[0,2,6,8,9]
    //[0,1,2,3]
    //[5,6,7,8,9]
    //naive approach
    public static void MergeWithoutExtraSpace(int[] arr1, int[] arr2){
        int i =0;
        int j = 0;

        while(i<arr1.length){
            if(arr1[i] > arr2[i]){
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
                FixArray2(arr2);
            }

            i++;
        }
    }

    public static void FixArray2(int[] arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
    }
}
