// Last updated: 7/29/2026, 4:14:14 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int k=2;
4        int[][] dp=new int[prices.length][4];
5        for(int[]d:dp){
6            Arrays.fill(d,-1);
7        }
8        return find(0,0,k,prices,dp);
9    }
10   public static int find(int i, int op,int k, int[]prices,int[][]dp){
11        if(i==prices.length) return 0; 
12        if(op==2*k) return 0; 
13        if(dp[i][op]!=-1) return dp[i][op];
14        int profit=0;
15        if(op%2==0) { 
16            int buy=-prices[i]+find(i+1,op+1,k,prices,dp);
17            int not_buy=find(i+1,op,k,prices,dp);
18            profit=Math.max(buy,not_buy);
19        }else{
20            int sell=prices[i]+find(i+1,op+1,k,prices,dp);
21            int not_sell=find(i+1,op,k,prices,dp);
22            profit=Math.max(sell,not_sell);
23        }
24        return dp[i][op]=profit;
25    }
26}