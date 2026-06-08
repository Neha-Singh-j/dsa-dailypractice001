// Last updated: 6/8/2026, 6:07:02 PM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3       return partition(nums,pivot);
4
5    }
6    public static int[] partition(int[] nums,int pivot){
7        int[] arr=new int[nums.length];
8        int j=0;
9        for(int i=0;i<nums.length;i++){
10            if(nums[i]<pivot){
11                arr[j]=nums[i];
12                j++;
13            }
14        }
15        for(int i=0;i<nums.length;i++){
16            if(nums[i]==pivot){
17                arr[j]=nums[i];
18                j++;
19            }
20        }
21        for(int i=0;i<nums.length;i++){
22            if(nums[i]>pivot){
23                arr[j]=nums[i];
24                j++;
25            }
26        }
27        return arr;
28    }
29}