package Searching;

public class Triplet {

    public static boolean IsTriplet(int[] numbers, int x){

        for(int i = 0; i<numbers.length - 2; i++){
            int left = i+1;
            int right = numbers.length - 1;

            while(left < right){
                int tripleSum = numbers[i] + numbers[left] + numbers[right];

                if(tripleSum == x){
                    return true;
                }
                else if(tripleSum > x){
                    right--;
                }
                else{
                    left++;
                }
            }
        }

        return false;
    }
}
