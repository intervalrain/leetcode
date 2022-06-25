package com.rainhu;

import java.util.PriorityQueue;

/**
 * 1354. Construct Target Array With Multiple Sums (Hard)
 * 
 * You are given an array target of n integers.
 * From a starting array arr consisting of n 1's,
 * you may perform the following precedure:
 *      + let x be the sum of all elements currently in your array.
 *      + choose index i, such that 0 <= i < n and set the value of arr at index i to x.
 *      + You may repeat this procedure as many times as needed.
 * 
 * Return true if it is possible to construct the target array from arr,
 * otherwise, return false.
 * 
 * @autho: Rain Hu
 * @version; 1
 * @since: 2022/6/24
 * @apiNote: priority queue
 */

public class n1354_ConstructTargetArrayWithMultipleSums {
    public boolean isPossible2(int[] target){
        PriorityQueue<Long> pq = new PriorityQueue<Long>((a, b)->{return (int) (b - a);});
        long sum = 0;
        for (long num : target){
            sum += num;
            pq.offer(num);
        }
        while (true){
            long top = pq.poll();
            long other = sum - top;
            if (top < 1)
                return false;
            else if (top == 1 || other == 1)
                return true;
            else {
                long e = top % other;
                if (e == 0 || other > top) return false;
                sum = e + other;
                pq.offer(e);
            }
        }
    }
    public boolean isPossible(int[] target){
        int s = 0;
        for (int val : target)
            s += val;    
        while (s > 1){
            int i = getmax(target);
            int max = target[i];
            if (max == 1) return true;
            else if (max <= s/2) return false;
            s -= max;
            if (s == 1) return true;
            else if (s < 1) return false;

            int e = max % s;
            if (e == 0) return false;
            target[i] = e;
            s += e;
        }
        return s == target.length;
    }

    private int getmax(int[] target){
        int max = 0;
        for (int i = 1; i < target.length; i++)
            if (target[i] > target[max]) max = i;
        return max;
    }
}
