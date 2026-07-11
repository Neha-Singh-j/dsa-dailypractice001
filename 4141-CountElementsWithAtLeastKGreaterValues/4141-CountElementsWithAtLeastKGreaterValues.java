// Last updated: 7/12/2026, 12:16:45 AM
class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;){
            int curr=nums[i];
            int j=i;
            while(j<n && nums[j]==curr) j++;
                int freq=j-i;
                int val=n-j;
                if(val>=k){
                    c+=freq;
                }
            i=j;
        }
        return c;
    }
}