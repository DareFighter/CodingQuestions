package Arrays;

public class Rotation {

    //12345
    //23451
    public static void LeftRotateByOne(int[] arr){
        int first = arr[0];

        for(int i = 0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length - 1] = first;
    }

    //12345
    //2 places
    //34512
    public static void LeftRotate(int[] arr, int places){
        for(int i = 0; i<places; i++){
            LeftRotateByOne(arr);
        }
    }

    public static void LeftRotate2(int[] arr, int places){
        int[] temp = new int[places];

        for(int i = 0; i<places;i++){
            temp[i] = arr[i];
        }

        for(int i = places; i<arr.length; i++){
            arr[i-places] = arr[i];
        }
        //345
        for(int i =0; i<places;i++){
            arr[arr.length - places+i] = temp[i];
        }
    }

    public static void LeftRotate3(int[] arr, int places){
        reverse(arr,0,places-1);
        reverse(arr,places,arr.length -1);
        reverse(arr,0,arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
