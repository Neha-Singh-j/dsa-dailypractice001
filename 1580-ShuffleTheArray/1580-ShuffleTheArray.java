// Last updated: 7/26/2026, 10:52:20 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int j=n;
        int k=0;
        for(int i=0;i<n;i++){
            ans[k]=nums[i];
            k++;
            ans[k]=nums[j];
            j++;
            k++;
        }
        return ans;
    }
}