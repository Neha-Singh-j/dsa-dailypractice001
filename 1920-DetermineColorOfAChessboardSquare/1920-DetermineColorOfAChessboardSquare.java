// Last updated: 7/26/2026, 10:51:02 PM
class Solution {
    public boolean squareIsWhite(String s) {
       int ch1=s.charAt(0)-'a';
        int ch2=s.charAt(1)-'1';
        if((ch2%2!=0 && ch1%2!=0) || (ch2%2==0 && ch1%2==0)) return false;
        return true;
    }
}