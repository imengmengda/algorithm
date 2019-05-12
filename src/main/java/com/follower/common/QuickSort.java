package com.follower.common;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by lin on 19-5-12.
 */
public class QuickSort {

    public void quickSort(int[] nums) {
        partitionRecurseHelper(nums, 0, nums.length - 1);
    }

    public void partitionRecurseHelper(int[] nums, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int pivotIndex = partition(nums, startIndex, endIndex);
        partitionRecurseHelper(nums, startIndex, pivotIndex - 1);
        partitionRecurseHelper(nums, pivotIndex + 1, endIndex);
    }

    public int partition(int[] nums, int startIndex, int endIndex) {
        int lowerIndex = startIndex;
        int highIndex = endIndex;
        int pivotIndex = new Random().nextInt(endIndex - startIndex) + startIndex;
        int pivotValue = nums[pivotIndex];
        swap2Nums(nums, startIndex, pivotIndex);
        while (lowerIndex < highIndex) {
            while (nums[highIndex] > pivotValue && highIndex > lowerIndex) {
                highIndex --;
            }
            if (highIndex > lowerIndex) {
                swap2Nums(nums, highIndex, lowerIndex);
                startIndex ++;
            }
            while (nums[lowerIndex] <= pivotValue && highIndex > lowerIndex) {
                lowerIndex ++;
            }
            if (highIndex > lowerIndex) {
                swap2Nums(nums, highIndex, lowerIndex);
                highIndex --;
            }
        }
        return lowerIndex;
    }

    public void swap2Nums(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
