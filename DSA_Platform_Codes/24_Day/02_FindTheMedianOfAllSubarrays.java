import java.util.* ;
import java.io.*; 
import java.util.ArrayList;


public class Solution {

    public static ArrayList<Double> findMedian(ArrayList<Integer> arr, int n, int m) {
        ArrayList<Double> result = new ArrayList<>();

        for (int i = 0; i <= n - m; i++) {
            ArrayList<Integer> subarray = new ArrayList<>(arr.subList(i, i + m));
            Collections.sort(subarray);

            double median;
            if (m % 2 == 0) {
                // If even, take the mean of two middle values
                median = (subarray.get(m / 2 - 1) + subarray.get(m / 2)) / 2.0;
            } else {
                // If odd, take the middle value
                median = subarray.get(m / 2);
            }

            result.add(median);
        }

        return result;
    }
}
