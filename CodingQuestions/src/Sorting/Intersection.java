package Sorting;
import java.util.*;

public class Intersection {
    public ArrayList<Integer> FindIntersection(int[] arr1, int[] arr2){
        var res = new ArrayList<Integer>();
        int i = 0;
        int j = 0;

        while( i < arr1.length && j < arr2.length){

            if(i > 0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }

            if(arr1[i] < arr2[j]){
                i++;
            }
            else if( arr1[i] > arr2[j]){
                j++;
            }
            else if(arr1[i] == arr2[j]){
                i++;
                j++;
            }
        }

        return res;
    }
}
