class Solution {
    int findMaximum(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
}
