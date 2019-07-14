package com.follower.leetcode;

/**
 * Created by lin on 19-6-30.
 */
public class DistributeCandy_1103 {

    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int cnt = 1;
        int index = 0;
        while (candies > 0) {
            if (candies > cnt) {
                res[index] += cnt;
                candies -= cnt;
                cnt++;
            } else {
                res[index] += candies;
                candies = 0;
            }
            index = (index + 1) % num_people;
        }
        return res;
    }

    public static void main(String[] args) {
        DistributeCandy_1103 solution = new DistributeCandy_1103();
        solution.distributeCandies(7, 4);
    }
}
