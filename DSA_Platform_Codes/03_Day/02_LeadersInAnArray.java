/*
Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is a leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
Example 2:

Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0
Explanation: 0 is the rightmost element
and 4 is the only element which is greater
than all the elements to its right.
Your Task:
You don't need to read input or print anything. The task is to complete the function leader() which takes array A and n as input parameters and returns an array of leaders in order of their appearance.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 107
0 <= Ai <= 107*/

import java.util.*;
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<Integer>();

        int max = arr[n-1];
        al.add(arr[n-1]);
        int index = 0;
        for(int i = n-2;i >=0;i--){

            if(arr[i] >= max){
                max = arr[i];
                int num = al.get(0);
                al.set(0,max);
                al.add(1,num);

            }
        }


        return al;
    }
}

class Client{

	public static void main(String[] args){

		Solution obj = new Solution();
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i< size;i++){
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al = obj.leaders(arr,size);
		System.out.println(al);
	}
}

