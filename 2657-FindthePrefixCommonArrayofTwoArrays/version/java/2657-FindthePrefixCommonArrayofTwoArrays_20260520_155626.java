// Last updated: 5/20/2026, 3:56:26 PM
1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        int[] arr=new int[A.length];
4        int[] freq=new int[A.length+1];
5        int curr=0;
6        for(int i=0;i<A.length;i++){
7            int v1=++freq[A[i]];
8           if(v1==2){
9            curr++;
10           }
11           int v2=++freq[B[i]];
12           if(v2==2){
13            curr++;
14           }
15           arr[i]=curr;
16        }
17        return arr;
18    }
19}