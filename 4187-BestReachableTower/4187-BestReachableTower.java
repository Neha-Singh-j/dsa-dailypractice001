// Last updated: 7/12/2026, 12:16:33 AM
class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int[] ans=new int[2];
        ans[0]= Integer.MAX_VALUE;
        ans[1] = Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<towers.length;i++){
            if(valid(towers[i][0],towers[i][1],center,radius)){
                if(towers[i][2]>max){
                    max=towers[i][2];
                    ans[0]=towers[i][0];
                    ans[1]=towers[i][1];
                }else if(towers[i][2]==max){
                    if(ans[0]>towers[i][0] || (ans[0]==towers[i][0] && ans[1]>towers[i][1])){

                        ans[0] = towers[i][0];
                        ans[1] = towers[i][1];
                    }
                }
            }
        }
        if(ans[0]==Integer.MAX_VALUE){
            ans[0]=-1;
            ans[1]=-1;
        }
        return ans;
    }
    public boolean valid(int x, int y, int[]p, int r){
        if(Math.abs(p[0]-x)+Math.abs(p[1]-y)<=r) return true;
        return false;
    }
}