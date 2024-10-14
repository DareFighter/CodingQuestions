package Searching;

public class SquareRoot {

    public static int GetSquareRoot(int num){
        int i = 1;

        while( i*i <= num){
            i++;
        }

        return i - 1;
    }
}
