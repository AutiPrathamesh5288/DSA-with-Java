class Solution {
    
    static long trappingWater(int arr[], int n) {
        long trappedWater = 0;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;

        while (left < right) {
            leftMax = Math.max(leftMax, arr[left]);
            rightMax = Math.max(rightMax, arr[right]);

            if (arr[left] < arr[right]) {
                trappedWater += leftMax - arr[left];
                left++;
            } else {
                trappedWater += rightMax - arr[right];
                right--;
            }
        }

        return trappedWater;
    } 
}
