// Last updated: 7/26/2026, 10:51:59 PM
class Solution {
    public int maxRepeating(String sequence, String word) {
        int n=word.length();
        int m=sequence.length();
        int c=0;
        StringBuilder sb=new StringBuilder();
        sb.append(word);
        while(sequence.contains(sb)){
            sb=sb.append(word);
            c++;
        }
         return c;
    }
}