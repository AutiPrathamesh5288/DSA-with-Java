class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1]) {
                nums1.add(nums[i]);
            }

        }
        return nums1;
    }
}
