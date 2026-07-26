// Last updated: 7/26/2026, 10:56:00 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(climbing_Stairs(cost,dp,0),climbing_Stairs(cost,dp,1));
    }
    public static int climbing_Stairs(int[] cost, int[] dp, int i){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int f=climbing_Stairs(cost,dp,i+1);
        int s=climbing_Stairs(cost,dp,i+2);
        return dp[i]=Math.min(f,s)+cost[i];
    }
}