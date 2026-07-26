// Last updated: 7/26/2026, 10:53:57 PM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()+1][text2.length()+1];
        for(int[] a: dp) Arrays.fill(a,-1);
        return find(text1,text2,0,0,dp);
    }
    public int find(String a, String b,int i,int j,int[][]dp){
        if(i>=a.length() || b.length()<=j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(a.charAt(i)==b.charAt(j)){
            ans=1+find(a,b,i+1,j+1,dp);
        }else{
            int x=find(a,b,i+1,j,dp);
            int y=find(a,b,i,j+1,dp);
            ans=Math.max(x,y);
        }
        return dp[i][j]=ans;
    }
}
