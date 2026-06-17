// Last updated: 6/17/2026, 8:47:59 PM
1class Solution {
2    public int countLargestGroup(int n) {
3        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
4        for(int i=1;i<=n;i++){
5            int s=sum(i);
6            if(map.containsKey(s)){
7                map.get(s).add(i);
8            }else{
9                ArrayList<Integer> arr=new ArrayList<>();
10                arr.add(i);
11                map.put(s,arr);
12            }
13        }
14        int max=0;
15        for(int key: map.keySet()){
16            max=Math.max(max,map.get(key).size());
17        }
18        int c=0;
19        for(int key: map.keySet()){
20           if(map.get(key).size()==max) c++;
21        }
22        return c;
23    }
24    public static int sum(int n){
25        int s=0;
26        while(n>0){
27            s+=n%10;
28            n/=10;
29        }
30        return s;
31    }
32}