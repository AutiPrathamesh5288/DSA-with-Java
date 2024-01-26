class Solution {
    public void moveZeroes(int[] nums) {

        // Arrays.sort(nums);
        int arr[] = new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
