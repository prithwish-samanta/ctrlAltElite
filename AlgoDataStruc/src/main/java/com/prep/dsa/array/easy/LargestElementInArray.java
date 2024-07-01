package com.prep.dsa.array.easy;

import java.util.Arrays;

/*
 * @Question-Link: https://www.geeksforgeeks.org/program-to-find-largest-element-in-an-array/
 */
public class LargestElementInArray {
    //Brute force approach
    //Time Complexity: O(NLogN)
    //Space complexity: O(1)
    public static int getLargest_brute(int[] arr) {
        int len = arr.length;
        if (len == 0)
            return Integer.MIN_VALUE;
        if (len == 1)
            return arr[0];
        Arrays.sort(arr);
        return arr[len - 1];
    }

    //Optimal approach
    //Time Complexity: O(N)
    //Space complexity: O(1)
    public static int getLargest_optimal(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > max)
                max = ele;
        }
        return max;
    }
}
