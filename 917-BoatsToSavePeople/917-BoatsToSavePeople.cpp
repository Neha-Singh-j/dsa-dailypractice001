// Last updated: 7/26/2026, 10:55:15 PM
class Solution {
public:
    int numRescueBoats(vector<int>& people, int limit) {

        sort(people.begin(), people.end());

        int i = 0;
        int j = people.size() - 1;
        int boats = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;  // lightest goes with heaviest
            }
            j--;      // always take heaviest
            boats++;
        }

        return boats;
    }
};