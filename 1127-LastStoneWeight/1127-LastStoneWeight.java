// Last updated: 7/26/2026, 10:54:18 PM
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int x : stones) {
            pq.add(x);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (a != b) {
                pq.add(a - b); // a > b always in max-heap
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}