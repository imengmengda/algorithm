package com.follower.leetcode;

import java.util.Stack;

/**
 * Created by lin on 19-4-14.
 */
public class EvalRPNCalculator_0150 {

    public int evalRPN(String[] tokens) {
        Stack<Integer> numberStack = new Stack<>();
        for (String i: tokens) {
            if (isOperator(i)) {
                Integer firstValue = numberStack.pop();
                Integer secondValue = numberStack.pop();
                if (i.equals("+")) {
                    numberStack.push(firstValue + secondValue);
                } else if (i.equals("-")) {
                    numberStack.push(secondValue - firstValue);
                } else if (i.equals("*")) {
                    numberStack.push(firstValue * secondValue);
                } else {
                    numberStack.push(secondValue / firstValue);
                }
            } else {
                numberStack.push(Integer.parseInt(i));
            }
        }
        return numberStack.pop();
    }

    private boolean isOperator(String i) {
        return i.equals("+") || i.equals("-") || i.equals("/") || i.equals("*");
    }

}
