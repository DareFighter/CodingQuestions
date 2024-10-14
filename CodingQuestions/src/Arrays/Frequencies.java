package Arrays;

import java.util.HashMap;

public class Frequencies {

    public HashMap<Integer,Integer> CalculateFrequency(int[] arr){
        if(arr == null){
            throw new NullPointerException();
        }

        HashMap<Integer, Integer> res = new HashMap<>();
        for(int num:arr){
            if(res.containsKey(num)){
                res.put(num,res.get(num) + 1);
            }
            else{
                res.put(num,1);
            }
        }

        return res;
    }
}
