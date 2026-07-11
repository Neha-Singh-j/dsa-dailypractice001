// Last updated: 7/12/2026, 12:16:46 AM
class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int num=n;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        return Math.abs(n-rev);
    }
}