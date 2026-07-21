// Last updated: 7/21/2026, 11:52:12 AM
class Solution {
public:
    int countBeautifulPairs(vector<int>& nums) {

        vector<string> arr(nums.size());

        // convert numbers to string
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = to_string(nums[i]);
        }

        int c = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {

                int first = arr[i][0] - '0';
                int last = nums[j] % 10;

                if (coprime(first, last)) c++;
            }
        }

        return c;
    }

    bool coprime(int a, int b) {
        return gcd(a, b) == 1;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
};