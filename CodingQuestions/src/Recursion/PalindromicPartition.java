package Recursion;

import java.util.ArrayList;

public class PalindromicPartition {

    public static boolean checkPalindrome(String s){
        int low = 0;
        int high = s.length() - 1;
        while(low < high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }

        return true;
    }


    public static void partition(ArrayList<ArrayList<String>> res, String s, int ind, ArrayList<String> curr){
        if(ind == s.length()){
            res.add(new ArrayList<String>(curr));
            return;
        }

        //Store the current substring
        String temp = "";

        for(int i = ind; i < s.length(); i++){
            temp += s.charAt(i);

            //Check if string temp is palindrome or not
            if(checkPalindrome(temp)){
                curr.add(temp);

                //Recursive call for the remaining string
                partition(res, s, i+1, curr);

                //Remove the string from the curr list
                curr.remove(curr.size() - 1);
            }
        }
    }
}
