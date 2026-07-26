// Last updated: 7/26/2026, 10:53:04 PM
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        List<List<Integer>> ans=new ArrayList<>();
       int[][] mat=new int[n][m];
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 int new_idx=((i*m )+j+k)%(n*m);
                 int n_row=new_idx/m;
                 int n_col=new_idx%m;
                 mat[n_row][n_col]=grid[i][j];
            }
        }
        for(int i=0;i<n;i++){
            List<Integer> curr=new ArrayList<>();
            for(int j=0;j<m;j++){
                curr.add(mat[i][j]);
             }
             ans.add(curr);
        }
        return ans;
    }
}