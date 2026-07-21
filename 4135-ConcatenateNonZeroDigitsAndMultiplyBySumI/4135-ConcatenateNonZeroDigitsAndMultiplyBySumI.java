// Last updated: 7/21/2026, 11:49:13 AM
class Solution {
    public long sumAndMultiply(int n) {
        String st=String.valueOf(n);
        long curr=0;
        long sum=0;
        char[] arr=st.toCharArray();
        for(char ch: arr){
            if(ch!='0'){
                long rem=(ch-'0');
                curr=curr*10+rem;
                sum+=rem;
            }
        }
        return sum*curr;
    }
}