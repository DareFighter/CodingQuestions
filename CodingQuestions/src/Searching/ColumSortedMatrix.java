package Searching;

public class ColumSortedMatrix {

    public static boolean bruteforce(int[][] matrix, int n, int m, int x) {
        boolean res = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == x) {
                    res = true;
                    break;
                }
            }
        }

        return res;
    }

    public static boolean searchElement(int[][] matrix, int n, int m, int x) {
        boolean res = false;

        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            if (matrix[row][col] == x) {
                return true;
            } else if (matrix[row][col] > x) {
                col--;
            } else {
                row++;
            }
        }

        return res;
    }

}
