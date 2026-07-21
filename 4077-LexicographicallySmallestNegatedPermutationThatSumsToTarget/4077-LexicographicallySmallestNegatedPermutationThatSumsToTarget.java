// Last updated: 7/21/2026, 11:49:35 AM
class Solution {
    public int[] lexSmallestNegatedPerm(int n, long target) {
        long n1=(long) n*(n+1)/2;
        if ((n1 - target) % 2 != 0) return new int[0];
        long check = (n1 - target) / 2;
        if (check < 0) return new int[0];
        int[] perm=new int[n];
        for(int i=n;i>=1;i--){
            if(check>=i){
                perm[i-1]=-i;
                check-=i;
            }else{
                perm[i-1]=i;
            }
        }
        Arrays.sort(perm);
        if(check!=0) return new int[0];
        return perm;
    }
}