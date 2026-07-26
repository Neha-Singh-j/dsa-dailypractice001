// Last updated: 7/26/2026, 10:54:54 PM
class Solution {
     int hour = -1;
    int minute = -1;
    public String largestTimeFromDigits(int[] arr) {
        boolean used[] =new boolean[4];
        int[] res=new int[4];
        backtrack(arr,used,res,0);
        if (hour == -1) return "";
        return String.format("%02d:%02d", hour, minute);
    }
    private  void backtrack(int[] digits, boolean[] used, int[] res, int idx) {
        if (idx == 4) {
            int hr = res[0] * 10 + res[1];
            int min = res[2] * 10 + res[3];

            if (hr < 24 && min < 60) {
                if (hr > hour || (hr == hour && min > minute)) {
                    hour = hr;
                    minute = min;
                }
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (!used[i]) {
                used[i] = true;
                res[idx] = digits[i];
                backtrack(digits, used, res, idx + 1);
                used[i] = false; // backtrack
            }
        }
    }
}