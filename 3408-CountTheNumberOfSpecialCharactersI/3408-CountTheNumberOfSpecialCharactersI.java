// Last updated: 7/21/2026, 11:51:33 AM
class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> s1=new HashSet<>();
        HashSet<Character> s2=new HashSet<>();
        for(char ch: word.toCharArray()){
            if(ch>='a' && ch<='z') s1.add(ch);
            else s2.add(ch);
        }
        int c=0;
        for(char ch: s1){
            if(s2.contains(Character.toUpperCase(ch))) c++;
        }
        return c;
    }
}