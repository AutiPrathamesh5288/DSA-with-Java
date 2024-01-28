class Solve {
     int[] printUnsorted(int arr[], int n) {
        int s = 0;
        while (s < n - 1 && arr[s] <= arr[s + 1]) {
            s++;
        }

        if (s == n - 1) {
            return new int[]{0, 0};
        }
        int e = n - 1;
        while (e > 0 && arr[e] >= arr[e - 1]) {
            e--;
        }


        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (int i = s; i <= e; i++) {
            minVal = Math.min(minVal, arr[i]);
            maxVal = Math.max(maxVal, arr[i]);
        }

        while (s > 0 && arr[s - 1] > minVal) {
            s--;
        }

        while (e < n - 1 && arr[e + 1] < maxVal) {
            e++;
        }

        return new int[]{s, e};
    }

}
