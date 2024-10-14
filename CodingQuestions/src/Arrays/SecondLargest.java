package Arrays;

public class SecondLargest {

    public static int getLargest(int[] arr){
        int res = arr[0];

        for(int i=0;i<arr.length;i++){
            if(res < arr[i]){
                res = arr[i];
            }
        }

        return res;
    }

    public static int getSecondLargest(int[] arr){
        int largest = getLargest(arr);
        int secondLargest = -1;

        for(int i=0; i<arr.length;i++){
            if(arr[i] != largest){
                if(secondLargest == -1){
                    secondLargest = arr[i];
                }
                else if(secondLargest < arr[i]){
                    secondLargest = arr[i];
                }
            }
        }

        return secondLargest;
    }

    public static int getSecondLargestNum(int[] arr){
        int largest = arr[0];
        int secondLargest = -1;

        for(int i= 1; i<arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(secondLargest < arr[i] && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
