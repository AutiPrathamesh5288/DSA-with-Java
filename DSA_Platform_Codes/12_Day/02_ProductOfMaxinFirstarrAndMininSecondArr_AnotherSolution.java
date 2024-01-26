class Solution{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        
        Arrays.sort(arr);
        Arrays.sort(brr);
        
        int max=arr[arr.length-1];
        int min=brr[0];
        
        
        return max*min;
        // Complete the Function
    }
 
}

// TC :- O(1)
