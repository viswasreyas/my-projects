import java.util.Scanner;

public class TicTacToe  {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        char[][] board = new char[row][col];
        boolean isGameOver = false;
        boolean errorOccured = false;
        char player = 'X';

        for(int i = 0; i < row; i++) {
            for(int j=0; j < col; j++) {
                board[i][j] = ' ';
            }
        }
        while(!isGameOver) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Player " + player + " input: ");

            int rowNum = scanner.nextInt();
            int colNum = scanner.nextInt();

            if(rowNum < row && colNum < col && board[rowNum][colNum] == ' '){
                board[rowNum][colNum] = player;
                if(checkWin(row, col, player, board)) {
                    isGameOver = true;
                }else {
                    player = (player == 'X') ? 'O' : 'X';
                }
                printBoard(row, col, board);
            } else {
                errorOccured = true;
                break;
            }
        }
        if(errorOccured) {
            System.out.println("Invalid input. Try again!");
        }
        if(isGameOver) {
            System.out.println("Player " + player + " won!");
        }
    }

    private static void printBoard(int row, int col, char[][] board) {
        for(int i = 0; i < row; i++) {
            for(int j=0; j < col; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
    private static boolean checkWin(int row, int col, char player, char[][] board) {
        for(int i = 0; i < row; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player){
                return true;
            }
        }
        for(int j=0; j < col; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player){
                return true;
            }
        }
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }
}