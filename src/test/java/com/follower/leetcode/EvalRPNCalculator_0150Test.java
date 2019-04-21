package com.follower.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-4-14.
 */
public class EvalRPNCalculator_0150Test {

    EvalRPNCalculator_0150 rpnCalculator = new EvalRPNCalculator_0150();

    @Test
    public void evalRPN1() throws Exception {
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        Integer result = rpnCalculator.evalRPN(tokens);
        Assert.assertEquals(result, new Integer(9));
    }

    @Test
    public void evalRPN2() throws Exception {
        String[] tokens = new String[]{"4", "13", "5", "/", "+"};
        Integer result = rpnCalculator.evalRPN(tokens);
        Assert.assertEquals(result, new Integer(6));
    }

}