// Last updated: 7/21/2026, 11:52:09 AM
class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(nums[i],max);
        }
        if(n!=max+1) return false;
        for(int key: map.keySet()){
            if(key==max) return map.get(key)==2;
            if(map.get(key)>1 && key!=max) return false;
        }
        return true;
    }
}