// Last updated: 7/21/2026, 11:49:29 AM
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> unique=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            unique.add(s.charAt(i));
        }
        return unique.size();
    }
}