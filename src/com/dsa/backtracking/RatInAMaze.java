package com.dsa.backtracking;

public class RatInAMaze {
    public static void main(String[] args) {
        int a[][] = {
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {0, 0, 1, 0},
                {1, 1, 1, 1}
        };
        boolean visited[][] = new boolean[a.length][a.length];
        boolean isPathPossible = ratInMaze(a, visited, 0, 0);
        System.out.println(isPathPossible);
    }

    private static boolean ratInMaze(int[][] a, boolean[][] visited, int i, int j) {
        // Base conditions
        if (i >= a.length || j >= a.length || a[i][j] == 0 || visited[i][j])
            return false;
        // Base condition for successfully reached
        if (i == a.length && j == a.length)
            return true;
        // Mark this cell as visited
        visited[i][j] = true;
        //Check if path is possible from down
        if (ratInMaze(a, visited, i + 1, j))
            return true;
        //Check if path is possible from right
        if (ratInMaze(a, visited, i, j + 1))
            return true;
        // Mark this cell as unvisited and backtrack
        visited[i][j] = false;
        // backtrack
        return false;
    }
}
