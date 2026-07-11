// Last updated: 7/12/2026, 12:16:48 AM
class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        int cnt=vowelC(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(vowelC(arr[i])==cnt){
                arr[i]=rev(arr[i]);
            }
        }
        StringBuilder sc=new StringBuilder();
        for(String str:arr){
            sc.append(str).append(" ");
        }
        sc.deleteCharAt(sc.length()-1);
        return sc.toString();
    }
    public static String rev(String st){
        StringBuilder curr=new StringBuilder();
        for(int i=st.length()-1;i>=0;i--){
            curr.append(st.charAt(i));
        }
        return curr.toString();
    }
    public static int vowelC(String st){
        int c=0;
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o' || ch=='u'){
                c++;
            }
        }
        return c;
    }
}