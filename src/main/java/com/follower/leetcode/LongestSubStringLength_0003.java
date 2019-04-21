package com.follower.leetcode;

import java.util.*;

/**
 * Created by lin on 19-4-21.
 */
public class LongestSubStringLength_0003 {

    public int getLengthByMap(String str) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j =0; i != str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                j = Math.max(j, map.get(str.charAt(i)) + 1);
            }
            map.put(str.charAt(i), i);
            res = Math.max(res, i - j + 1);
        }
        return res;
    }

    public int getLengthBySet(String str) {
        //LinkedHashSet
        //https://www.cnblogs.com/lcchuguo/p/5181383.html
        return 0;
    }

}
