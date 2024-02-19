class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] prefixSumCount = new int[k];
        int prefixSum = 0;
        int result = 0;

        prefixSumCount[0] = 1; 

        for (int num : nums) {
            prefixSum = (prefixSum + num) % k;
            if (prefixSum < 0) {
                prefixSum += k;
            }
            result += prefixSumCount[prefixSum];
            prefixSumCount[prefixSum]++;
        }

        return result;
    }
}

