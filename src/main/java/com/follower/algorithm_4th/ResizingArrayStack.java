package com.follower.algorithm_4th;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by lin on 19-5-2.
 */
public class ResizingArrayStack<T> extends Stack<T> {

    private int N = 0;

    private int head = 0;

    private T[] array;

    public ResizingArrayStack() {
        array = (T[])new Object[2];
    }

    public ResizingArrayStack(int capacity) {
        array = (T[])new Object[capacity];
    }

    private void resize(int max) {
        T[] temp = (T[])new Object[max];
        System.arraycopy(array, 0, temp, 0, N);
        array = temp;
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public T push(T a) {
        if (head == array.length) {
            resize(array.length * 2);
        }
        array[head++] = a;
        N ++;
        return a;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T res = array[--head];
        array[head] = null; //gc
        if (N != 0 && N < array.length / 4) {
            resize(array.length / 2);
        }
        N --;
        return res;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator iterator = new Iterator() {

            private int headTemp = head;

            @Override
            public boolean hasNext() {
                return headTemp != 0;
            }

            @Override
            public Object next() {
                return array[--headTemp];
            }
        };
        return iterator;
    }

}
