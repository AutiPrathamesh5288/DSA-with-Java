/*
 * Given an integer array nums, find three numbers whose product is maximum and return the maximum product.



Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6


Constraints:

3 <= nums.length <= 104
-1000 <= nums[i] <= 1000*/


import java.util.*;

class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int max1 = nums[0] * nums[1] * nums[nums.length-1];
        int max2 = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];

        if(max1 < max2){
            return max2;
        }else{
            return max1;
        }
    }
}

class Client{
	public static void main(String[] args){

		Solution obj = new Solution();

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int nums[] = new int[size];

		for(int i = 0; i < size;i++){

			nums[i] = sc.nextInt();
		}

		int ret = obj.maximumProduct(nums);
		System.out.println(ret);
	}
}



