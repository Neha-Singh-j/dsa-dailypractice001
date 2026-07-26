// Last updated: 7/26/2026, 10:52:22 PM
class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i :nums){
            pq.add(i);
        }
        return (pq.poll()-1)*(pq.poll()-1);
    }
}