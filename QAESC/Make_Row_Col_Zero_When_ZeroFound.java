public class MatrixZeroEffect {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // Step 1: Store positions of zero
        boolean[] rowHasZero = new boolean[rows];
        boolean[] colHasZero = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    rowHasZero[i] = true;
                    colHasZero[j] = true;
                }
            }
        }

        // Step 2: Zero only the rows and columns that had zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowHasZero[i] || colHasZero[j]) {
                    arr[i][j] = 0;
                }
            }
        }

        // Step 3: Print the result
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
