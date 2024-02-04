class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }
            }
        }

        return maxArea;
    }
    int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] = 0;  

        int area = 1;
        area = area + dfs(grid, i - 1, j);  // Up
        area = area + dfs(grid, i + 1, j);  // Down
        area = area + dfs(grid, i, j - 1);  // Left
        area = area + dfs(grid, i, j + 1);  // Right

        return area;
    }
}

