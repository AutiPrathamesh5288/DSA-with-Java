class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = 0;

        for(int x:nums){
            sum=sum+x;
        }
        return (n*(n+1))/2-sum;


        // Arrays.sort(nums);
        // nums[0]=0;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }
        // return -1;
        
    }
}
