class Solution {
    public boolean exist(char[][] board, String word) {
    char[] w = word.toCharArray();  // Convert the word to a char array for easier indexing
    for (int y=0; y<board.length; y++) { //// Iterate over each row
    	for (int x=0; x<board[y].length; x++) { // Iterate over each column
    		if (exist(board, y, x, w, 0)) return true;
    	}
    }
    return false;
}

private boolean exist(char[][] board, int y, int x, char[] word, int i) {
	if (i == word.length) return true;// Base case: if i == word.length, we have successfully found all characters
    // Boundary conditions and checking if the current cell matches the current character in word
	if (y<0 || x<0 || y == board.length || x == board[y].length) return false;
	if (board[y][x] != word[i]) return false;
    // Mark the current cell as visited by changing its value
	board[y][x] ^= 256;
        // Explore all four possible directions (right, left, down, up)
	boolean exist = exist(board, y, x + 1, word, i + 1)  // Move right
        || exist(board, y, x - 1, word, i + 1)  // Move left
        || exist(board, y + 1, x, word, i + 1)  // Move down
        || exist(board, y - 1, x, word, i + 1);  // Move up
        // Unmark the cell by reverting the change made    
    board[y][x] ^= 256;  // Toggle the bit back to its original state
	return exist;
}
}