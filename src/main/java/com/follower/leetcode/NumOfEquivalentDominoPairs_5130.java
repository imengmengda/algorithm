package com.follower.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lin on 19-7-21.
 */
public class NumOfEquivalentDominoPairs_5130 {

    public int numEquivDominoPairs(int[][] dominoes) {
        int res = 0;
        Map<Pair, Integer> map = new HashMap();
        for (int i = 0; i < dominoes.length; i ++) {
            Pair p = new Pair();
            if (dominoes[i][0] < dominoes[i][1]) {
                p.first = dominoes[i][0] ;
                p.second = dominoes[i][1] ;
            } else {
                p.first = dominoes[i][1] ;
                p.second = dominoes[i][0] ;
            }
            if (map.containsKey(p)) {
                map.put(p, map.get(p) + 1);
            } else {
                map.put(p, 1);
            }
        }
        for (Pair p: map.keySet()) {
            int val = map.get(p);
            if (val > 1) {
                res += (val * (val - 1) / 2);
            }
        }
        return res;

    }

    static class Pair {
        int first;
        int second;

        public boolean equals(Object e) {
            Pair p = (Pair) e;
            return first == p.first && second == p.second;
        }

        public int hashCode() {
            return first * 10 - second;
        }
    }
}
