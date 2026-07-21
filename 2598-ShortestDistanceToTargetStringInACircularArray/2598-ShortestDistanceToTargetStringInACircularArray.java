// Last updated: 7/21/2026, 11:53:01 AM
class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int stp=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            // i=(i-1+n)%n;
            if(words[i].equals(target)){
                int diff=Math.abs(i-startIndex);
                int steps=Math.min(diff,n-diff);
                stp=Math.min(steps,stp);
            }
        }
        if(stp==Integer.MAX_VALUE) return -1;
        return stp;
    }
}