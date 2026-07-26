// Last updated: 7/26/2026, 10:52:12 PM
class Solution {
    public int countOdds(int low, int high) {
        int c=0;
        c+=(high-low)/2;
        if(low%2!=0){
            c++;
        }else if(high%2!=0){
            c++;
        }
        return c;
    }
}