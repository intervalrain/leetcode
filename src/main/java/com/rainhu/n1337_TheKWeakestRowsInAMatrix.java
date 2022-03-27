package com.rainhu;

import java.util.PriorityQueue;

/**
 * 1337. The K Weakest Rows in a Matrix (Easy)
 * 
 * You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (represent civilians).
 * The soldiers are positioned in front of the civilians.
 * That is, all the 1's will appear to the left of all the 0's in each row.
 * 
 * A row i is weaker than a row j if one of the following is true:
 *      + The number of soldiers in row i is less than the number of soldiers in row.
 *      + Both rows have the same number of soldiers and i < j.
 * 
 * Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/3/27
 * @apiNote: binary search, priority queue
 */

public class n1337_TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k){
        int[] res = new int[k];
        // PriorityQueue<Integer[]> pq = new PriorityQueue<>(new Comparator<Integer[]>() {
        //     @Override
        //     public int compare(Integer[] o1, Integer[] o2) {
        //         // compare nums of soldiers
        //         if (o1[1] == o2[1]){
        //             return o1[0] - o2[0];
        //         }
        //         return o1[1] - o2[1];
        //     }
        // });

        // replace with lambda function
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        for (int i = 0; i < mat.length; i++){
            int cnt = cntSoldier(mat[i]);
            pq.add(new int[]{i, cnt});
        }
        for (int i = 0; i < k; i++){
            res[i] = pq.poll()[0];
        }
        return res;
    }

    // 1st version for count soldiers
    // private int cntSoldier(int[] row){
    //     int cnt = 0;
    //     for (int i = 0; i < row.length; i++){
    //         if (row[i] == 0) break;
    //         cnt++;
    //     }
    //     return cnt;
    // }

    // 2nd version for optimized count soldiers by binary search
    private static int cntSoldier(int[] row){
        int left = 0;
        int right = row.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (row[mid] == 1){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return row[left] == 1 ? left + 1 : left;
    }
}
