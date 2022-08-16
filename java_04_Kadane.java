public class java_04_Kadane {
    public static int kadane(int[] arr) {
        int max_sum = 0;
        int curr_sum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            // but we get the curr_sum is less than 0 then upadate
            if (curr_sum < 0)
                curr_sum = 0;
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int ans = kadane(arr);
        System.out.println(ans);
    }
}