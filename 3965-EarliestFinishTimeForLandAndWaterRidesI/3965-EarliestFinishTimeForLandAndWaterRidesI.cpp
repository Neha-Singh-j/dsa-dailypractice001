// Last updated: 7/21/2026, 11:50:16 AM
class Solution {
public:
    int earliestFinishTime(vector<int>& landStartTime, vector<int>& landDuration,
                           vector<int>& waterStartTime, vector<int>& waterDuration) {

        int res = INT_MAX;

        for (int i = 0; i < landStartTime.size(); i++) {
            for (int j = 0; j < waterStartTime.size(); j++) {

                int wEnd = waterStartTime[j] + waterDuration[j];
                int lBeg = max(wEnd, landStartTime[i]);
                int time1 = lBeg + landDuration[i];

                int lEnd = landStartTime[i] + landDuration[i];
                int wBeg = max(lEnd, waterStartTime[j]);
                int time2 = wBeg + waterDuration[j];

                res = min(res, min(time1, time2));
            }
        }

        return res;
    }
};