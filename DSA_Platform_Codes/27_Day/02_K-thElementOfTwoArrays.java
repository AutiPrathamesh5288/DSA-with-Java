class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int[] arr = new int[n+m];
        int index = 0;
        for(int i=0;i<n;i++){
            arr[index++]=arr1[i];
        }
        for(int i=0;i<m;i++){
            arr[index++]=arr2[i];
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
