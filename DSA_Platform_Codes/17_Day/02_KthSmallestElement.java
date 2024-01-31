class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) { 
        
        Arrays.sort(arr);
        
        int min = arr[k-1];
        
        return min;
    } 
}
