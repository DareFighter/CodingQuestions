package Recursion;

public class PowerOfNumbers {
    static final int MOD = 1000000007;

     public static long  power(int N, int R){
        return  powerHelper(N,R);
    }

    public static long powerHelper(int N, int R){
        if(R == 0){
            return 1;
        }

        long half = powerHelper(N, R/2);
        long halfSquared = (half * half) % MOD;

        if( R % 2 == 0){
            return halfSquared;
        }
        else{
            return (N * halfSquared) % MOD;
        }
    }
}
