package com.rainhu;

import java.util.Arrays;

/**
 * 473. Matchsticks to Square (Medium)
 * 
 * You are given an integer array matchsticks where matchsticks[i] is the length of the ith matchstick.
 * You want to use all the matchsticks to make one square.
 * You should not break any stick,
 * but you can link them up,
 * and each matchsticks must be used exactly one time.
 * 
 * Return true if you can make this square and false otherwise.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/7/12
 * @apiNote: back tracking
 */

public class n473_MatchsticksToSquare {
    int[] sides;
    public boolean makesquare(int[] matchsticks) {
        int n = matchsticks.length;
        if (n < 4) return false;

        Arrays.sort(matchsticks);

        int sum = 0;
        for (int a : matchsticks) sum += a;
        if (sum % 4 != 0) return false;
        int side = sum / 4;
        sides = new int[]{side, side, side, side};
    
        return dfs(matchsticks, n-1);
    }
        
    private boolean dfs(int[] sticks, int index) {
        if (index == -1) return true;

        for (int i = 0; i < 4; i++){
            if (i > 0 && sides[i] == sides[i-1]){
                continue;
            }
            if (sides[i] == sticks[index] || sides[i] - sticks[index] >= sticks[0]){
                sides[i] -= sticks[index];
                if (dfs(sticks, index - 1)) return true;
                sides[i] += sticks[index];
            }
        }

        return false;
    }
}
