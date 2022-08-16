import java.util.*;
// Time Complexity: We are creating a 2D array of size (numRows * numCols) (where 1 <= numCols <= numRows), and we are traversing through each of the cells to update it with its correct value, so Time Complexity = O(numRows2).

// Space Complexity: Since we are creating a 2D array, space complexity = O(numRows)
public class java_02_PascalTraingle {
    public static List<List<Integer>> pascal(int n) {
        if (n == 0)
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                // corner case
                if (j == 0 || j == i - 1) { // j== 0 or j==1
                    row.add(1); // then add 1
                } else {
                    System.out.println(i + "index");
                    System.out.println();
                    System.out.println(result.get(i - 2).get(j));
                    System.out.println();
                    System.out.println(result.get(i - 2).get(j - 1));
                    row.add(result.get(i - 2).get(j) + result.get(i - 2).get(j - 1));
                }
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascal(n);
        System.out.println(ans);
    }
}