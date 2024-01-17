/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109*/

class Solution {
    public static int majorityElement(int[] nums) {

	    int count = 0;
	    
	    for(int i=0;i<nums.length;i++){
		    
		    for(int j=i+1;j<nums.length;j++){
			    if(nums[i]==nums[j]){
				    count++;
			    }
		    }
		    if(count>=(nums.length/2)){
			    return nums[i];
			    
			    
		    }
	    }
	    return -1;
    }
    public static void main(String[] args){

	    int arr[] = new int[]{1,2,3,5,4};
	    int ans = majorityElement(arr);
	    System.out.println(ans);
    }

}


