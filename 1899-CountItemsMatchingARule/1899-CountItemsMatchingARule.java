// Last updated: 7/26/2026, 10:51:05 PM
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int id=0;
        if(ruleKey.equals("type")) id=0;
        else if (ruleKey.equals("color")) id=1;
        else id=2;

        int c=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(id).equals(ruleValue)) c++;
        }
        return c;
    }
}