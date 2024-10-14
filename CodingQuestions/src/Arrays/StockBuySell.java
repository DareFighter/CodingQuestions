package Arrays;

import java.util.ArrayList;

public class StockBuySell {
    public static ArrayList<ArrayList<Integer>> BuySell(int arr[],int n){
        var res = new ArrayList<ArrayList<Integer>>();

            if(n == 1){
                return res;
            }
            int i =0;

            while( i< n-1){
                //Find the local minima to buy the stock
                while( i < n-1 && arr[i+1] <= arr[i]){
                    i++;
                }

                if( i == n-1){
                    break;  // we have reached the end, no further transactions possible
                }

                int buy = i++;
                //Find the local maxima sell day
                while(i < n && arr[i] >= arr[i-1]){
                    i++;
                }

                int sell = i - 1;

                var pair = new ArrayList<Integer>();
                pair.add(buy);
                pair.add(sell);
                res.add(pair);
            }

            return res;
    }
}
