// Last updated: 7/26/2026, 10:58:58 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m1=new HashMap<>();
        HashMap<Integer,Integer> m2=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            m1.put(nums1[i],m1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            m2.put(nums2[i],m2.getOrDefault(nums2[i],0)+1);
        }
        boolean flag=m1.size()<m2.size(); //id m1 less size then true
        if(flag){
            //work on m1
            for(int m: m1.keySet()){
                if(m2.containsKey(m)){
                    int cnt=Math.min(m1.get(m),m2.get(m));
                    while(cnt-->0){
                        arr.add(m);
                    }
                }
            }
        }else{
            //work on m2
            for(int m: m2.keySet()){
                if(m1.containsKey(m)){
                    int cnt=Math.min(m1.get(m),m2.get(m));
                    while(cnt-->0){
                        arr.add(m);
                    }
                }
            }
        }
        int size=arr.size();
        int[] ans=new int[size];
        for(int i=0;i<size;i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}