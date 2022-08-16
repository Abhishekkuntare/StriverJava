// Time Complexity: O(N)

// Space Complexity: O(1)

// This problem is a variation of the popular Dutch National flag algorithm 
public class java_05_sort_0_1_2 {
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int[] sort(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, mid, low);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 1 };
        int ans[] = sort(nums);
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
