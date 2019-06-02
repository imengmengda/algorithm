package com.follower.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by lin on 19-6-1.
 */
public class ValidPalindrome_0125 {

    public boolean isPalindrome(String s) {
        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex <= rightIndex) {
            while (leftIndex <= rightIndex && !Character.isLetterOrDigit(s.charAt(leftIndex))) {
                leftIndex ++;
            }
            while (leftIndex <= rightIndex && !Character.isLetterOrDigit(s.charAt(rightIndex))) {
                rightIndex --;
            }
            if (leftIndex <= rightIndex && !Character.toString(s.charAt(leftIndex)).
                equalsIgnoreCase(
                    Character.toString(s.charAt(rightIndex)))) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

}
