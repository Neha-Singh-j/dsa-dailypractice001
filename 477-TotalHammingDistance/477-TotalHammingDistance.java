// Last updated: 7/26/2026, 10:57:56 PM
class Solution {
    public int totalHammingDistance(int[] nums) {
        int c=0;
        for(int i=0;i<32;i++){
            int ones=0;
            for(int j=0;j<nums.length;j++){
                ones+=(nums[j]>>i)&1; //checking ith bit of nums[i] with every bit from 0 to 31 to count number of diff 0 and 1's count is there then making that number of possible combination of 1 0 alter bits
            }
            int z=nums.length-ones;
            c+=z*ones;
        }
    return c;
    }
}