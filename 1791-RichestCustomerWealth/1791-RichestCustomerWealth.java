// Last updated: 7/26/2026, 10:51:53 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int m=accounts[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int curr=0;
            for(int j=0;j<m;j++){
                 curr+=accounts[i][j];
            }
            max=Math.max(max,curr);
        }
        return max;
    }
}