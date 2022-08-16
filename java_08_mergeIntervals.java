import java.util.*;

public class java_08_mergeIntervals {
    public static int[][] merge(int[][] intervals) {
        // create an answer list
        List<int[]> res = new ArrayList<>();

        // base case
        if (intervals.length == 0 || intervals == null)
            return res.toArray(new int[0][]);

        // sort the array in asscceding order
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // create the pair
        int start = intervals[0][0];
        int end = intervals[0][1];

        // get each pair and add into the res array according the merge property
        for (int[] i : intervals) {
            if (i[0] <= end) {
                end = Math.max(end, i[1]);
            } else {
                res.add(new int[] { start, end });
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[] { start, end });
        return res.toArray(new int[0][]);
    }

    public static void main(String args[]) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(new Integer[] { 1, 3 }));
        arr.add(Arrays.asList(new Integer[] { 2, 4 }));
        arr.add(Arrays.asList(new Integer[] { 2, 6 }));
        arr.add(Arrays.asList(new Integer[] { 8, 9 }));
        arr.add(Arrays.asList(new Integer[] { 8, 10 }));
        arr.add(Arrays.asList(new Integer[] { 9, 11 }));
        arr.add(Arrays.asList(new Integer[] { 15, 18 }));
        arr.add(Arrays.asList(new Integer[] { 16, 17 }));
        // merge(merge(arr));
    }
}