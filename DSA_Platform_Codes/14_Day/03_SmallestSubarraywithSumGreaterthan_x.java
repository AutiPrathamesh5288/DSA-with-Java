class Solution {

    public static int smallestSubWithSum(int arr[], int n, int x) {
        int min = n+1;
        int sum = 0;
        int start = 0;
        int end = 0;
        while(end<n){
            while(sum<=x && end < n){
                sum+=arr[end++];
            }
            while(sum>x && start < n){
                if(end-start<min)
                    min = end-start;
                sum-=arr[start++];
            }
        }
        if(min==n+1)
            return 0;
        return min;
    }
}

