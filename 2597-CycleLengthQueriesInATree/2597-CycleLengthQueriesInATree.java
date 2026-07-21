// Last updated: 7/21/2026, 11:53:07 AM
class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int[] arr=new int[queries.length];
        int i=0;
        for(int[] x:queries){
            int anc=ancs(x[0],x[1]);
            int ht1=ht(x[0]);
            int ht2=ht(x[1]);
            int ancht=ht(anc);
            arr[i]=ht1+ht2-2*ancht+1;
            i++;
        }
        return arr;
    }
        public int ancs(int a,int b){
            
            while(a!=b){
                if(a>b){
                    a/=2;
                }else{
                    b/=2;
                }
            }
            return a;
        }
        public int ht(int x){
            double ans = Math.log(x) / Math.log(2);
            return (int)(ans) +1;
        }
    
}