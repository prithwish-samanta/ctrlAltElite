package com.prep.dsa.array.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LargestElementInArrayTest {

    @Test
    void getLargest_brute() {
        int[] arr = {};
        int res = LargestElementInArray.getLargest_brute(arr);
        Assert.assertEquals(Integer.MIN_VALUE, res);

        arr = new int[]{100};
        res = LargestElementInArray.getLargest_brute(arr);
        Assert.assertEquals(100, res);

        arr = new int[]{100, 34, 72, 13, 70, 89, 104, 70};
        res = LargestElementInArray.getLargest_brute(arr);
        Assert.assertEquals(104, res);
    }

    @Test
    void getLargest_optimal() {
        int[] arr = {};
        int res = LargestElementInArray.getLargest_brute(arr);
        Assert.assertEquals(Integer.MIN_VALUE, res);

        arr = new int[]{100};
        res = LargestElementInArray.getLargest_brute(arr);
        Assert.assertEquals(100, res);

        arr = new int[]{100, 34, 72, 13, 70, 89, 104, 70};
        res = LargestElementInArray.getLargest_brute(arr);
        Assert.assertEquals(104, res);
    }
}