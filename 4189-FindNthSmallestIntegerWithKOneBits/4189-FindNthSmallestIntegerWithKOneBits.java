// Last updated: 7/12/2026, 12:16:32 AM
class Solution {
    long[][] arr=new long[60][60];
    public long nthSmallest(long n, int k) {
        set_bitCheck();
        long ans=0;
        int r=k;
        for(int i=50;i>=0;i--){
            if(r==0) break;
            long c=arr[i][r];
            if(c<n){
                n-=c;
                ans|=(1L << i);
                r--;
            }
        }
        return ans;
    }
    public void set_bitCheck(){
        for(int i=0;i<60;i++){
            arr[i][0]=arr[i][i]=1;
            for(int j=1;j<i;j++){
               arr[i][j]=Math.min((long)1e18,arr[i-1][j-1]+arr[i-1][j]); 
            }
        }
    }
}