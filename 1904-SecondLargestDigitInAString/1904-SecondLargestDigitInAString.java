// Last updated: 7/26/2026, 10:51:15 PM
class Solution {
    public int secondHighest(String s) {
        int max=Integer.MIN_VALUE,sec= Integer.MIN_VALUE;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch-'0'>=0 && ch-'0'<=9){
               int curr=ch-'0' ;
                if(curr>max){
                sec=max;
                max=curr;
            }else if(curr>sec && curr!=max){
                    sec=curr;
            }
         }
    
        }
        if(sec==Integer.MIN_VALUE) return -1;
        return sec;
     
    }
}