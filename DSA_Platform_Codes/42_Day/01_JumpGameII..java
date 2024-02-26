class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0; 
        }

        int jumps = 0;
        int currentReach = 0;
        int nextReach = 0;

        for (int i = 0; i < n - 1; i++) {
            nextReach = Math.max(nextReach, i + nums[i]);

            if (i == currentReach) {
                jumps++;
                currentReach = nextReach;

                if (currentReach >= n - 1) {
                    break; // Reached the last index
                }
            }
        }

        return jumps;
    }
}

