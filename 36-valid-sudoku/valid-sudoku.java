class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] arr = new boolean[9];
        for (int i = 0; i < 9; i++) {
            Arrays.fill(arr, false);
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int k = (int) board[i][j] - 49;
                    if (arr[k])
                        return false;
                    arr[k] = true;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Arrays.fill(arr, false);
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    int k = (int) board[j][i] - 49;
                    if (arr[k])
                        return false;
                    arr[k] = true;
                }
            }
        }

        class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] arr = new boolean[9];
        for (int i = 0; i < 9; i++) {
            Arrays.fill(arr, false);
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int k = (int) board[i][j] - 49;
                    if (arr[k])
                        return false;
                    arr[k] = true;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            Arrays.fill(arr, false);
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    int k = (int) board[j][i] - 49;
                    if (arr[k])
                        return false;
                    arr[k] = true;
                }
            }
        }

        for (int r = 0; r < 9; r+=3) {
            for (int c = 0; c < 9; c+=3) {
                Arrays.fill(arr, false);
                for (int i = r; i < r+3; i++) {
                    for (int j = c; j < c+3; j++) {
                        if (board[i][j] != '.') {
                            int k = (int) board[i][j] - 49;
                            if (arr[k]) {
                                return false;
                            }
                            arr[k] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}
                Arrays.fill(arr, false);
                int n1 = (r + 1) * 3;
                int n2 = (c + 1) * 3;
                for (int i = n1 - 3; i < n1; i++) {
                    for (int j = n2 - 3; j < n2; j++) {
                        if (board[i][j] != '.') {
                            int k = (int) board[i][j] - 49;
                            if (arr[k]) {
                                return false;
                            }
                            arr[k] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}
