// Last updated: 8/20/2026, 12:09:16 AM
class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        String curr=s.substring(0,(n/2));
        int[] fr=new int[26];
        for(int i=0;i<curr.length();i++){
            char ch=curr.charAt(i);
            fr[ch-'a']++;
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<26;i++){
            int c=fr[i];
            while(c-->0){
                str.append((char)('a'+i));
            }
        }
        String res=str.toString();
         if(n%2!=0){
            res=res+s.charAt(n/2);
         }
        res=res+str.reverse().toString();
        return res;
    }
}