// Last updated: 7/21/2026, 11:49:15 AM
class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j] ){
                    for(int k=j+1;k<n;k++){
                        if(nums[k]==nums[i]){
                            int curr=Math.abs(i-j)+Math.abs(k-i)+Math.abs(j-k);
                            ans=Math.min(ans,curr);
                        }
                    }
                }else{
                    continue;
                }
            }
        }
        if(n==1 || ans==Integer.MAX_VALUE) return -1;

        return ans;
    }
}