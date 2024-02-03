
public class Solution {
    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length + 1];
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            count[num]++;
            
            if (count[num] > 1) {
                return num;
            }
        }
        
        return nums.length;
    }
}

/*

takes more time than above 

class Solution {
    public int findDuplicate(int[] nums) {
       
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++) {
            
            if(nums[i]==nums[i+1]) {
                return nums[i];

            }
        }
        return -1;
    }
}
*/
