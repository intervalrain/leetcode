package com.rainhu;

import java.util.Stack;

/**
 * 682. Baseball Game (Easy)
 * 
 * You are keeping score for a baseball game with strange rules.
 * The game consists of several rounds, 
 * where the scores of past rounds may affect future rounds' scores.
 * 
 * At the begining of the game, 
 * you start with an empty record.
 * You are given a list of strings ops,
 * where ops[i] is the ith operation you must apply to the record and is one of the following:
 *      1. An integer x - Record a new score of x.
 *      2. "+" - Record a new score that is the sum of the previous two scores. 
 *         It is guaranteed there will always be two previous scores.
 *      3. "D" - Record a new score that is double the previous score.
 *         It is guaranteed there will always be a previous score.
 *      4. "C" - Invalidate the previous score, removing it from the record.
 *         It is guaranteed there will always be a previous score.
 * 
 * Return the sum of all the scores on the record.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/4/10
 * @apiNote: Stack
 */

public class n682_BaseballGame {
    // array
    public int calPoints(String[] ops){
        int[] arr = new int[ops.length];
        int score = 0;
        int idx = 0;
        int val;
        for (String s : ops){
            switch (s) {
                case "C":                    
                    score -= arr[--idx];
                    break;
                case "D":
                    val = arr[idx-1] * 2;
                    score += val;
                    arr[idx++] = val;
                    break;
                case "+":
                    val = arr[idx-1] + arr[idx-2];
                    score += val;
                    arr[idx++] = val;
                    break;
                default:
                    val = Integer.parseInt(s);
                    score += val;
                    arr[idx++] = val;
                    break;
            }
        }
        return score;
    }

    // Stack
    public int calPoints2(String[] ops){
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for (String s : ops){
            switch (s) {
                case "C":
                    st.pop();
                    break;
                case "D":
                    st.push(st.peek()*2);
                    break;
                case "+":
                    int tmp = st.pop();
                    int newadd = tmp + st.peek();
                    st.push(tmp);
                    st.push(newadd);
                    break;
                default:
                    st.push(Integer.parseInt(s));
                    break;
            }
        }

        while(!st.isEmpty()){
            score += st.pop();
        }
        return score;
    }
}
