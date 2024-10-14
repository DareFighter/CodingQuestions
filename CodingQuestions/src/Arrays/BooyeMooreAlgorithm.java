package Arrays;

import java.util.HashMap;

public class BooyeMooreAlgorithm {
    private static int findMajorityElement(int[] a){
        int majorityElement = a[0];
        int count = 1;

        for(int i= 1; i < a.length; i++){
            if(count == 0){
                majorityElement = a[i];
                count++;
            }
            else if(majorityElement == a[i]){
                count++;
            }
            else{
                count--;
            }
        }

        return majorityElement;
    }

    private static int verifyMajority(int majorityElement, int[] a){
        int count = 0;

        for(int i = 0; i < a.length; i++){
            if(majorityElement == a[i]){
                count++;
            }
        }

        return count;
    }

    public static int majorityElement(int a[], int size)
    {
        int majorityElement = findMajorityElement(a);
        int count = verifyMajority(majorityElement,a);

        if(count > size / 2){
            return majorityElement;
        }

        return -1;
    }
}
