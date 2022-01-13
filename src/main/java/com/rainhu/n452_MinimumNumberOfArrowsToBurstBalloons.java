package com.rainhu;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 452. Minimum Number of Arrows to Burst Balloons (Medium)
 * 
 * There are some spherical balloons taped onto a flat wall that represents the XY-plane.
 * The balloons are represented as a 2D integer array points where points[i] = [x_start, x_end] 
 * donates a balloon whose horizontal diameter stretches between x_start and x_end.
 * You do not know the exact y-coordinates of the balloons.
 *
 * Arrows can be shot up dirctly vertically (in the positive y-direction) from different points 
 * along the x-axis.
 * A balloon with x_start and x_end is burst by an arrow shot at x if x_start <= x <= x_end.
 * There is no limit to the number of arrows that can be shot.
 * A shot arrow keeps traveling up infinitely,
 * burst any ballons in its path.
 *
 * Given the array points, return the minimum number of arrows that must be shot to burst all ballons.
 *
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/13
 * @apiNote: 
 */

public class n452_MinimumNumberOfArrowsToBurstBalloons{
    public int findMinArrowShots(int[][] points){
        // [1 2 3 4 5 6 7 8 9 10 11 12]
        // [oooooooooooooooooooo      ]
        // [    ooooooooooooo         ]
        // [      ooooooooooooooooo   ]
        // [          ooo             ]
        // [          ooooooo         ]
        // [              oooooooooooo]
        // [                oooooooooo]

        // [1 2 3 4]
        // [ooo    ]
        // [  ooo  ]
        // [    ooo]
        // [      o]
              
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] < o2[0])
                    return -1;
                else if (o1[0] > o2[0])
                    return 1;
                else if (o1[1] < o2[1])
                    return -1;
                return 1;
            }
        }); 
        int curr = points[0][1];
        int cnt = 1;

        for (int i = 1; i < points.length; i++){
            if (points[i][0] <= curr){
                curr = Math.min(points[i][1], curr);
            } else {
                curr = points[i][1];
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        int[][] points = new int[][]{{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
        Arrays.sort(points, (a,b) -> a[1]-b[1]);
        for (int[] x:points)
            System.out.println(Arrays.toString(x));
        n452_MinimumNumberOfArrowsToBurstBalloons clz = new n452_MinimumNumberOfArrowsToBurstBalloons();
        System.out.println(clz.findMinArrowShots(points));
    }
}
