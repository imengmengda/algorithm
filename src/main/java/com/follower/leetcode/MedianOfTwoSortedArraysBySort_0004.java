package com.follower.leetcode;

/**
 * Created by lin on 19-5-18.
 */
public class MedianOfTwoSortedArraysBySort_0004 extends MedianOfTwoSortedArrays_0004 {

    @Override
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sortedNums = new int[nums1.length + nums2.length];
        int index1 = 0;
        int index2 = 0;
        while (index1 < nums1.length || index2 < nums2.length) {
            while ((index1 < nums1.length) && (index2 == nums2.length || nums1[index1] < nums2[index2])) {
                sortedNums[index1 + index2] = nums1[index1];
                index1++;
            }
            while ((index2 < nums2.length) && (index1 == nums1.length || nums1[index1] >= nums2[index2])) {
                sortedNums[index1 + index2] = nums2[index2];
                index2++;
            }
        }
        if (sortedNums.length % 2 == 0) {
            return (sortedNums[sortedNums.length / 2] + sortedNums[sortedNums.length / 2 - 1]) / 2.0;
        } else {
            return sortedNums[sortedNums.length / 2];
        }
    }
}
