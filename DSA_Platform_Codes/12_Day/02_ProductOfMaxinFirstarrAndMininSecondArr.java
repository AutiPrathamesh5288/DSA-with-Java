class Solution{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<brr.length;i++){
            if(brr[i]<min){
                min = brr[i];
            }
        }
         return max*min;
        // Complete the Function
    }
 
}
/*TC :- O(N+M)
