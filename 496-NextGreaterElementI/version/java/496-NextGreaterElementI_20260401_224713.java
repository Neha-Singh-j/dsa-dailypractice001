// Last updated: 4/1/2026, 10:47:13 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        int n=nums2.length;
4        int[] nxt=new int[n];
5        Stack<Integer> st=new Stack<>();
6        for(int i=0;i<n;i++){
7            while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
8                nxt[st.pop()]=nums2[i];
9            }
10            st.push(i);
11        }
12        while(!st.isEmpty()){
13            nxt[st.pop()]=-1;
14        }
15        int[] ans=new int[nums1.length];
16        for(int i=0;i<nums1.length;i++){
17            for(int j=0;j<nums2.length;j++){
18                if(nums1[i]==nums2[j]){
19                    ans[i]=nxt[j];
20                }
21            }
22        }
23        return ans;
24    }
25}