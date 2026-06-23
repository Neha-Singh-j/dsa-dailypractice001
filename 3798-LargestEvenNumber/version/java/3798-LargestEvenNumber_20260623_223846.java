// Last updated: 6/23/2026, 10:38:46 PM
1class Solution {
2    public String largestEven(String s) {
3    if(s.length()==1 && (s.charAt(0)-'0')%2==0)  return s;
4    else if(s.length()==1) return "";
5
6    while(s.length()>0){
7        if((s.charAt(s.length()-1)-'0')%2==0) return s;
8        else s=s.substring(0,s.length()-1);
9    }
10    return "";
11
12    }
13}