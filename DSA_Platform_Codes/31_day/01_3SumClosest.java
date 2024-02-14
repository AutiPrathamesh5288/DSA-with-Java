/*class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum = nums[0] + nums[1] + nums[2];
        int min = Integer.MAX_VALUE; 

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int currentSum = nums[i] + nums[j] + nums[k];
                    int currentDiff = Math.abs(currentSum - target);
                    if (currentDiff < min) {
                        min = currentDiff;
                        closestSum = currentSum;
                    }
                }
            }
        }
        return closestSum;
    }
}*/


class Solution {
    int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];

        Arrays.sort(nums);

        for (int i = 0; i + 2 < nums.length; ++i) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target)
                    return sum;
                if (Math.abs(sum - target) < Math.abs(res - target))
                    res = sum;
                if (sum < target)
                    left++;
                else
                    right--;
            }
        }

        return res;
    }
}
