// Last updated: 7/26/2026, 10:52:28 PM
class Solution {
    public boolean hasAllCodes(String s, int k) {
        int c=0;
        HashSet<String> set=new HashSet<>();
        int i=0;
        int j=k;
        while(j<=s.length()){
            String curr=s.substring(i,j);
            if(!set.contains(curr)){
                c++;
                set.add(curr);
            }
            i++;
            j++;
        }
        if(set.size()>=(1 << k)) return true;
        return false;
    }
}