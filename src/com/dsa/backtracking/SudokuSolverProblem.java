package com.dsa.backtracking;

public class SudokuSolverProblem {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {1, 0, 0, 4},
                {3, 0, 0, 2},
                {0, 1, 4, 0},
                {0, 3, 0, 1},
        };
        int N = board.length;
        if (sudokuSolver(board, N)) {
            print(board, N);
        } else
            System.out.println("No solution");
    }

    private static boolean sudokuSolver(int[][] board, int length) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        // it will find index which will have zero value and store row and column value
        // and break the two for loop
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty)
                break;
        }

        // If no element is empty return true at the last
        if (isEmpty)
            return true;

        // will try to add no
        for (int num = 1; num <= length; num++) {
            // will check for safe index
            if (isSafe(board, row, col, num)) {
                // if its safe then add value in it
                board[row][col] = num;
                // then call the function for other empty space
                if (sudokuSolver(board, length)) {
                    return true;
                } else {
                    // if it returns false the backtrack
                    // replace it
                    board[row][col] = 0;
                }
            }
        }
        // if backtrack return false
        return false;
    }

    // Check for safe place
    public static boolean isSafe(int[][] board, int row, int column, int num) {
        // Row check
        for (int d = 0; d < board.length; d++) {
            if (board[row][d] == num)
                return false;
        }
        // Column check
        for (int r = 0; r < board.length; r++) {
            if (board[r][column] == num)
                return false;
        }

        // 2 X 2 - box check
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = column - column % sqrt;
        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }
        return true;
    }

    private static void print(int[][] board, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Time Complexity: O(n ^ m)
