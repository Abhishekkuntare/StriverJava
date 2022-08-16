public class java_06_stock {
    public static int stock(int[] arr) {
        int max_profit = 0;
        int min_price = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min_price) {
                min_price = arr[i];
            } else if (arr[i] - min_price > max_profit) {
                max_profit = arr[i] - min_price;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int nums[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stock(nums));
    }
}
