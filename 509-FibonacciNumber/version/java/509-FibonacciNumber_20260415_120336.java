// Last updated: 4/15/2026, 12:03:36 PM
1class Solution {
2    public int fib(int n) {
3        if(n==1 || n==0){
4            return n;
5        }
6        return fib(n-1)+fib(n-2);
7    }
8}