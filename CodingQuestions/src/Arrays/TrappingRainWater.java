package Arrays;

public class TrappingRainWater {
    public static int calculateTotalRainWater(int[] arr){
        int res = 0;


        for(int i =1; i<arr.length -1; i++){
            int lMax = arr[i];
            for(int j=0;j <i;j++){
                lMax = Math.max(lMax, arr[j]);
            }

            int rMax = arr[i];
            for(int k = i+1; k <arr.length;k++){
                rMax = Math.max(rMax, arr[k]);
            }

            res += Math.min(lMax,rMax) - arr[i];
        }

        return res;
    }
}
