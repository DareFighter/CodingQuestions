package Sorting;
import java.util.*;

public class UnionOfTwoSortedArray {

    public static ArrayList<Integer> FindUnion(int[] arr1,int[] arr2){
        var res = new ArrayList<Integer>();
        int i = 0;
        int j = 0;

        while( i < arr1.length && j < arr2.length){

            if(i > 0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }

            if( j > 0 && arr2[j] == arr2[j-1]){
                j++;
                continue;
            }

            if(arr1[i] < arr2[j]){
                res.add(arr1[i]);
                i++;
            }
            else if(arr1[i] > arr2[j]){
                res.add((arr2[j]));
                j++;
            }
            else if(arr1[i] == arr2[j]){
                res.add((arr1[i]));
                i++;
                j++;
            }
        }

        while( i < arr1.length){
            if( i> 0 && arr1[i] != arr1[i-1]){
                res.add(arr1[i]);
            }
            i++;
        }

        while( j < arr2.length){
            if(j > 0 && arr2[j] != arr2[j-1]){
                res.add(arr2[j]);
            }
            j++;
        }

        return res;
    }
}
