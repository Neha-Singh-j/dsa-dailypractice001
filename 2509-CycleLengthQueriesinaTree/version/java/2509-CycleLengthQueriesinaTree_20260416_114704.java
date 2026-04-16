// Last updated: 4/16/2026, 11:47:04 AM
1class Solution {
2    public int[] cycleLengthQueries(int n, int[][] queries) {
3        int[] arr=new int[queries.length];
4        int i=0;
5        for(int[] x:queries){
6            int anc=ancs(x[0],x[1]);
7            int ht1=ht(x[0]);
8            int ht2=ht(x[1]);
9            int ancht=ht(anc);
10            arr[i]=ht1+ht2-2*ancht+1;
11            i++;
12        }
13        return arr;
14    }
15        public int ancs(int a,int b){
16            
17            while(a!=b){
18                if(a>b){
19                    a/=2;
20                }else{
21                    b/=2;
22                }
23            }
24            return a;
25        }
26        public int ht(int x){
27            double ans = Math.log(x) / Math.log(2);
28            return (int)(ans) +1;
29        }
30    
31}