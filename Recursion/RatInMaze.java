package Recursion;

import java.util.ArrayList;

public class RatInMaze {
    static ArrayList<String> result = new ArrayList<>();

    public static void findPath(int[][] mat, int row, int col, String p, boolean[][] vis) {
        // Base case: reached destination
        if (row == mat.length - 1 && col == mat.length - 1 && mat[row][col] == 1) {
            result.add(p);
            return;
        }

        // Invalid case: out of bounds, already visited, or blocked
        if (row < 0 || col < 0 || row >= mat.length || col >= mat.length || vis[row][col] || mat[row][col] == 0) {
            return;
        }

        // Mark the cell as visited
        vis[row][col] = true;

        // Move Down
        findPath(mat, row + 1, col, p + 'D', vis);
        // Move Left
        findPath(mat, row, col - 1, p + 'L', vis);
        // Move Right
        findPath(mat, row, col + 1, p + 'R', vis);
        // Move Up
        findPath(mat, row - 1, col, p + 'U', vis);

        // Backtrack: unmark the cell as visited
        vis[row][col] = false;
    }

    public static void main(String[] args) {
        int mat[][] = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        boolean[][] vis = new boolean[mat.length][mat.length];
        findPath(mat, 0, 0, "", vis);

        // Print all paths
        for (String path : result) {
            System.out.println(path);
        }
    }
}
