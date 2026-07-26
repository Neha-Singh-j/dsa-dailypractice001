// Last updated: 7/26/2026, 10:48:19 PM
class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans=new ArrayList<>();
        int n=queries.length;
        for(String q: queries){
            if(check(q,dictionary)) ans.add(q);
        }
        return ans;

    }
    public boolean check(String qr, String[] dict){
        boolean f=false;
       int c=0;
        for(int i=0;i<dict.length;i++){
            c=0;
           for(int j=0;j<dict[i].length();j++){
                if(qr.charAt(j)!=dict[i].charAt(j)) c++;
                if(c>2) break;
           }
           if(c<=2) return true;
        }
        return f;
    }
}