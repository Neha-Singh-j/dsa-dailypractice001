// Last updated: 6/28/2026, 9:39:56 PM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] arr=s.split(" ");
4        HashMap<Character,String> map=new HashMap<>();
5        HashMap<String,Character> map2=new HashMap<>();
6        if(pattern.length()!=arr.length) return false;
7        for(int i=0;i<pattern.length();i++){
8            char ch=pattern.charAt(i);
9            if(map.containsKey(ch)){
10                if(!map.get(ch).equals(arr[i])) return false;
11            }else{
12                map.put(ch,arr[i]);
13            }
14            if(map2.containsKey(arr[i])){
15                if(map2.get(arr[i])!=ch) return false;
16            }else{
17                map2.put(arr[i],ch);
18            }
19            
20        }
21        return true;
22    }
23}