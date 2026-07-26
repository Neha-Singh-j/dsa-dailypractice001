// Last updated: 7/26/2026, 10:56:05 PM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int[][] ans=new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ans[i][j] = image[i][j];
            }
        }

        int original = image[sr][sc];
        if(original == color) return ans;
        solve(image,ans,sr,sc,color,original);
        return ans;
    }
    public static void solve(int[][] image, int[][] ans, int i, int j, int color, int o){
        if(i>=image.length || j>=image[0].length || j<0 || i<0) return;
        if(image[i][j] != o) return;
        if(ans[i][j]==color) return;
        ans[i][j]=color;
        solve(image,ans,i+1,j,color,o);
        solve(image,ans,i,j+1,color,o);
        solve(image,ans,i-1,j,color,o);
        solve(image,ans,i,j-1,color,o);
        
    }
}