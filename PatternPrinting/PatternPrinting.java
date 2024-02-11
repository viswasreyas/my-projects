public class PatternPrinting {
    public static void main(String[] args) {
        int n = 5;
        printPattern4(n);
    }
/*
 *
 * *
 * * *
 * * * *
 * * *
 * *
 *
 */
    private static void printPattern1(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int noOfCols = (row > n) ? 2 * n - row : row;
            for (int i = 0; i < noOfCols; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *
      * * * * *
       * * * *
        * * *
         * *
          *
     */
    private static void printPattern2(int n) {
        for (int row = 0; row < 2 * n ; row++) {
            int noOfSpaces = (row > n) ? row - n : n - row;
            int patternPerRow = (row > n) ? 2 * n - row : row;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < patternPerRow; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
         1
       2 1 2
     3 2 1 2 3
   4 3 2 1 2 3 4
 5 4 3 2 1 2 3 4 5
     */
    private static void printPattern3(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - row;

            for (int i = 0; i < noOfSpaces ; i++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2 ; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /*
         1
       2 1 2
     3 2 1 2 3
   4 3 2 1 2 3 4
 5 4 3 2 1 2 3 4 5
   4 3 2 1 2 3 4
     3 2 1 2 3
       2 1 2
         1
     */
    private static void printPattern4(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int noOfSpaces = (row > n) ? (row - n) : (n - row);
            int col = (row > n) ? 2 * n - row : row;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print("  ");
            }
            for (int j = col; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= col; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
