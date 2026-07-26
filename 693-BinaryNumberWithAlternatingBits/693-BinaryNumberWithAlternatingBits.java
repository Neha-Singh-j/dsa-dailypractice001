// Last updated: 7/26/2026, 10:56:15 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n != 0){
            int l = n & 1;
            int sl = (n >> 1) & 1;
            if((l ^ sl) == 0) return false;
            n = n >> 1;
        }
        return true;
    }
}