/*
 Given an array A of n non negative numbers. The task is to find the first equilibrium point in an array. Equilibrium point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.

Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 
3 
Explanation:  
equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2). 
Example 2:

Input:
n = 1
A[] = {1}
Output: 
1
Explanation:
Since there's only element hence its only the equilibrium point.
Your Task:
The task is to complete the function equilibriumPoint() which takes the array and n as input parameters and returns the point of equilibrium. 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 105
0 <= A[i] <= 109*/

class Solution {
    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // prefix Array
        long[] prefixSum = new long[n];
        
        prefixSum[0] = arr[0];
        
        for(int i=1;i<n;i++){
            prefixSum[i] =  prefixSum[i-1] + arr[i];
        }
        
        // suffix Array
        long[] suffixSum = new long[n];
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
