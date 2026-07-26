// Last updated: 7/26/2026, 10:49:58 PM
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n=asteroids.length;
        long curr=mass;
        for(int i=0;i<n;i++){
            if(curr<asteroids[i]) return false;
            curr+=asteroids[i];
        }
        return true;
    }
}