// Last updated: 7/26/2026, 10:53:10 PM
class Solution {
    public String greatestLetter(String s) {
        int[] sm=new int[26];
        int[] bg=new int[26];

        for(char ch: s.toCharArray()){
            if(ch>='a'&& ch<='z'){
                sm[ch-'a']++;
            }else{
                bg[ch-'A']++;
            }
        }
        String ans="";
        for(int i=25;i>=0;i--){
            if(sm[i]>0 && bg[i]>0){
                ans=ans+ (char)(i+65);
                break;
            }

        }
        return ans;
    }
}