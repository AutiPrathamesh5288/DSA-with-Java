class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        boolean[] seen = new boolean[n * n + 1];
        int repeated = 0, missing = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                if (seen[num]) {
                    repeated = num;
                } else {
                    seen[num] = true;
                }
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        return new int[]{repeated, missing};
    }

}

// In GFG
/*
 class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] > 0) {
                arr[index] = -arr[index];
            } else {
                result[0] = Math.abs(arr[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }
}*/
 
