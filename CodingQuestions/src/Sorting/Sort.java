package Sorting;

public class Sort {

    public static void BubbleSort(int[] arr){

        for(int i=0; i<arr.length - 1; i++){
            boolean isSwapped = false;
            for(int j=0;j<arr.length -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }

            if(isSwapped == false){
                break;
            }
        }
    }

    public static void SelectionSort(int[] arr){

        int[] temp = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int min_idx = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            temp[min_idx] = arr[min_idx];
            arr[min_idx] = Integer.MAX_VALUE;
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = temp[i];
        }
    }

    public static  void OptimalSelectionSort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            int min_idx = 0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void InsertionSort(int[] arr){

        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }





}
