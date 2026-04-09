// Last updated: 4/9/2026, 3:50:42 PM
1class Solution {
2    
3    public int singleNumber(int[] nums) {
4        int i=0,res=0;
5        for(i=0;i<nums.length;i++)
6        {
7            res^=nums[i];
8        }
9         return res;
10    }
11
12}