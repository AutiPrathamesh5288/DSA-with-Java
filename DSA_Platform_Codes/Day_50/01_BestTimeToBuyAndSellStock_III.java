class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int n = prices.length;

        int[][] dp = new int[3][n];

        for (int transaction = 1; transaction <= 2; transaction++) {
            int maxDiff = -prices[0];
            for (int day = 1; day < n; day++) {
                dp[transaction][day] = Math.max(dp[transaction][day - 1], prices[day] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[transaction - 1][day] - prices[day]);
            }
        }

        return dp[2][n - 1];
    }
}

