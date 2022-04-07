package com.rainhu;

import java.util.PriorityQueue;

/**
 * 1046. Last Stone Weight (Easy)
 * 
 * You are given an array of integers stones where stones[i] is the weight of the ith stone.
 * 
 * We are playing a game with the stones.
 * On each turn, we choose the heaviest two stones and smash them together.
 * Suppose the heaviest two stones have weights x and y with x <= y.
 * The result of this smash is
 *     + If x == y, both stones are destroyed, and
 *     + If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 * At the end of the game, there is at most one stone left.
 *
 * Return the smallest possible weight of the left stone.
 * If there are no stones left, return 0;
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/7
 * @apiNote: Priority Queue
 */

public class n1046_LastStoneWeight {
    public int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> pq = new PriorityQueue<>((Integer a, Integer b) -> b - a);
        for (int stone : stones) pq.add(stone);
        while (pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            if (a - b == 0)
                continue;
            else
                pq.add(a-b);
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
