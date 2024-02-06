/*

Approach used :
 - We define two variables rows and cols to store the number of rows and columns in our board respectively.
 - We then create another integer array called tempBoard which will be used to store the updated values for each cell on our board.
 - We then use nested for loops to iterate through each cell on our board.
 - For each cell, we calculate the number of live neighbors it has using the "neighbour" function defined earlier.
 - This function checks if there are any live cells adjacent to the current cell (top left, top center, top right, right, bottom right, bottom center, bottom left or left).
 - If there are any live cells adjacent to it, it returns 1 else it returns 0.
 - After calculating the number of live neighbors for each cell on our board, we check if that particular cell is currently alive or dead (represented by 1 or 0 respectively).
 - If it's alive and has less than two or more than three live neighbors (based on Conway's rules), then we update its value in tempBoard as dead (represented by 0).
 - Similarly, if a dead cell has exactly three live neighbors then according to Conway's rules it becomes alive so we update its value as such in tempBoard.
 - Once all cells have been checked and their new values have been stored in tempBoard accordingly based on their current state and number of neighbors, we copy these updated values back into our original board using another loop.
 - This ensures that at every iteration only one set of data gets modified while
 - The code attempts to simulate the Game of Life, a cellular automaton devised by John Conway.
 -It does so by creating a temporary board and using the neighbour function to determine the number of live neighbours for each cell, then updating the original board based on the rules of the game.

*/




class Solution {

    public int neighbour(int[][] board, int r, int c) {
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 0) {
            return 0;
        }
        return 1;
    }

    public void gameOfLife(int[][] board) {
        int rows = board.length, cols = board[0].length;
        int[][] tempBoard = new int[rows][cols];
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                int liveNeighbors = neighbour(board, r-1, c-1) + neighbour(board, r-1, c) + neighbour(board, r-1, c+1) + neighbour(board, r, c+1) +
                                neighbour(board, r+1, c+1) + neighbour(board, r+1, c) + neighbour(board, r+1, c-1) + neighbour(board, r, c-1);

                if(board[r][c] == 1){
                    tempBoard[r][c] = (liveNeighbors < 2 || liveNeighbors > 3) ? 0 : 1;
                }else{
                    tempBoard[r][c] = (liveNeighbors == 3) ? 1 : 0;
                }
            }
        }

        for(int r = 0; r < rows; r++){
            board[r] = tempBoard[r].clone();
        }
    }
}


