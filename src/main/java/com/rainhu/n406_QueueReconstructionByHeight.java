package com.rainhu;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * 406. Queue Reconstruction by Height (Medium)
 * 
 * You are given an array of people, which are the attributes of some people in a queue (not necessarily in order).
 * Each people[i] = [hi, ki] represents the ith prson of height hi with exactly ki other people in front who have a height greater than or equal to hi.
 * 
 * Reconstruction and return the queue that is represented by the input array people.
 * The returned queue should be formatted as an array queue,
 * where queue[j] = [hj, kj] is the attributes of the jth person in the queue (queue[0] is the person at the front of the queue).
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/30
 * @apiNote
 */

public class n406_QueueReconstructionByHeight {
    public int[][] recontructQueue(int[][] people){
        Arrays.sort(people, (int[] a, int[] b) -> {return a[0] == b[0] ? a[1] - b[1] : b[0] - a[0];});
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < people.length; i++){
            int[] e = people[i];
            list.add(e[1], e);
        }
        int[][] res = new int[people.length][2];
        for (int i = 0; i < people.length; i++){
            int[] e = list.get(i);
            res[i][0] = e[0];
            res[i][1] = e[1];
        }
        return list.toArray(new int[people.length][]);
    }
}
