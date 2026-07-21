// Last updated: 7/21/2026, 11:49:25 AM
class Solution {
    public int minimumFlips(int n) {
        String s=decToBin(n);
        int i=0;
        int j=s.length()-1;
        int c=0;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) c+=2;
            i++;
            j--;
        }
        return c;
    }
    public static String decToBin(int n){
        StringBuilder sb=new StringBuilder();
		while(n>0) {
			int rem=n%2;
            sb.append(rem);
			n=n/2;
		}
		return sb.reverse().toString();
    }
}