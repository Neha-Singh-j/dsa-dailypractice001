// Last updated: 7/26/2026, 10:58:41 PM
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean flag=false;
        int c=0;
        for(char ch:map.keySet()){
            if(map.get(ch)>1){
                if(map.get(ch)%2==0){
                    c+=map.get(ch);
                }else if(!flag){
                    c=c+(map.get(ch));
                    flag=true;
                }else{
                    c=c+(map.get(ch)-1);
                }
            }else{
                if(!flag && map.get(ch)==1){
                    flag=true;
                     c++;
                }
            }
        }
        return c;
    }
}