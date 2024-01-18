/*
Given an array arr[] of size N containing equal number of odd and even numbers. Arrange the numbers in such a way that all the even numbers get the even index and odd numbers get the odd index.
Note: There are multiple possible solutions, Print any one of them. Also, 0-based indexing is considered.

 

Example 1:

Input:
N = 6
arr[] = {3, 6, 12, 1, 5, 8}
Output:
1
Explanation:
6 3 12 1 8 5 is a possible solution.
The output will always be 1 if your
rearrangement is correct.
Example 2:
Input:
N = 4
arr[] = {1, 2, 3, 4}
Output :
1

Your Task:  
You don't need to read input or print anything. Your task is to complete the function reArrange() which takes an integer N and an array arr of size N as input and reArranges the array in Place without any extra space.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 105
1 ≤ arr[i] ≤ 105
*/
import java.util.*;

class Solution {
    static void reArrange(int[] arr, int n) {
        int arr1[] = new int[n];

        int temp1 = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                arr1[temp1] = arr[i];
                temp1 = temp1 + 2;
            }
        }

        int temp2 = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 1){
                arr1[temp2] = arr[i];
                temp2 = temp2 + 2;
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = arr1[i];
        }
    }
};

class Client{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		Solution obj = new Solution();

		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i = 0;i < n;i++){

			arr[i] = sc.nextInt();
		}

		obj.reArrange(arr,n);
	}
}


