// Last updated: 7/26/2026, 10:58:27 PM
class Solution {
    private int m, n;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // Start DFS from Pacific borders
        for (int j = 0; j < n; j++) dfs(0, j, heights, pacific, Integer.MIN_VALUE);
        for (int i = 0; i < m; i++) dfs(i, 0, heights, pacific, Integer.MIN_VALUE);

        // Start DFS from Atlantic borders
        for (int j = 0; j < n; j++)
         dfs(m - 1, j, heights, atlantic, Integer.MIN_VALUE);
        for (int i = 0; i < m; i++) 
        dfs(i, n - 1, heights, atlantic, Integer.MIN_VALUE);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    private void dfs(int i, int j, int[][] heights, boolean[][] visited, int prevHeight) {
        if (i < 0 || i >= m || j < 0 || j >= n) return;       
        if (visited[i][j]) return;  
        if (heights[i][j] < prevHeight) return;   

        visited[i][j] = true;

        dfs(i + 1, j, heights, visited, heights[i][j]); // down
        dfs(i - 1, j, heights, visited, heights[i][j]); // up
        dfs(i, j + 1, heights, visited, heights[i][j]); // right
        dfs(i, j - 1, heights, visited, heights[i][j]); // left
    }
}
