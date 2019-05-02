package com.follower.algorithm_4th;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * Created by lin on 19-5-2.
 */
public class ResizingArrayQueue<T> implements Queue<T>, Iterable<T> {

    private int head = 0;

    private int tail = 0;

    private int N = 0;

    private T[] array;

    public ResizingArrayQueue() {
        array = (T[])new Object[2];
    }

    public ResizingArrayQueue(int capacity) {
        array = (T[])new Object[capacity];
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator iterator = new Iterator() {
            int headTemp = head;
            int tailTemp = tail;

            @Override
            public boolean hasNext() {
                return headTemp != tailTemp;
            }

            @Override
            public Object next() {
                Object res = array[headTemp];
                headTemp = (headTemp + 1) % array.length;
                return res;
            }
        };
        return iterator;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    private void resize(int max) {
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i != N; i++) {
            temp[i] = array[(head + i) % array.length];
        }
        //reset head and tail
        head = 0;
        tail = N;
        array = temp;
    }

    @Override
    public boolean add(T t) {
         if (N == array.length) {
             resize(array.length * 2);
         }
         array[tail++] = t;
         if (tail >= array.length) {
             tail -= array.length;
         }
         N++;
         return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            return null;
        }
        T res = array[head];
        array[head] = null; //gc
        head ++;
        if (head >= array.length) {
            head -= array.length;
        }
        N--;

        if (N != 0 && N <= array.length / 4) {
            resize(array.length / 2);
        }
        return res;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }
}
