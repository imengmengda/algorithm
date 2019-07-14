package com.follower.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-6-16.
 */
public class ShortestPathInBinaryMatrix_1091Test {

    ShortestPathInBinaryMatrix_1091 solution = new ShortestPathInBinaryMatrix_1091();

    @Test
    public void shortestPathBinaryMatrix() throws Exception {
        System.out.println(solution.shortestPathBinaryMatrix(new int[][]{{0,0,0},{1,1,0},{1,1,0}}));
    }

}