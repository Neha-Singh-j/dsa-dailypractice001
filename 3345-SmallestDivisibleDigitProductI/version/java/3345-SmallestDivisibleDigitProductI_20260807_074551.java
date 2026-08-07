// Last updated: 8/7/2026, 7:45:51 AM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while(true){
4            int ns=1;
5          int num=n;
6            while(num>0){
7                int rem=num%10;
8                num=num/10;
9                ns=ns*rem;
10                if(ns%t==0){
11                    return n;
12                }
13            }
14            n++;
15        }
16    }
17}