// Last updated: 6/18/2026, 9:05:18 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int k=nums.length-2;
4        while(k>=0 && nums[k]>=nums[k+1]){
5            k--;
6        }
7        if(k>=0){
8        int j=nums.length-1;
9        while(nums[j]<=nums[k]){
10            j--;
11        }
12        Swap(nums,k,j);
13        }
14        revrse(nums,k+1,nums.length-1);
15    }
16    public static void Swap(int[] nums,int k,int j){
17        int curr=nums[k];
18        nums[k]=nums[j];
19        nums[j]=curr;
20    }
21    public static void revrse(int[] nums,int k,int  j) {
22        while(k<=j) {
23        int curr=nums[k];
24        nums[k]=nums[j];
25        nums[j]=curr;
26        k++;
27        j--;
28        }
29    }
30    
31}