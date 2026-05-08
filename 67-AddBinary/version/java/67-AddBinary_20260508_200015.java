// Last updated: 5/8/2026, 8:00:15 PM
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuffer finalRes=new StringBuffer();
4        int i=a.length()-1;
5        int j=b.length()-1;
6        int carry=0;
7        while(i>=0||j>=0|| carry!=0){
8           int res=carry;
9            if(i>=0){
10                res+=a.charAt(i)-'0';
11                i--;
12            }
13            if(j>=0){
14                res+=b.charAt(j)-'0';
15                j--;
16            }
17            finalRes.append(res%2);
18            carry=res/2;
19        }
20        return finalRes.reverse().toString();
21    }
22}