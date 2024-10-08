class Solution {
    public char[][] board;
    public List<List<String>> answer; //final answer (contains multiple valid combinations)

    //to check if a row, column, or left or right diagonal already contains a queen in it
    public boolean[] rowHasQ;
    public boolean[] colHasQ;
    public boolean[] d1HasQ;
    public boolean[] d2HasQ;

    public void solve(int row, int col, int queensLeft) {
        if (queensLeft == 0) {
            //we have found a valid combination on the board,
            //save board as answer and go back to figure out other combinations
            List<String> validBoard = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                validBoard.add(new String(board[i]));
            }
            answer.add(validBoard);
            return;
        }

        //we've traversed the whole board
        //go back and figure out other combinations
        if (row >= board.length)
            return;

        
        //right diagonal (slope = 1)
        int d1 = col - row + (board.length - 1);
        //added (board.length - 1) so that index does't become negative
        
        
        //left diagonal (slope = -1)
        int d2 = row + col;



        //Possibility 1. Include Q at current cell
        if (
            //Make sure that current row, col, or diagonal doesn't already contain a Queen in it
            !rowHasQ[row] && !colHasQ[col] && !d1HasQ[d1] && !d2HasQ[d2]
        ) {
            //put a Queen at current cell
            board[row][col] = 'Q';
            rowHasQ[row] = colHasQ[col] = d1HasQ[d1] = d2HasQ[d2] = true;

            //Continue traversing rest of the cells starting from next row.
            //Start from next row because current row already contains a Q now. (Optimized brute force)
            solve(row + 1, 0, queensLeft - 1);

            //reset board
            board[row][col] = '.';
            rowHasQ[row] = colHasQ[col] = d1HasQ[d1] = d2HasQ[d2] = false;
        }



        //Possibility 2. dont include Q at current cell
        if (
            //Condition to optimize brute force
            //If we are at this positoin in the code, this means that none of previous cells in current row has any queen in it.
            //And because each row in the board must contain exactly 1 queen,
            //With the help of following condition we will make sure that current row must contain at least one queen.
            col < board.length - 1
        ) {
            //dont include queen at current cell and continue exploring starting from next cell (in same row)
            solve(row, col + 1, queensLeft);
        }
    }

    public List<List<String>> solveNQueens(int n) {
        answer = new ArrayList<>();

        board = new char[n][n];
        for (int i = 0; i < board.length; i++)
            Arrays.fill(board[i], '.');

        rowHasQ = new boolean[n];
        colHasQ = new boolean[n];
        d1HasQ = new boolean[n * 2 - 1];
        d2HasQ = new boolean[n * 2 - 1];

        solve(0, 0, n);

        return answer;
    }
}