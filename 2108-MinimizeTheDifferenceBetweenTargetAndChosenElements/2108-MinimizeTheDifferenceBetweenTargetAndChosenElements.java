// Last updated: 7/26/2026, 10:50:21 PM
class Solution {
    public int minimizeTheDifference(int[][] mat, int target) {

        int rows = mat.length;
        Integer[][] memo = new Integer[rows][5001]; 
        return calc(mat,target, memo,0, 0);
    }

    public int calc(int[][] mat,int target, Integer[][]memo, int i, int sum) {
        
        if (i == mat.length) {
            return Math.abs(sum - target);
        }

        if (memo[i][sum] != null) return memo[i][sum];

        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < mat[0].length; j++) {
            ans = Math.min(ans, calc(mat,target,memo,i + 1, sum + mat[i][j]));
        }
        return memo[i][sum] = ans;
    }
}
