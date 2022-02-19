package com.rainhu;

import java.util.PriorityQueue;

/**
 * 1675. Minimize Deviation in Array (Hard)
 * 
 * You are given an array nums of n positive integers.
 * You can perform two types of operations on any element of the array any number of times:
 *     If the element is even, divide it by 2.
 *         For example, if the array is [1,2,3,4], then you can do this operation on the last element, and the array will be [1,2,3,2].
 *     If the element is odd, multiply it by 2.
 *         For example, if the array is [1,2,3,4], then you can do this operation on the first element, and the array will be [2,2,3,4].
 * 
 * The deviation of the array is the maximum difference between any two elements in the array.
 * Return the minimum deviation the array can have after performing some number of operations.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/19
 * @apiNote: PriorityQueue
 */

public class n1675_MinimizeDeviationInArray {
    public int minimumDeviation(int[] nums){
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> (y-x));
        int min = Integer.MAX_VALUE, res = Integer.MAX_VALUE;
        for (int num : nums){
            if (num % 2 == 1) num *= 2;
            pq.add(num);
            min = Math.min(min, num);
        }
        while (true){
            int num = pq.poll();
            res = Math.min(res, num - min);
            if (num % 2 == 1) break;
            min = Math.min(min, num / 2);
            pq.add(num / 2);
        }
        return res;
    }
}
