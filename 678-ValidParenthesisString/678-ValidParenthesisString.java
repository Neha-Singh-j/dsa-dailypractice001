// Last updated: 7/26/2026, 10:56:25 PM
class Solution {
    public boolean checkValidString(String s) {
        int p1=0;
        int p2=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                p1++;
                p2++;
            }else if(ch==')'){
                if(p1>0){
                    p1--;
                }
                p2--;
            }else{
                if(p1>0){ 
                    p1--;
                }
                p2++; //let it oopen 
            }
        if(p2<0) return false;
        }
        return p1==0;
    }
}