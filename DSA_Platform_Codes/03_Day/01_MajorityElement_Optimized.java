/*i
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
import java.util.*;
/*class Solution {
    public int majorityElement(int[] nums) {

     Arrays.sort(nums);
     for(int x:nums){
     	System.out.println(x);
     }

     int length = nums.length;

     int ans = nums[(length/2)];

     return ans;
    }
}
*/
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ans = nums[0];
        for (int num : nums) {
            if (count == 0)
                ans = num;
            if (num == ans)
                count++;
            else
                count--;
        }
        return ans;
    }
}
class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr[]= new int[size];

		for(int i = 0; i < size;i++){

			arr[i] = sc.nextInt();
		}
		Solution obj = new Solution();

		int ret = obj.majorityElement(arr);

		System.out.println(ret);
	}
}

