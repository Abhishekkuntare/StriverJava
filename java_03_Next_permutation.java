// Time Complexity: For the first iteration backward, the second interaction backward and reversal at the end takes O(N) for each, where N is the number of elements in the input array. This sums up to 3*O(N) which is approximately O(N).

// Space Complexity: Since no extra storage is required. Thus, its complexity is O(1).

public class java_03_Next_permutation {
    public static void next_permutation(int[] A) {
        // Base condition
        if (A == null || A.length <= 1)
            return;

        int lastSecondIndex = A.length - 2;
        while (lastSecondIndex >= 0 && A[lastSecondIndex] >= A[lastSecondIndex + 1]) {
            lastSecondIndex--;
        }
        if (lastSecondIndex >= 0) {
            int lastIndex = A.length - 1;
            while (A[lastIndex] <= A[lastSecondIndex]) {
                lastIndex--;
            }
            swap(A, lastSecondIndex, lastIndex);
        }
        reverse(A, lastSecondIndex + 1, A.length - 1);
        for (int a : A) {
            System.out.print(a + " ");
        }
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void reverse(int a[], int i, int j) {
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 4, 2 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        next_permutation(arr);
    }
}
