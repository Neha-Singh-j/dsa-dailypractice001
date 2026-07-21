// Last updated: 7/21/2026, 11:51:14 AM
class Solution {
    public long calculateScore(String s) {
        Stack<Integer>[] st=new Stack[26];
         //this is array of type stack 
        // int[] arr=new int[n];
        for (int i = 0; i < 26; i++) {
            st[i] = new Stack<>();
        }
        long ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st['z'-ch].isEmpty()){
                st[ch-'a'].push(i);
            }else{
                int x=st['z'-ch].pop();
                ans+= i-x;
            }
            
        }
        return ans;

    }
}