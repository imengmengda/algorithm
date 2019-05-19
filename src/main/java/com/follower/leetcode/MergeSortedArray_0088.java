package com.follower.leetcode;

/**
 * Created by lin on 19-5-18.
 */
public class MergeSortedArray_0088 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        while (index1 >= 0 || index2 >= 0) {
            while (index1 >= 0 && (index2 < 0 || nums1[index1] > nums2[index2])) {
                nums1[index1 + index2 + 1] = nums1[index1];
                index1--;
            }
            while (index2 >= 0 && (index1 < 0 || nums1[index1] <= nums2[index2])) {
                nums1[index1 + index2 + 1] = nums2[index2];
                index2--;
            }
        }
    }
}
