/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
*/


import java.io.*;

class Solution {
    public int singleNumber(int[] nums) {

        int value = 0;
        for(int i=0;i<nums.length;i++){

            value = value ^ nums[i];

        }
        return value;
    }
}
class Client {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of array :");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter the Elements :");
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		Solution ans = new Solution();
		
		int answer = ans.singleNumber(arr);
		System.out.println("The Single Number in giver array is: "+answer);
	}
}
