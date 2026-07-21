// Last updated: 7/21/2026, 11:49:37 AM
class Solution {
    public long rob(int[] nums, int[] colors) {
        int n=nums.length;
        if(n==1) return nums[0];
        long b=0;
        long a=nums[0];
        for(int i=1;i<n;i++){
            long curr=0;
            if(colors[i]!=colors[i-1]){
                curr=nums[i]+a;
            }else{
                curr=nums[i]+b;
            }
            long x=Math.max(curr,a);
            b=a;
            a=x;
        }
        return a;
    }
}