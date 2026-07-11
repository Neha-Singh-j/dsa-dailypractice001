// Last updated: 7/12/2026, 12:16:24 AM
class Solution {
    public int firstMatchingIndex(String s) {
        int a=0;
        int b=s.length()-1;
        while(a<=b){
           if(s.charAt(a)==s.charAt(b)) return a;
           a++;
           b--;
        }
        return -1;

    }
}