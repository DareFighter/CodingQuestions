package Arrays;
import java.sql.Array;
import  java.util.*;

public class LeadersInArray {

    public static  ArrayList<Integer> GetLeaders(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0; i<arr.length;i++){
            boolean isLeader = true;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] <arr[j]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                res.add(arr[i]);
            }
        }

        return res;
    }


    //Efficient Method
    //traverse from the right and check
    public static ArrayList<Integer> GetLeaders2(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        int currLeader = arr[arr.length -1];
        res.add(currLeader);
        for(int i = arr.length-2; i>=0;i--){
            if(arr[i] > currLeader){
                currLeader = arr[i];
                res.add(currLeader);
            }
        }
        return res;
    }
}
