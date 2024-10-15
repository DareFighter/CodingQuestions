package Arrays;

public class BettingGame {
    private static char _win = 'W';
    private static char _lose = 'L';

    public static int betBalance(String result) {
        int initialSum = 4;
        int betAmount = 1;

        for (char c : result.toCharArray()) {
            if (initialSum < betAmount) {
                return -1;
            }
            if (c == _win) {
                initialSum += betAmount;
                betAmount = 1;
            } else if (c == _lose) {
                initialSum -= betAmount;
                betAmount = 2 * betAmount;
            }
        }

        return initialSum;
    }
}
