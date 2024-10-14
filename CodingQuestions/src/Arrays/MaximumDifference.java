package Arrays;

public class MaximumDifference {
    public static int BruteForce(int[] arr){
        int max = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                max = Math.max(max,j-i);
            }
        }
        return max;
    }

    public static int MaxDiff(int[] arr){
        int maxDiff = arr[1] - arr[0];
        int minElem = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]-minElem > maxDiff){
                maxDiff = arr[i] - minElem;
            }

            if(arr[i] < minElem){
                minElem = arr[i];
            }
        }

        return maxDiff;
    }
}
