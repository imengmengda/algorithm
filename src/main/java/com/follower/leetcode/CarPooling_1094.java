package com.follower.leetcode;

import java.util.*;

/**
 * Created by lin on 19-6-23.
 */
public class CarPooling_1094 {

    public boolean carPooling(int[][] trips, int capacity) {

        Queue<Item> enterQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o.start));
        Queue<Item> exitQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o.end));
        for (int[] i: trips) {
            enterQueue.add(new Item(i[0], i[1], i[2]));
            exitQueue.add(new Item(i[0], i[1], i[2]));
        }

        while (!enterQueue.isEmpty()) {
            Item enter = enterQueue.peek();
            while (!exitQueue.isEmpty() && exitQueue.peek().end <= enter.start) {
                Item exit = exitQueue.remove();
                capacity += exit.num;
            }
            if (capacity < enter.num) {
                return false;
            }
            enterQueue.remove();
            capacity -= enter.num;
        }

        return true;

    }

    static class Item {

        int num;

        int start;

        int end;

        Item(int num, int start, int end) {
            this.num = num;
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        CarPooling_1094 solution = new CarPooling_1094();
        System.out.println(solution.carPooling(new int[][]{{2,1,5},{3,3,7}}, 4));
    }

}
