public class java_07_Rotate_matrix_90 {
    // Time Complexity: O(N*N) to linearly iterate and put it into some other
    // matrix.

    // Space Complexity: O(N*N) to copy it into some other matrix.
    // public static int[][] rotate(int[][] matrix) {
    // int n = matrix.length;
    // int[][] rotated = new int[n][n];

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // rotated[j][n - i - 1] = matrix[i][j];// it's nothing but the first row
    // changes to last col and second
    // // row changes to last second col vise versa
    // }
    // }
    // return rotated;

    // }

    // Space complextiy O(N*N)
    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int temp = 0;
        // first we find tranpose of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // then reverse the half array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        return matrix;
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rotated[][] = rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

    }
}
