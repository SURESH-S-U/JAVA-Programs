import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); 
            for (int j = 1; j < i; j++) {
                row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            if (i > 0) row.add(1); 
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal's Triangle:");
        int numRows = sc.nextInt();
        
        Solution solution = new Solution();
        List<List<Integer>> result = solution.generate(numRows);
        
        System.out.println("Pascal's Triangle with " + numRows + " rows:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
        
        sc.close();
    }
}
