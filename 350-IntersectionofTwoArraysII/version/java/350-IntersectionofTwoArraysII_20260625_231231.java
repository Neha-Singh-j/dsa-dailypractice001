// Last updated: 6/25/2026, 11:12:31 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        HashMap<Integer,Integer> m1=new HashMap<>();
4        HashMap<Integer,Integer> m2=new HashMap<>();
5        ArrayList<Integer> arr=new ArrayList<>();
6        for(int i=0;i<nums1.length;i++){
7            m1.put(nums1[i],m1.getOrDefault(nums1[i],0)+1);
8        }
9        for(int i=0;i<nums2.length;i++){
10            m2.put(nums2[i],m2.getOrDefault(nums2[i],0)+1);
11        }
12        boolean flag=m1.size()<m2.size(); //id m1 less size then true
13        if(flag){
14            //work on m1
15            for(int m: m1.keySet()){
16                if(m2.containsKey(m)){
17                    int cnt=Math.min(m1.get(m),m2.get(m));
18                    while(cnt-->0){
19                        arr.add(m);
20                    }
21                }
22            }
23        }else{
24            //work on m2
25            for(int m: m2.keySet()){
26                if(m1.containsKey(m)){
27                    int cnt=Math.min(m1.get(m),m2.get(m));
28                    while(cnt-->0){
29                        arr.add(m);
30                    }
31                }
32            }
33        }
34        int size=arr.size();
35        int[] ans=new int[size];
36        for(int i=0;i<size;i++){
37            ans[i]=arr.get(i);
38        }
39        return ans;
40    }
41}