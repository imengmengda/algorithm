package com.follower.leetcode;

import java.util.Random;

/**
 * Created by lin on 19-5-12.
 */
public class KthLargestElementInAnArray_0215 {

    public int findKthLargest(int[] nums, int k) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int pivot;
        while ((pivot = partition(nums, startIndex, endIndex)) != nums.length - k) {
            if (pivot > nums.length - k) {
                endIndex = pivot - 1;
            } else {
                startIndex = pivot + 1;
            }
        }
        return nums[pivot];
    }

    public int partition(int[] nums, int startIndex, int endIndex) {
        int pivot = new Random().nextInt(endIndex - startIndex + 1) + startIndex;
        int key = nums[pivot];
        swap2Nums(nums, pivot, startIndex);
        while (startIndex < endIndex) {
            while (startIndex < endIndex && nums[endIndex] > key) {
                endIndex --;
            }
            if (startIndex < endIndex) {
                swap2Nums(nums, startIndex, endIndex);
                startIndex ++;
            }
            while (startIndex < endIndex && nums[startIndex] <= key) {
                startIndex ++;
            }
            if (startIndex < endIndex) {
                swap2Nums(nums, startIndex, endIndex);
                endIndex --;
            }
        }
        return startIndex;
    }

    private void swap2Nums(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
