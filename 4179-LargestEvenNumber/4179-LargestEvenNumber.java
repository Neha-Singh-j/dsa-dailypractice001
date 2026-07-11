// Last updated: 7/12/2026, 12:16:36 AM
class Solution {
    public String largestEven(String s) {
    if(s.length()==1 && (s.charAt(0)-'0')%2==0)  return s;
    else if(s.length()==1) return "";

    while(s.length()>0){
        if((s.charAt(s.length()-1)-'0')%2==0) return s;
        else s=s.substring(0,s.length()-1);
    }
    return "";

    }
}