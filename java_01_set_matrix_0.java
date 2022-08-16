// // // Approach: Using brute force
// // // Time Complexity:O((N*M)*(N + M)). O(N*M) for traversing through each element and (N+M)for traversing to row and column of elements having value 0.

// // public class java_01_set_matrix_0 {

// //     static void setZeroes(int[][] matrix) {
// //         int rows = matrix.length;
// //         int cols = matrix[0].length;

// //         for (int i = 0; i < rows; i++) {
// //             for (int j = 0; j < cols; j++) {

// //                 if (matrix[i][j] == 0) {

// //                     // for rows right to left direction
// //                     int ind = i - 1;
// //                     while (ind >= 0) {
// //                         if (matrix[ind][j] != 0) {
// //                             matrix[ind][j] = -1;
// //                         }
// //                         ind--;
// //                     }
// //                     // for rows left to right direction
// //                     ind = i + 1;
// //                     while (ind < rows) {
// //                         if (matrix[ind][j] != 0) {
// //                             matrix[ind][j] = -1;
// //                         }
// //                         ind++;
// //                     }

// //                     // for cols and right to left direction
// //                     ind = j - 1;
// //                     while (ind >= 0) {
// //                         if (matrix[i][ind] != 0) {
// //                             matrix[i][ind] = -1;
// //                         }
// //                         ind--;
// //                     }

// //                     // for cols and left to right direction
// //                     ind = j + 1;
// //                     while (ind < cols) {
// //                         if (matrix[i][ind] != 0) {
// //                             matrix[i][ind] = -1;
// //                         }
// //                         ind++;
// //                     }
// //                 }
// //             }
// //         }

// //         for (int i = 0; i < rows; i++) {
// //             for (int j = 0; j < cols; j++) {

// //                 if (matrix[i][j] <= 0) {
// //                     matrix[i][j] = 0;
// //                 }
// //             }
// //         }
// //     }

// //     public static void main(String args[]) {
// //         int arr[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
// //         setZeroes(arr);
// //         System.out.println("The Final Matrix is ");
// //         for (int i = 0; i < arr.length; i++) {
// //             for (int j = 0; j < arr[0].length; j++) {
// //                 System.out.print(arr[i][j] + " ");
// //             }
// //             System.out.println();
// //         }
// //     }
// // }
// import java.util.*;

// class TUF {
//     static void setZeroes(int[][] matrix) {
//         int rows = matrix.length, cols = matrix[0].length;
//         int dummy1[] = new int[rows];
//         int dummy2[] = new int[cols];
//         Arrays.fill(dummy1, -1);
//         Arrays.fill(dummy2, -1);
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == 0) {
//                     dummy1[i] = 0;
//                     dummy2[j] = 0;
//                 }
//             }

//         }
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (dummy1[i] == 0 || dummy2[j] == 0) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int arr[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
//         setZeroes(arr);
//         System.out.println("The Final Matrix is ");
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Time Complexity: O(2*(N*M)), as we are traversing two times in a matrix,

// Space Complexity: O(1).
class java_01_set_matrix_0 {
    static void setZeroes(int[][] matrix) {
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) { // first element is zero the set col=0;
                col0 = 0;
            }
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) { // if i'th and j'th value is zero then
                    matrix[i][0] = matrix[0][j] = 0; // set i'th value and j'th value zero
                }
            }
        }

        // for reverse order
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {// if last row and last col is zero then
                    matrix[i][j] = 0; // set zero
                }
                if (col0 == 0) { // set the first col as zero
                    matrix[i][0] = 0;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}