// Last updated: 7/21/2026, 11:49:05 AM
class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                min=Math.min(min, i-map.get(nums[i]));
            }
            int rev=reverse(nums[i]);
            map.put(rev,i);
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }else{
            return min;
        }
    }
    public static int reverse(int x){
        int rev=0;
        while(x>0){
            rev=rev*10+(x%10);
                x/=10;
        }
        return rev;
    }
}