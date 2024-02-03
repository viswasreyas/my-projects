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
                if(checkWin(player)) {
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
    private static boolean checkWin(char player) {
        return false;
    }
}