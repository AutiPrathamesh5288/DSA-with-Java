import java.util.Arrays;

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int maxHorizontalDiff = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);
        for (int i = 1; i < horizontalCuts.length; i++) {
            maxHorizontalDiff = Math.max(maxHorizontalDiff, horizontalCuts[i] - horizontalCuts[i - 1]);
        }

        int maxVerticalDiff = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);
        for (int i = 1; i < verticalCuts.length; i++) {
            maxVerticalDiff = Math.max(maxVerticalDiff, verticalCuts[i] - verticalCuts[i - 1]);
        }

        long maxArea = (long) maxHorizontalDiff * maxVerticalDiff % 1_000_000_007;
        return (int) maxArea;
    }
}

