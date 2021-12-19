package com.rainhu;

/**
 * 1217. Minimum Cost to Move Chips to The Same Position (Easy)
 * 
 * We have n chips, where the position of the ith chip is positon[i].
 * 
 * We need to move all the chips to the same position.
 * In one step, we can change the position of the ith chip from position[i] to:
 *     position[i] + 2 or position[i] - 2 with cost = 0.
 *     position[i] + 1 or position[i] - 1 with cost = 1.
 * 
 * Return the minimum cost needed to move all the chips to the same position.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/7
 * @apiNote: 
 */

public class n1217_MinimumCostToMoveChipsToTheSamePosition {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for (int num : position){
            if ((num & 1) == 1)
                odd++;
            else
                even++;
        }

        return Math.min(even, odd);
    }
}
