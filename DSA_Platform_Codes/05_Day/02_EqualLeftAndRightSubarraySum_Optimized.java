/*

   Given an array A of n positive numbers. The task is to find the first index in the
array such that the sum of elements before it equals the sum of elements after it.
Note: Array is 1-based indexed.
Example 1:
Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
Explanation: For second test case at position 3 elements before it (1+3) =
elements after it (2+2).

Example 2:
Input:

n = 1
A[] = {1}
Output: 1
Explanation: Since it's the only element hence it is the only point.
Expected Time Complexity: O(N)
Expected Space Complexity: O(1)
Constraints:
1 <= n <= 106
1 <= A[i] <= 108*/


class Solution{
	int equalSum(int [] arr, int n) {
		// prefix Array
        int[] prefixSum = new int[n];
        
        prefixSum[0] = arr[0];
        
        for(int i=1;i<n;i++){
            prefixSum[i] =  prefixSum[i-1] + arr[i];
        }
        
        // suffix Array
        int[] suffixSum = new int[n];
        suffixSum[n-1] = arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            suffixSum[i] = suffixSum[i+1] + arr[i];
        }
        
        for(int i=0;i<n;i++){
            if(prefixSum[i] == suffixSum[i])
                return i+1;
        }
        
        return -1;
	}
}
