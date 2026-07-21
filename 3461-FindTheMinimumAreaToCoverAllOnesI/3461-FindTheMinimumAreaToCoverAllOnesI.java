// Last updated: 7/21/2026, 11:51:25 AM
class Solution {
    public int minimumArea(int[][] grid) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int minj=Integer.MAX_VALUE;
        int maxj=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    mini=Math.min(i,mini);
                     minj=Math.min(j,minj);
                    maxi=Math.max(i,maxi);
                    maxj=Math.max(j,maxj);
                }
            }
        }
        return (maxj-minj+1)*(maxi-mini+1);
    }
}