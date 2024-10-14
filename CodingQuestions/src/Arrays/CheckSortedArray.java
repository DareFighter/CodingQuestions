package Arrays;

public class CheckSortedArray {

    public static String ASCENDING = "ASCENDING";
    public static String DESCENDING = "DESCENDING";

    public static boolean isArraySortedAscending(int[] arr, String sortType){
        boolean isSorted = true;

        for(int i=0;i<arr.length- 1;i++){
            int curr = arr[i];
            int next = arr[i+1];

            if(sortType.equals(ASCENDING)){
                if(curr > next){
                    isSorted = false;
                    break;
                }
            }
            else if(sortType.equals(DESCENDING)){
                if(curr < next){
                    isSorted = false;
                    break;
                }
            }

        }

        return isSorted;
    }

    public static int getDistinctElemCount(int[] arr){
        int res = 1;

        for(int i =1; i<arr.length;i++){
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }

        return res;
    }


}
