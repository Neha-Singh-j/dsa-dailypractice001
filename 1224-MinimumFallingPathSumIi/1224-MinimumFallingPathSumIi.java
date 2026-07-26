// Last updated: 7/26/2026, 10:54:03 PM
class Solution {
          static int c = Integer.MAX_VALUE; 
    public int minFallingPathSum(int[][] grid) {
       int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] a:dp){
            Arrays.fill(a,-66666);
        }
        //-66666 it can be any random value beyond -10^4 to 10^4 bcz this is range of dp values
        int res=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
         res=Math.min(Minimum_Path(grid,0,i,dp),res);
       }
       return res;
    }

    public static int Minimum_Path(int[][] grid, int cr, int cc, int[][] dp) {
        
        if(cr==grid.length-1){
            return grid[cr][cc];
        }

      
        if(dp[cr][cc]!=-66666){
            return dp[cr][cc];
        }
       int ans=Integer.MAX_VALUE;
       for(int i=0;i<grid[0].length;i++){
        if(i==cc) continue;
        
         ans= Math.min(ans,Minimum_Path(grid, cr+1, i, dp));
       }
        return dp[cr][cc]=ans+grid[cr][cc];
    }
}
