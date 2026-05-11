// Last updated: 5/11/2026, 6:51:44 PM
1class Solution {
2    public int minIncrementForUnique(int[] arr) {
3        Arrays.sort(arr);
4        int move=0;
5        for(int i=1;i<arr.length;i++){
6            if(arr[i]<=arr[i-1]){
7                int incre=arr[i-1]+1-arr[i];
8                move+=incre;
9                arr[i]+=incre;
10            }
11            
12        }
13        return move;
14    }
15}