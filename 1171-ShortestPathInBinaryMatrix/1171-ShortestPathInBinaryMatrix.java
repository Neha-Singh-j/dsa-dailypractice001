// Last updated: 7/26/2026, 10:54:07 PM
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if(grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][n];

        q.add(new int[]{0, 0});
        vis[0][0] = true;

        int dist = 1;

        while(!q.isEmpty()) {

            int size = q.size();

            for(int i = 0; i < size; i++) {

                int[] p = q.poll();
                int r = p[0];
                int c = p[1];

                if(r == n - 1 && c == n - 1)
                    return dist;

                add(r - 1, c - 1, grid, vis, q);
                add(r - 1, c,     grid, vis, q);
                add(r - 1, c + 1, grid, vis, q);

                add(r, c - 1,     grid, vis, q);
                add(r, c + 1,     grid, vis, q);

                add(r + 1, c - 1, grid, vis, q);
                add(r + 1, c,     grid, vis, q);
                add(r + 1, c + 1, grid, vis, q);
            }

            dist++;
        }

        return -1;
    }

    public void add(int r, int c, int[][] grid,
                    boolean[][] vis, Queue<int[]> q) {

        int n = grid.length;

        if(r >= 0 && r < n &&
           c >= 0 && c < n &&
           grid[r][c] == 0 &&
           !vis[r][c]) {
            vis[r][c] = true;
            q.add(new int[]{r, c});
        }
    }
}