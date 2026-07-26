// Last updated: 7/26/2026, 10:52:37 PM
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            int isMin=Integer.MAX_VALUE;
            int idx=-1;
            for(int j=0;j<m;j++){
                if(matrix[i][j]<isMin){
                    isMin=matrix[i][j];
                    idx=j;

                }
            }
            int isMax=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                    if(matrix[j][idx]>isMax){
                        isMax=matrix[j][idx];
                    }
            }
                if(isMax==isMin){ // then min is valid Lucky number
                    ans.add(isMin);
                }
            
        }
        return ans;
    }
}