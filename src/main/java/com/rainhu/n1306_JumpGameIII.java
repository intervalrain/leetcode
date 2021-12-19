package com.rainhu;

/**
 * 1306. Jump Game III（Medium)
 * 
 * Given and array of non-negative integers arr,
 * you are initially positioned at start index of the array.
 * When you are at index i,
 * you can jump to i + arr[i] or i - arr[i],
 * check if you can reach to any index with value 0.
 * 
 * Notice that you can not jump outside of the array at any time.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/9
 * @apiNote
 */

public class n1306_JumpGameIII {
    public boolean canReach(int[] arr, int start){
        if (start < 0 || start >= arr.length) return false;
        if (arr[start] < 0) return false;
        if (arr[start] == 0) return true;
        arr[start] = -arr[start];
        return canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]);
    }
}
