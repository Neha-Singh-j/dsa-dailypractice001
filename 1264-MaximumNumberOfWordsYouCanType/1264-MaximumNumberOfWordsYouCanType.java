// Last updated: 7/26/2026, 10:53:50 PM
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr=text.split(" ");
        int c=0;
        for(String s: arr){
        boolean flag=false;
            for(int i=0;i<brokenLetters.length();i++){
                if(present(s,brokenLetters.charAt(i))){
                        flag=true;
                        break;
                }
            }
            if(!flag){
                c++;
            }
            
        }
        return c;
    }
    public static boolean present(String s,char ch){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                return true;
            }
        }
        return false;
    }
}