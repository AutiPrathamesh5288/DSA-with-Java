class Solution {

    static int findPlatform(int arr[], int dep[], int n) {
        // Sorting arrival and departure arrays.
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformsNeeded = 1;
        int result = 1;
        int i = 1, j = 0;

        
        while (i < n && j < n) {
          
            if (arr[i] <= dep[j]) {
                platformsNeeded++;
                i++;
            } else {
         
                platformsNeeded--;
                j++;
            }

            result = Math.max(result, platformsNeeded);
        }

        return result;
    }
}
