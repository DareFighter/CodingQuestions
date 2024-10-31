package Matrix;

public class SearchMatrix {

    public boolean bruteForce(int[][] matrix, int target) {
        boolean res = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    res = true;
                    break;
                }
            }
        }

        return res;
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        boolean res = false;

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                res = true;
                break;
            } else if (matrix[row][col] > target) {
                row++;
            } else {
                col--;
            }
        }

        return res;
    }

}
