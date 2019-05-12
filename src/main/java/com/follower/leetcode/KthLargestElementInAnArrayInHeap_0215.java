package com.follower.leetcode;

/**
 * Created by lin on 19-5-12.
 */
public class KthLargestElementInAnArrayInHeap_0215 extends KthLargestElementInAnArray_0215 {

    @Override
    public int findKthLargest(int[] nums, int k) {
        buildHeap(nums);
        for (int i = 1; i != k; i ++) {
            swap2Nums(nums, 0, nums.length - i);
            reBuildMap(nums, 0, nums.length - i);
        }
        return nums[0];
    }

    private void buildHeap(int[] nums) {
        for (int i = (nums.length - 2) / 2; i >= 0; i --) {
            reBuildMap(nums, i, nums.length);
        }
    }

    /**
     * @param nums
     * @param index 从这个下表开始调整堆
     * @param length
     */
    private void reBuildMap(int[] nums, int index, int length) {
        for (int i = index; 2 * i + 1 < length; ) {
            int leftChildIndex = 2 * i + 1;
            int rightChildIndex = 2 * i + 2;
            if (rightChildIndex < length) {
                if (nums[i] > nums[leftChildIndex] && nums[i] > nums[rightChildIndex]) {
                    break;
                } else if (nums[rightChildIndex] <= nums[leftChildIndex]) {
                    swap2Nums(nums, i, leftChildIndex);
                    i = 2 * i + 1;
                } else {
                    swap2Nums(nums, i, rightChildIndex);
                    i = 2 * i + 2;
                }

            } else {
                if (nums[i] > nums[leftChildIndex]) {
                    break;
                } else if (nums[i] <= nums[leftChildIndex]) {
                    swap2Nums(nums, i, leftChildIndex);
                    i = 2 * i + 1;
                }
            }
        }
    }

    private void swap2Nums(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
