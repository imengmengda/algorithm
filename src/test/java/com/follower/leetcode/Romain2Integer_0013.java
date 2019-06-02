package com.follower.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lin on 19-6-2.
 */
public class Romain2Integer_0013 {

    private Map<Character, Integer> romainCharMap = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length();) {
            if (i != s.length() - 1) {
                if (romainCharMap.get(s.charAt(i + 1)) > romainCharMap.get(s.charAt(i))) {
                    res += romainCharMap.get(s.charAt(i + 1)) - romainCharMap.get(s.charAt(i));
                    i += 2;
                    continue;
                }
            }
            res += romainCharMap.get(s.charAt(i++));
        }
        return res;
    }

}
