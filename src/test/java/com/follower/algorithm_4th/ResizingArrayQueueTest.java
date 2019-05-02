package com.follower.algorithm_4th;

import org.junit.Test;

import java.util.Iterator;
import java.util.Queue;

import static org.junit.Assert.*;

/**
 * Created by lin on 19-5-2.
 */
public class ResizingArrayQueueTest {

    @Test
    public void resizingArrayQueueTest1() {
        Queue<Integer> queue = new ResizingArrayQueue<>();
        for (int i = 0; i != 10; i ++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    @Test
    public void resizingArrayQueueTest2() {
        Queue<Integer> queue = new ResizingArrayQueue<>();
        for (int i = 0; i != 3; i ++) {
            queue.add(i);
        }
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        for (int i = 3; i != 10; i ++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    @Test
    public void resizingArrayQueueTest3() {
        Queue<Integer> queue = new ResizingArrayQueue<>();
        for (int i = 0; i != 10; i ++) {
            queue.add(i);
        }
        Iterator iterator = queue.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}