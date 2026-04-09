import java.util.Arrays;

public class LeetCode36 {

    public static boolean isValidSudoku(char[][] board) {
        boolean[][] rows  = new boolean[9][9];
        boolean[][] cols  = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') continue;

                int digit  = board[i][j] - '1';
                int boxIdx = (i / 3) * 3 + (j / 3);

                if (rows[i][digit] || cols[j][digit] || boxes[boxIdx][digit]) {
                    return false;
                }

                rows[i][digit]       = true;
                cols[j][digit]       = true;
                boxes[boxIdx][digit] = true;
            }
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (i == 3 || i == 6) {
                System.out.println("------+-------+------");
            }
            for (int j = 0; j < 9; j++) {
                if (j == 3 || j == 6) System.out.print("| ");
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board1 = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] board2 = {
            {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        char[][] board3 = new char[9][9];
        for (char[] row : board3) Arrays.fill(row, '.');

        char[][] board4 = {
            {'5','3','.','.','7','.','.','.','.'},
            {'5','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        char[][][] boards = {board1, board2, board3, board4};
        String[] names = {
            "Test 1 - Valid Board",
            "Test 2 - Invalid (duplicate in box)",
            "Test 3 - Empty Board",
            "Test 4 - Invalid (duplicate in column)"
        };

        for (int t = 0; t < boards.length; t++) {
            System.out.println("\n--- " + names[t] + " ---");
            printBoard(boards[t]);
            boolean result = isValidSudoku(boards[t]);
            System.out.println("Result: " + (result ? "VALID" : "INVALID"));
        }
    }
}