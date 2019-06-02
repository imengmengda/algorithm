package com.follower.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-6-2.
 */
public class CommonDivisorOfStringsTest {

    CommonDivisorOfStrings solution = new CommonDivisorOfStrings();

    @Test
    public void gcdOfStrings() throws Exception {
        System.out.println(solution.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX",
                "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX")
        );
    }

    @Test
    public void gcdTest() {
        System.out.println(solution.gcd(12, 15));
    }

}