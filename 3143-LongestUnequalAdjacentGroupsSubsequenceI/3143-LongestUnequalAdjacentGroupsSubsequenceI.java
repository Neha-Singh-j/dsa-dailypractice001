// Last updated: 7/21/2026, 11:52:08 AM
class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> arr=new ArrayList<>();
        arr.add(words[0]);
        int curr=groups[0];
        for(int i=1;i<groups.length;i++){
            if(groups[i]!=curr){
                arr.add(words[i]);
                curr=groups[i];
            }
        }
        return arr;
    }
}