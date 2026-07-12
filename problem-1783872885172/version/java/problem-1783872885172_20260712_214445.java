// Last updated: 7/12/2026, 9:44:45 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int n=grid.length;
4        int m=grid[0].length;
5        int c=0;
6        boolean[][] visited=new boolean[n][m];
7        for(int i=0;i<n;i++){
8            for(int j=0;j<m;j++){
9                if(!visited[i][j] && grid[i][j]=='1'){
10                    dfs(i,j,grid,visited);
11                    c++;
12                }
13            }
14        }
15       
16        return c;
17        
18    }
19    public static void dfs( int i , int j, char[][] grid, boolean[][] visited){
20            if(i>=grid.length || j >=grid[0].length || i<0 || j<0 || visited[i][j] || grid[i][j]!='1'){
21                return;
22            }
23            visited[i][j]=true;
24            dfs(i+1,j,grid,visited);
25            dfs(i-1,j,grid,visited);
26            dfs(i,j+1,grid,visited);
27            dfs(i,j-1,grid,visited);
28    }
29}