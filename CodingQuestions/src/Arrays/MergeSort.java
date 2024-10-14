package Arrays;

public class MergeSort {





    public static void merge(int[] a, int[] b){
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                System.out.println(a[i]);
                i++;
            }
            else{
                System.out.println(b[j]);
                j++;
            }
        }

        while(i < a.length){
            System.out.println(a[i]);
            i++;
        }
        while(j < a.length){
            System.out.println(b[j]);
            j++;
        }
    }
}
