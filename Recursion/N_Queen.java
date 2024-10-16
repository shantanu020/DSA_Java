package Recursion;
import java.util.*;

public class N_Queen {

    // Converts the board to a list of strings representing each row
    public static List<String> makeString(char[][] board) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(board[i][j]);
            }
            ans.add(sb.toString());
        }
        return ans;
    }

    // Checks if placing a queen at (row, col) is valid
    public static boolean isValid(char[][] board, int row, int col) {
        // Check vertical column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Recursive function to place queens row by row
    public static void placeQueen(List<List<String>> result, char[][] board, int row, int n) {
        if (row == n) {
            result.add(makeString(board)); // If all queens are placed, add the board to the result
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {  // Check if we can place a queen at (row, col)
                board[row][col] = 'Q';        // Place the queen
                placeQueen(result, board, row + 1, n); // Recur to place the next queen
                board[row][col] = '.';        // Backtrack and remove the queen
            }
        }
    }

    // Initializes the board and calls the placeQueen function
    public static List<List<String>> solveNQueen(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with empty spaces ('.')
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        placeQueen(result, board, 0, n); // Start placing queens from row 0
        return result;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        List<List<String>> result = solveNQueen(4);

        // Print all solutions
        for (List<String> list : result) {
            for (String str : list) {
                System.out.println(str);
            }
            System.out.println(); // Print a blank line between solutions
        }
    }
}
