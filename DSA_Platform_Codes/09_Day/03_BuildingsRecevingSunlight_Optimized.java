class Solution {

    public static int longest(int arr[],int n) {
        int count=0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
                count++;
            }
        }
        return count;
    }
}
