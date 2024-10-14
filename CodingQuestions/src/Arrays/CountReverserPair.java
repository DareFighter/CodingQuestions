package Arrays;

public class CountReverserPair {

    //a pair is said to be reverse pair if i >= 0 && i < j && j < N && arr[i] > 2 * arr[j]
    public int countRevPairs(int N, int arr[]){
        int maxCount = 0;

        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                if(arr[i] > 2 * arr[j]){
                    maxCount++;
                }
            }
        }
        return maxCount;
    }
}
