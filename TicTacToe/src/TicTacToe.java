public class TicTacToe  {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        char[][] board = new char[row][col];

        for(int i = 0; i < row; i++) {
            for(int j=0; j < col; j++) {
                board[i][j] = ' ';
            }
        }
    }
}