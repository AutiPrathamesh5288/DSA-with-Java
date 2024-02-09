
class Solution {
    int getMinDiff(int[] arr, int n, int k) {

        Arrays.sort(arr);

        int result = arr[n - 1] - arr[0];

        for (int i = 0; i < n - 1; i++) {
            int currentHeight = arr[i];
            int nextHeight = arr[i + 1];

            int potentialMin = Math.min(arr[0] + k, nextHeight - k);
            int potentialMax = Math.max(arr[n - 1] - k, currentHeight + k);

            if (potentialMin < 0) continue;

            result = Math.min(result, potentialMax - potentialMin);
        }

        return result;
    }
}
