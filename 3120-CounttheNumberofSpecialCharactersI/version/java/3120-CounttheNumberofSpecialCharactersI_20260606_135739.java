// Last updated: 6/6/2026, 1:57:39 PM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        HashSet<Character> s1=new HashSet<>();
4        HashSet<Character> s2=new HashSet<>();
5        for(char ch: word.toCharArray()){
6            if(ch>='a' && ch<='z') s1.add(ch);
7            else s2.add(ch);
8        }
9        int c=0;
10        for(char ch: s1){
11            if(s2.contains(Character.toUpperCase(ch))) c++;
12        }
13        return c;
14    }
15}