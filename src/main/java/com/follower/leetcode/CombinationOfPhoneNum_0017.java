package com.follower.leetcode;

import java.util.*;

/**
 * Created by lin on 19-6-3.
 */
public class CombinationOfPhoneNum_0017 {

    public List<String> letterCombinations(String digits) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        List<String> res = new ArrayList<>();
        for (Character c: digits.toCharArray()) {
            int key = Character.getNumericValue(c);
            String value = map.get(key);
            List<String> newRes = new ArrayList<>();
            for (Character letter: value.toCharArray()) {
                if (res.isEmpty()) {
                    newRes.add(letter.toString());
                }
                for (String s: res) {
                    newRes.add(s+letter);
                }
            }
            res.clear();
            res = newRes;
        }

        return res;

    }

}
