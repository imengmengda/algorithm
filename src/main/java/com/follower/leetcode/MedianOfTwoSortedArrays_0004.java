package com.follower.leetcode;

/**
 * Created by lin on 19-5-15.
 */
public class MedianOfTwoSortedArrays_0004 {

    /**
     * @param a
     * @param begin1
     * @param b
     * @param begin2
     * @param k 表示求第k小的数字
     * @return
     */
    private int findKthSmallest(int[] a, int begin1, int[] b,  int begin2, int k) {
        if (begin1 == a.length) {
            return b[begin2 + k - 1];
        }
        if (begin2 == b.length) {
            return a[begin1 + k - 1];
        }
        if (k == 1) {
            return Math.min(a[begin1], b[begin2]);
        }
        int aEnd = Math.min(a.length - 1, begin1 + k/2 - 1);
        int bEnd = Math.min(b.length - 1, begin2 + k/2 - 1);
        if (a[aEnd] > b[bEnd]) {
            return findKthSmallest(a, begin1, b, bEnd + 1, k - (bEnd - begin2) - 1);
        } else {
            return findKthSmallest(a, aEnd + 1, b, begin2, k - (aEnd - begin1) - 1);
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, sumLen = len1 + len2;
        if (sumLen % 2 != 0) {
            return findKthSmallest(nums1, 0, nums2,  0, sumLen / 2 + 1);
        } else {
            return (findKthSmallest(nums1, 0, nums2, 0, sumLen / 2)
                    + findKthSmallest(nums1, 0, nums2, 0, sumLen / 2 + 1)) / 2.0;
        }

    }

}
