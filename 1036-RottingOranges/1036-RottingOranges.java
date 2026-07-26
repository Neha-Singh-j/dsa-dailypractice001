// Last updated: 7/26/2026, 10:54:31 PM
import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;
        int time = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i, j));
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        while(!q.isEmpty() && fresh > 0){
            int size = q.size();
            time++;
            for(int k = 0; k < size; k++){
                Pair p = q.poll();
                int r = p.i;
                int c = p.j;
                // up
                if(r-1 >= 0 && grid[r-1][c] == 1){
                    grid[r-1][c] = 2;
                    fresh--;
                    q.add(new Pair(r-1, c));
                }
                // down
                if(r+1 < n && grid[r+1][c] == 1){
                    grid[r+1][c] = 2;
                    fresh--;
                    q.add(new Pair(r+1, c));
                }
                // left
                if(c-1 >= 0 && grid[r][c-1] == 1){
                    grid[r][c-1] = 2;
                    fresh--;
                    q.add(new Pair(r, c-1));
                }
                // right
                if(c+1 < m && grid[r][c+1] == 1){
                    grid[r][c+1] = 2;
                    fresh--;
                    q.add(new Pair(r, c+1));
                }
            }
        }

        if(fresh > 0) return -1;
        return time;
    }
}

class Pair{
    int i;
    int j;

    Pair(int i, int j){
        this.i = i;
        this.j = j;
    }
}