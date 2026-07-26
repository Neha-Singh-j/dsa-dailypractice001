// Last updated: 7/26/2026, 10:49:34 PM
class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i: nums[0]){
            ans.add(i);
        }
        //lets nums[0][0] is ans;
        for(int i=1;i<nums.length;i++){
            List<Integer> curr=new ArrayList<>();
            for(int k: nums[i]){
                curr.add(k);
            }
            for(int j=ans.size()-1;j>=0;j--){
                if(!curr.contains(ans.get(j))){
                    ans.remove(j);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}