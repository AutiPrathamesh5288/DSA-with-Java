class Solution {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, -1, 0};
        int k = 0;

        int ans = subarraySum(arr, k);
        System.out.println(ans);
    }
}

