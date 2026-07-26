// Last updated: 7/26/2026, 10:55:25 PM
class Solution {
public:
    int longestMountain(vector<int>& arr) {
        int c = 0;
        
        if (arr.size() < 3) {
            return 0;
        }

        for (int i = 1; i < arr.size() - 1; i++) {
            
            // peak condition
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {

                int left = i - 1;
                int right = i + 1;

                // go left (increasing)
                while (left > 0 && arr[left - 1] < arr[left]) {
                    left--;
                }

                // go right (decreasing)
                while (right < arr.size() - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                c = max(c, right - left + 1);
            }
        }

        return c;
    }
};