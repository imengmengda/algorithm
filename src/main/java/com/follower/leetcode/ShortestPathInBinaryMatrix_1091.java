package com.follower.leetcode;

import java.util.*;

/**
 * Created by lin on 19-6-16.
 */
public class ShortestPathInBinaryMatrix_1091 {

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1 || grid[grid.length - 1][grid.length - 1] == 1) {
            return -1;
        }
        int[][] hasRun = new int[grid.length][grid.length];
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = new int[][]{
                {0, 1}, {1, 0}, {0, -1}, {-1, 0},
                {1, -1}, {-1, 1}, {1, 1}, {-1, -1}
        };
        int res = 0;
        queue.add(new int[]{0, 0});
        hasRun[0][0] = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i != size; i++) {
                int[] lastPoint = queue.remove();
                if (lastPoint[0] == grid.length - 1 && lastPoint[1] == grid.length - 1) {
                    return res + 1;
                }
                for (int[] direction : directions) {
                    int nextX = lastPoint[0] + direction[0];
                    int nextY = lastPoint[1] + direction[1];
                    if (isValid(grid, hasRun, nextX, nextY)) {
                        queue.add(new int[]{nextX, nextY});
                        hasRun[nextX][nextY] = 1;
                    }
                }
            }
            res++;
        }
        return -1;
    }

    public boolean isValid(int[][] grid, int[][] hasRun, int x, int y) {
        return (x >= 0) && (x < grid.length) &&
                (y >= 0) && (y < grid.length) &&
                grid[x][y] == 0 && hasRun[x][y] == 0;
    }
}
