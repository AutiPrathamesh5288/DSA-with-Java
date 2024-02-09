class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }

        Arrays.sort(nums);
        Set<Integer> uniquePairs = new HashSet<>();
        Set<Integer> seenNumbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            if (seenNumbers.contains(currentNumber - k)) {
                uniquePairs.add(currentNumber - k);
            }
            seenNumbers.add(currentNumber);
        }

        return uniquePairs.size();
    }
}

