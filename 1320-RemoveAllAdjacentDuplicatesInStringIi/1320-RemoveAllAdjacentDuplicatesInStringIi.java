// Last updated: 7/26/2026, 10:53:41 PM
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> ch=new Stack<>();
        Stack<Integer> count=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!ch.isEmpty() && c==ch.peek()){
                count.push(count.pop()+1);
            }else{
                ch.push(c);
                count.push(1);
            }
            if(count.peek()==k){
                ch.pop();
                count.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!ch.isEmpty()){
            int cnt=count.pop();
            char curr=ch.pop();
            while(cnt-->0){
            sb.append(curr);
            }
        }
        return sb.reverse().toString();
    }
}