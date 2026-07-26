// Last updated: 7/26/2026, 10:59:04 PM
class Solution {
    public int[] countBits(int n) {
         if (n == 0) return new int[]{0};
        if (n == 1) return new int[]{0, 1};

        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            //pattern is there ignore last bit then n/2 binary is there
            int c=0;
            if(i%2!=0) c=1;
            dp[i]= dp[i/2]+c;
        }
        return dp;
    }
}