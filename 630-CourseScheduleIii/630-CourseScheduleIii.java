// Last updated: 7/26/2026, 10:56:47 PM
class Solution {
    public int scheduleCourse(int[][] courses) {

        // sort by deadline
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);

        // max heap to store durations
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        int time = 0;
        for (int i = 0; i < courses.length; i++) {
            int duration = courses[i][0];
            int deadline = courses[i][1];
            time += duration;
            pq.add(duration);
            if (time > deadline) {
                time -= pq.poll();
            }
        }

        return pq.size();
    }
}
