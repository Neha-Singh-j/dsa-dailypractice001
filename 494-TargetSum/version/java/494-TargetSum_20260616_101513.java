// Last updated: 6/16/2026, 10:15:13 AM
1class Solution {
2    int ans=0;
3    public int findTargetSumWays(int[] nums, int target) {
4       return rec(nums,target,0,0);
5    }
6    public int rec(int[] arr, int t, int i, int curr){
7        if(i==arr.length){
8            if(curr==t){
9                return 1;
10            }
11            return 0;
12        }
13        int s1=rec(arr,t,i+1,curr+arr[i]);
14        int s2=rec(arr,t,i+1,curr-arr[i]);
15        return s1+s2;
16
17    }
18}