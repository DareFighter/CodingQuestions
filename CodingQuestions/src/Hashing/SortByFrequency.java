package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class SortByFrequency {
    public static ArrayList<Integer> SortByFreq(int arr[]){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();

        for(int num:arr){
            if(hashMap.containsKey(num)){
                hashMap.put(num, hashMap.get(num) + 1);
            }
            else{
                hashMap.put(num, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o2.getValue() != o1.getValue()){
                    return o2.getValue() - o1.getValue();
                }
                else{
                    return o1.getKey() - o2.getKey();
                }
            }
        });

        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:list){
            int count = entry.getValue();
            while (count-- > 0){
                res.add(entry.getKey());
            }
        }

        return res;
    }
}
