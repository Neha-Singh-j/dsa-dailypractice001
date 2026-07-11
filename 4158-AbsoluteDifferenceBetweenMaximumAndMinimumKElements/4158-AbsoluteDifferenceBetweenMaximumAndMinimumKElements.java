// Last updated: 7/12/2026, 12:16:39 AM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;
        int n=nums.length-1;
        int res=0;
        while(c<k){
            res+=nums[n-c]-nums[c];
            c++;
        }
        return res;
    }
}