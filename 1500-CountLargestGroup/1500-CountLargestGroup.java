// Last updated: 7/26/2026, 10:52:36 PM
class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            int s=sum(i);
            if(map.containsKey(s)){
                map.get(s).add(i);
            }else{
                ArrayList<Integer> arr=new ArrayList<>();
                arr.add(i);
                map.put(s,arr);
            }
        }
        int max=0;
        for(int key: map.keySet()){
            max=Math.max(max,map.get(key).size());
        }
        int c=0;
        for(int key: map.keySet()){
           if(map.get(key).size()==max) c++;
        }
        return c;
    }
    public static int sum(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}