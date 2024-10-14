package Arrays;

public class Reverse {
    //[1,2,3,4,5]
    //[5,4,3,2,1]

    //[1,2,3,4,5]
    //[]
    //[5,4,3,2,1]



    public static int[] reverseArray(int[] numbers){
        int low = 0;
        int high = numbers.length - 1;

        while(low < high){
            int temp = numbers[low];
            numbers[low] = numbers[high];
            numbers[high] = temp;
            low++;
            high--;
        }

        return numbers;
    }
}
