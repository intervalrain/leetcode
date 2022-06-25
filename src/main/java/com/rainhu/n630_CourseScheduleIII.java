package com.rainhu;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * There are n different online courses numbered from 1 to n.
 * You are given an array courses where courses[i] = [durationi, lastDayi] indicate that ith course should be taken continuously for durationi days and
 * must be finished before or on lastDayi.
 * 
 * You will start on the 1st day and you cannot take two or more courses simultaneously.
 * 
 * Return teh maximum number of courses that you can take.
 * 
 * @authoer: Rain Hu
 * @version: 1
 * @since: 2022/6/23
 * @apiNote: 
 */

public class n630_CourseScheduleIII {
    public int scheduleCourse(int[][] courses){
        Arrays.sort(courses, (a,b)->{ return a[1]-b[1];});
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int time = 0;
        for (int[] c : courses){
            time += c[0];
            pq.add(c[0]);
            if (time > c[1]){
                time -= pq.poll();
            }
        }
        return pq.size();
    }
}
