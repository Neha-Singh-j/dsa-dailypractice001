// Last updated: 7/12/2026, 12:16:26 AM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder r=new StringBuilder();
        for(String s: words){
            int sum=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                sum+=weights[ch-'a'];
            }
            int mod=sum%26;
            char c=(char)('z'-mod);
            r.append(c);
        }
        return r.toString();
    }
}