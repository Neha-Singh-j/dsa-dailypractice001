// Last updated: 7/12/2026, 12:16:30 AM
class Solution {
    public int minOperations(int[] nums, int[] target) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=target[i]){
                s.add(nums[i]);
            }
        }
        return s.size();
    }
}