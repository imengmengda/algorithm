package com.follower.algorithm_4th;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-2.
 */
public class ResizingArrayStackTest {

    @Test
    public void resizingArrayStackTest1() {
        Stack stack = new ResizingArrayStack();
        IntStream.range(0, 10).forEach(
            i -> stack.push(i)
        );
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    @Test
    public void resizingArrayStackTest2() {
        Stack stack = new ResizingArrayStack();
        IntStream.range(0, 3).forEach(
                i -> stack.push(i)
        );
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        IntStream.range(3, 10).forEach(
                i -> stack.push(i)
        );
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    @Test
    public void resizingArrayStackTest3() {
        Stack stack = new ResizingArrayStack();
        IntStream.range(0, 10).forEach(
                i -> stack.push(i)
        );
        Iterator iterator = stack.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}