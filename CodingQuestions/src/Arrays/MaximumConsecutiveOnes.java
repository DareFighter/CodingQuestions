package Arrays;

public class MaximumConsecutiveOnes {

    public static int maxiumConsecutiveOnes(int[] arr) {
        int res = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == 1) {
                if (arr[i + 1] == 0 || (arr[arr.length] == 1)) {
                    res++;
                }
            }
        }
        return res;
    }

}
