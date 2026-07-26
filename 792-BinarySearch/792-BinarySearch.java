// Last updated: 7/26/2026, 10:55:55 PM
class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>target){
                hi=mid-1;
            }else if(nums[mid]<target){
                lo=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}