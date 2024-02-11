public class PatternPrinting {
    public static void main(String[] args) {
        int n = 5;
        printPattern1(n);
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
}
