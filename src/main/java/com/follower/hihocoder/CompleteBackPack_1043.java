package com.follower.hihocoder;

import java.util.Scanner;

/**
 * Created by lin on 19-5-3.
 */
public class CompleteBackPack_1043 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String[] firstLine = scanner.next().split(" ");
        int lengthOfA = scanner.nextInt();
        int m = scanner.nextInt();
        int[] cost = new int[lengthOfA];
        int[] value = new int[lengthOfA];
        int i = 0;
        while (scanner.hasNextInt()) {
            cost[i] = scanner.nextInt();
            value[i] = scanner.nextInt();
            i ++;
        }
        System.out.println(maxValue(m, cost, value));
    }

    public static int maxValue(int m, int[] cost, int[] value) {
        int[][] dp = new int[cost.length + 1][m + 1];
        for (int i = 1; i <= cost.length; i ++) {
            if (cost[i - 1] > m) {
                for (int j = 0; j <= m; j ++) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
            for (int j = cost[i - 1]; j <= m; j ++) {
                dp[i][j] = Math.max(
                    dp[i - 1][j],
                    dp[i][j - cost[i - 1]] + value[i - 1]
                );
            }
        }
        return dp[cost.length][m];
    }

}
