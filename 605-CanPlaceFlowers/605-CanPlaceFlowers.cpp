// Last updated: 7/26/2026, 10:57:00 PM
class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int c = 0;

        for (int i = 0; i < flowerbed.size(); i++) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == flowerbed.size() - 1 || flowerbed[i + 1] == 0)) {

                c++;
                flowerbed[i] = 1;
                i++;  // skip next position
            }
        }

        return c >= n;
    }
};