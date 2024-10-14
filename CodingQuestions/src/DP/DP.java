package DP;

public class DP {

    public static long findNthFibonacci(int number){
        long[] dp = new long[number+1];
            for(int i = 0; i <= number; i++){
                dp[i] = -1;
            }

        return fibonacci(number,dp);
    }

    private static long fibonacci(int number, long[] dp){
        if(number <= 1){
            return number;
        }

        if(dp[number] != -1){
            return dp[number];
        }

        return dp[number] = fibonacci(number-1,dp) + fibonacci(number-2, dp);
    }

    public static long fibonnaciBottomUp(int number){
        long[] dp = new long[number+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= number; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[number];
    }

    public static int countWays(int n){
        final int MOD = 1000000007;

        // Create a dp array to store the number of ways for each sum
        int[] dp = new int[n + 1];

        // Base case: There are 0 ways to write 0 and 1 as the sum of two or more positive integers
        dp[0] = 1;

        // Fill the dp array using the bottom-up approach
        for (int i = 1; i < n; i++) {
            for (int j = i; j <=n; j++) {
                dp[j] = (dp[j] + dp[j-i]) % MOD;
            }
        }

        // Return the result for n
        return dp[n];
    }

    public static int countStairs(int n){
            int[] dp = new int[n+1];
            dp[0] = 1;

            for(int i =1; i<n;i++){
                for(int j=i; j<=n;j++){
                    dp[j] = dp[j] + dp[j-i];
                }
            }

            return dp[n-1];
    }
}
