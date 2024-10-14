package DP;

public class KadaneAlgorithm {

    public static long maximumSum(int arr[]){
        long max = Integer.MIN_VALUE;
        long prevSum = 0;

        for(int i=0; i<arr.length; i++){
            prevSum = arr[i] + prevSum;

            if(prevSum > max){
                max = prevSum;
            }
        }

        return max;
    }

    public static long maximumSumDp(int arr[]){
        long[] dp = new long[arr.length];
        dp[0] = arr[0];
        long max = dp[0];

        for(int i = 1; i<arr.length; i++){
            dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
            System.out.print(dp[i] + " ");
            if(dp[i] > max){
                max = dp[i];
            }
        }

        System.out.println();
        return max;
    }

    public static long maximumSumDp2(int arr[]){
        long[] dp = new long[arr.length];
        dp[0] = arr[0];
        dp[1] = arr[1];
        long max = dp[0];

        for(int i = 2; i < arr.length; i++){
            dp[i] = arr[i] + dp[i-2];
            if(dp[i] > max){
                max = dp[i];
            }
        }

        return max;
    }
}
