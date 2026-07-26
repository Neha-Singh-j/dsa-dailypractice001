// Last updated: 7/26/2026, 10:53:59 PM
class Solution {

    StringBuilder res = new StringBuilder();

    public String alphabetBoardPath(String target) {
        dfs(target, 0, 0, 0);
        return res.toString();
    }

    // recursive helper
    void dfs(String target, int idx, int i, int j) {
        if (idx == target.length()) return;
        char ch = target.charAt(idx);
        char[][] board = {{'a','b','c','d','e'}, {'f','g','h','i','j'}, {'k','l','m','n','o'}, {'p','q','r','s','t'},{'u','v','w','x','y'},{'z'}};
        int row = 0, col = 0;
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == ch) {
                    row = x;
                    col = y;
                }
            }
        }
        // move UP
        while (i > row) {
            res.append('U');
            i--;
        }
        // move LEFT
        while (j > col) {
            res.append('L');
            j--;
        }
        // move DOWN
        while (i < row) {
            res.append('D');
            i++;
        }
        // move RIGHT
        while (j < col) {
            res.append('R');
            j++;
        }
        res.append('!');
        dfs(target, idx + 1, i, j);
    }
}
