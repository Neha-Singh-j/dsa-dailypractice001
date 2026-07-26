// Last updated: 7/26/2026, 10:55:32 PM
class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {

        int n = image.size();

        for (int i = 0; i < n; i++) {

            int j = 0;
            int k = image[0].size() - 1;

            while (j <= k) {

                int temp = image[i][j] ^ 1;

                image[i][j] = image[i][k] ^ 1;

                image[i][k] = temp;

                j++;
                k--;
            }
        }

        return image;
    }
};