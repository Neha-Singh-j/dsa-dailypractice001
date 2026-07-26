// Last updated: 7/26/2026, 10:55:52 PM
class KthLargest {

    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        pq =new PriorityQueue<>();
        this.k=k;
        for(int x: nums){
            pq.add(x);
        }

    }
    
    public int add(int val) {
        pq.add(val);
       
        while(pq.size()>k){
            pq.poll();
        }
       
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */