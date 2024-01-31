class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        int max = nums[nums.length-k];
        return max;

    }
}





