package com.rainhu;

import java.util.PriorityQueue;

/**
 * 1642. Furthest Building You Can Reach (Medium)
 * 
 * You are given an integer array heights representing the heights of buildings,
 * some bricks, and some ladders.
 * 
 * You start your journey from building 0 and move to the next building by possibly using bricks or ladders.
 * 
 * While moving from building to building i+1 (0-indexed),
 *      + If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks.
 *      + If the current building's height is less than the next building's height, you can either use one ladder or (h[i+1] - h[i]) bricks.
 * 
 * Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/23
 * @apiNote: PriorityQueue
 */

public class n1642_FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders){
        PriorityQueue<Integer> pq = new PriorityQueue<>((Integer o1, Integer o2) -> { return o2 - o1;});
        int i = 0;
        for (i = 1; i < heights.length; i++){
            int diff = heights[i] - heights[i-1];
            if (diff <= 0) continue;
            if (diff <= bricks){
                bricks -= diff;
                pq.offer(diff);
            } else if (ladders > 0){
                if (!pq.isEmpty() && pq.peek() > diff){
                    bricks += pq.poll();
                    bricks -= diff;
                    pq.offer(diff);
                }
                ladders--;
            } else {
                break;
            }
        }
        return i - 1;
    }
}