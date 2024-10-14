package Recursion;

import java.util.ArrayList;

public class PowerSets {

    public static ArrayList<String> powerSet(String s){
        ArrayList<String> res = new ArrayList<>();
        backtrack(s,0,new StringBuilder(), res);
        return res;
    }


    private static  void backtrack(String s, int index, StringBuilder curr, ArrayList<String> res){
        res.add(curr.toString());

        for(int i = index; i<s.length(); i++){
            curr.append(s.charAt(i));
            backtrack(s,i+1,curr,res);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}
