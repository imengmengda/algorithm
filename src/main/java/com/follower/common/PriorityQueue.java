package com.follower.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;

/**
 * Created by lin on 19-5-11.
 */

/**
 * 最大堆
 * 第i个元素的父节点 i == 0? null: (i - 1)/2
 *          左节点  2 * i + 1
 *          右节点  2 * i + 2
 * @param <E>
 */
public class PriorityQueue<E extends Comparable> implements Queue<E> {

    public PriorityQueue(E[] array) {
        for (int i = (array.length - 2) / 2; i >= 0; i --) {
            priorityQueueBuilderHelper(array, i, array.length);
        }
    }

    public PriorityQueue() {

    }

    /**
     * 从头开始梳理最大堆
     * @param array
     * @param length
     */
    public void priorityQueueBuild(E[] array, int length) {
        for (int i = (length - 2) / 2; i >= 0; i --) {
            priorityQueueBuilderHelper(array, i, length);
        }
    }

    private void priorityQueueBuilderHelper(E[] array, int index, int length) {
        E temp = array[index];
        for (int i = index; i <= (length - 2) / 2; i = 2 * i + 1) {
            int leftChildIndex = 2 * i + 1;
            int rightChildIndex = 2 * i + 2;
            if (rightChildIndex >= length) {
                if (array[index].compareTo(array[leftChildIndex]) < 0) {
                    array[index] = array[leftChildIndex];
                    array[leftChildIndex] = temp;
                    priorityQueueBuilderHelper(array, leftChildIndex, length);
                } else {
                    break;
                }
            } else {
                if ((array[index].compareTo(array[leftChildIndex]) >= 0) &&
                        (array[index].compareTo(array[rightChildIndex]) >= 0)) {
                    break;
                } else if (array[leftChildIndex].compareTo(array[rightChildIndex]) >= 0) {
                    array[index] = array[leftChildIndex];
                    array[leftChildIndex] = temp;
                    priorityQueueBuilderHelper(array, leftChildIndex, length);
                } else {
                    array[index] = array[rightChildIndex];
                    array[rightChildIndex] = temp;
                    priorityQueueBuilderHelper(array, rightChildIndex, length);
                }
            }
        }
    }

    public static<E extends Comparable> void heapSort(E[] array) {
        PriorityQueue<E> priorityQueue = new PriorityQueue<E>();
        for (int i = array.length - 1; i >= 1; i --) {
            priorityQueue.priorityQueueBuild(array, i + 1);
            E max = array[0];
            array[0] = array[i];
            array[i] = max;
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
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
    public boolean addAll(Collection<? extends E> c) {
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
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
