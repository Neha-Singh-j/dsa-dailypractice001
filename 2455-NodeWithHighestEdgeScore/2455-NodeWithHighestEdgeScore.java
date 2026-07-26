// Last updated: 7/26/2026, 10:48:43 PM
class Solution {
    public int edgeScore(int[] edges) {
        long[] ans=new long[edges.length];
        for(int i=0;i<edges.length;i++){
            ans[edges[i]]+=i;
        }
        long curr=Long.MIN_VALUE;
        int idx=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>curr){
                    curr=ans[i];
                    idx=i;
            }  
        }
        return idx;

    }
}