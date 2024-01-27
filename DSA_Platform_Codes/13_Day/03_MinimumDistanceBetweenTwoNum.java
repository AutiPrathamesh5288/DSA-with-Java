class Solution {
    int minDist(int a[], int n, int x, int y) {
        int minDistance = Integer.MAX_VALUE;
        int lastSeenIndex = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == x || a[i] == y) {
                if (lastSeenIndex != -1 && a[i] != a[lastSeenIndex]) {
                    minDistance = Math.min(minDistance, i - lastSeenIndex);
                }
                lastSeenIndex = i;
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            return -1; 
        }

        return minDistance;
    }
}
