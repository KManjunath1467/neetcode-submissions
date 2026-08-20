class Solution {

    public boolean exist(char[][] board, String word) {

        boolean[][] visited =
                new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if (check(board, word, 0, i, j, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean check(char[][] board, String word,
                         int index, int i, int j,
                         boolean[][] visited) {

        // Outside board
        if (i < 0 || j < 0 ||
            i >= board.length ||
            j >= board[0].length) {
            return false;
        }

        // Already used
        if (visited[i][j]) {
            return false;
        }

        // Character doesn't match
        if (board[i][j] != word.charAt(index)) {
            return false;
        }

        // Entire word found
        if (index == word.length() - 1) {
            return true;
        }

        // Mark current cell
        visited[i][j] = true;

        // Explore 4 directions
        boolean found =
                check(board, word, index + 1, i + 1, j, visited) ||
                check(board, word, index + 1, i - 1, j, visited) ||
                check(board, word, index + 1, i, j + 1, visited) ||
                check(board, word, index + 1, i, j - 1, visited);

        // Backtrack
        visited[i][j] = false;

        return found;
    }
}