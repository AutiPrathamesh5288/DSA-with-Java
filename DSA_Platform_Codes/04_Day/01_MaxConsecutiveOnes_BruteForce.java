/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/

class Solution {
/*
	public static void main(String[] args){

		int arr[] = new int[]{1,1,0,1,1,1};
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			int count = 0;
			for(int j=i;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
				else{
					break;
				}
			}
			if(count > max){
				max = count;
			}
		}
		System.out.println(max);
	}
}*/
	public static void main(String[] args){

		int arr[] = new int[]{1,1,1,1,0,0,1,1,1};
		int max = Integer.MIN_VALUE;
		int count = 0;
		for(int i=0;i<arr.length;i++){	
			if(arr[i]==1){
				count++;
			}
			else{
				count = 0;
			}
			if(count > max){
				max = count;
				//System.out.println(max);
			}
		}
		System.out.println(max);
	}
}
