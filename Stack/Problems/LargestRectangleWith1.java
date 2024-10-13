package Stack.Problems;

import java.util.Stack;

public class LargestRectangleWith1 {
    public static void main(String[] args) {
        // Input binary matrix (2D array of 1s and 0s)
        int[][] matrix = {
            {1, 0, 1, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
        };
        
        // Print the largest rectangular area consisting of only 1s
        System.out.println(histogram(matrix));
    }

    /**
     * Method to find the largest rectangle containing only 1s in the given binary matrix.
     * It processes the matrix row by row, treating each row as a histogram of heights.
     * 
     * @param matrix Input binary matrix
     * @return The largest rectangle area filled with 1s
     */
    public static int histogram(int[][] matrix) {
        int n = matrix.length;  // Number of rows
        int m = matrix[0].length;  // Number of columns

        // Array to store histogram heights. Each index represents the height of the bar at that column.
        int[] hist = new int[m];
        int maxArea = 0;  // Variable to store the maximum rectangle area

        // Traverse each row of the matrix
        for (int i = 0; i < n; i++) {
            // Update the histogram: For each column, if it's 1, increase the height, else reset it to 0
            for (int j = 0; j < m; j++) {
                // If matrix[i][j] == 1, increment height, else reset to 0
                hist[j] = (matrix[i][j] == 1) ? hist[j] + 1 : 0;
            }

            // After updating the histogram for this row, calculate the largest rectangle for this histogram
            maxArea = Math.max(maxArea, area(hist));
        }

        return maxArea;  // Return the largest rectangle found
    }

    /**
     * Helper method to find the largest rectangle in a histogram.
     * It uses a stack to keep track of the indices of histogram bars.
     * 
     * @param hist Array representing the heights of the histogram bars
     * @return The area of the largest rectangle in the histogram
     */
    public static int area(int[] hist) {
        Stack<Integer> stk1 = new Stack<>();  // Stack to store the indices of histogram bars
        int maxArea = 0;  // Variable to store the maximum rectangle area
        int n = hist.length;  // Length of the histogram

        // Traverse each bar in the histogram
        for (int i = 0; i <= n; i++) {
            // If we've reached the end, treat the current height as 0 to process all remaining bars in the stack
            int currentHeight = (i == n) ? 0 : hist[i];

            // While the current bar's height is less than the bar at the stack's top, process the stack
            while (!stk1.isEmpty() && currentHeight < hist[stk1.peek()]) {
                // Pop the top of the stack, which represents the height of the last rectangle
                int top = stk1.pop();
                
                // The height of the rectangle is the height of the bar that was popped
                int height = hist[top];

                // If the stack is empty, the width is the current index `i`, otherwise, it is the distance between
                // the current index and the index of the new stack top (which defines the width of the rectangle)
                int width = (stk1.isEmpty()) ? i : i - stk1.peek() - 1;

                // Update the maxArea with the area of this rectangle (height * width)
                maxArea = Math.max(maxArea, height * width);
            }

            // Push the current index onto the stack
            stk1.push(i);
        }

        return maxArea;  // Return the maximum rectangle area for this histogram
    }
}
