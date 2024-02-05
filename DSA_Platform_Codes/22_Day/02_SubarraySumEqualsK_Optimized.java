
class Solution {
    public int subarraySum(int[] nums, int target) {

        int arr[] = new int[nums.length];

        int count = 0;
        arr[0] = nums[0];
        for(int i = 1; i < arr.length;i++){
            arr[i] = arr[i-1] + nums[i];
        }

        for(int i = 0; i < arr.length;i++){
            for(int j = i; j < arr.length;j++){
                int sum = 0;

                if(i == 0){
                    sum = arr[j];
                }else{
                    sum = arr[j] - arr[i-1];
                }
                if(sum == target){
                    count++;
                }

            }
        }
        return count;
    }
}

