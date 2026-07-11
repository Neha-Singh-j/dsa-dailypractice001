// Last updated: 7/12/2026, 12:16:18 AM
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans=new int[matrix.length];
        int j=0;
        for(int[] m : matrix){
            int c=0;
            for(int i=0;i<m.length;i++){
                if(m[i]==1) c++;
            }
            ans[j++]=c;
        }
        return ans;
    }
}