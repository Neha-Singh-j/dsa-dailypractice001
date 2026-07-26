// Last updated: 7/26/2026, 10:56:32 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int l=0,r=0,u=0,d=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U') u++;
            else if(moves.charAt(i)=='D') d++;
            else if(moves.charAt(i)=='L') l++;
            else r++;
        }
        return (Math.abs(l-r)+Math.abs(d-u))==0;
    }
}