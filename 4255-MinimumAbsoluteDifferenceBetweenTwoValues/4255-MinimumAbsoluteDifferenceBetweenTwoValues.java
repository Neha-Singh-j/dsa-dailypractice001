// Last updated: 7/12/2026, 12:16:21 AM
class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int a=-1;
        int b=-1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                a=i;
                if(b!=-1){
                    ans=Math.min(ans,Math.abs(b-a));
                }
            }else if(nums[i]==2){
                b=i;
                if(a!=-1){
                    ans=Math.min(ans,Math.abs(b-a));
                }
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}