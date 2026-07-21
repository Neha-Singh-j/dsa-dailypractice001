// Last updated: 7/21/2026, 11:49:11 AM
class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String w: words){
            if(w.length()<k) continue;
            String curr=w.substring(0,k);
             map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        int c=0;
        for(int v:map.values()){
            if(v>=2) c++;
        }
        return c;
    }
}