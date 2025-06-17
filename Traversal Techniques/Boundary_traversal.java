public class BoundaryTraversal {
    public static void boundaryTraversal(int[][] matrix) {
        int rows = matrix.length;
        if (rows == 0) return;  // Edge case: empty matrix
        int cols = matrix[0].length;                             // Used to get num  of cols.  martix[0] is first row.

        StringBuilder result = new StringBuilder();

        // Special case: only one row
        if (rows == 1) {
            for (int i = 0; i < cols; i++)
                result.append(matrix[0][i]).append(" ");
        }
        // Special case: only one column
        else if (cols == 1) {
            for (int i = 0; i < rows; i++)
                result.append(matrix[i][0]).append(" ");
        }
        else {
            // 1. Top row
            for (int i = 0; i < cols; i++)
                result.append(matrix[0][i]).append(" ");

            // 2. Right column
            for (int i = 1; i < rows; i++)
                result.append(matrix[i][cols - 1]).append(" ");

            // 3. Bottom row
            for (int i = cols - 2; i >= 0; i--)
                result.append(matrix[rows - 1][i]).append(" ");

            // 4. Left column
            for (int i = rows - 2; i > 0; i--)
                result.append(matrix[i][0]).append(" ");
        }

        System.out.println(result.toString().trim());
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12}
        };
        System.out.println("Boundary Traversal:");
        boundaryTraversal(mat);
    }
}
