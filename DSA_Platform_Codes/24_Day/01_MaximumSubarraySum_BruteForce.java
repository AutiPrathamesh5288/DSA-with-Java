class Solution {
    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
    
        for(int i=0;i<nums.length;i++) {
            int sum = nums[i];
            for(int j=i+1;j<nums.length;j++) {

                sum = sum + nums[j];
                if(sum > max) {
                    max = sum;
                }

            }

        }
        
        return max;

    }
}
