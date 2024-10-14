package Sorting;

import java.util.ArrayList;

public class MergeThreeSortedArray {

    public static ArrayList<Integer> MergeTwoSortedArray(int[] arr1,int[] arr2){
        var res = new ArrayList<Integer>();
        int i = 0;
        int j = 0;

        while( i<arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                res.add(arr1[i]);
                i++;
            }
            else if(arr1[i] > arr2[j]){
                res.add(arr2[j]);
                j++;
            }
            else if(arr1[i] == arr2[j]){
                res.add(arr1[i]);
                res.add(arr2[j]);
                i++;
                j++;
            }
        }

        while(i<arr1.length){
             res.add(arr1[i]);

            i++;
        }

        while(j <arr2.length){

                res.add(arr2[j]);

            j++;
        }

        return res;
    }

    public static int[] ConvertArrayListToIntArray(ArrayList<Integer> integers){
        var res = new int[integers.size()];

        for(var i =0; i<integers.size(); i++){
            res[i] = integers.get(i);
        }
        return res;
    }

    public static ArrayList<Integer> Merge(int[] arr1, int[] arr2, int[] arr3){

        var mergeTwoSortedArray = MergeTwoSortedArray(arr1,arr2);
        var resArray = ConvertArrayListToIntArray(mergeTwoSortedArray);
        var res = MergeTwoSortedArray(resArray, arr3);
        return res;
    }
}
