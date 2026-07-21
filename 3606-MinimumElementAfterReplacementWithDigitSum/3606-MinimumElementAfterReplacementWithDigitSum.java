// Last updated: 7/21/2026, 11:51:18 AM
class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            nums[i]=sum(nums[i]);
            if(nums[i]<min) min=nums[i];
        }
        return min;
    }
    public int sum(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}