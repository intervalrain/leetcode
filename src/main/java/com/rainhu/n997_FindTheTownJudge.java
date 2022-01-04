package com.rainhu;

/**
 * 997. Find the Town Judge (Easy)
 * 
 * In a town, there are n people labeled from 1 to n.
 * There is a rumor that one of these people is secretly the town judge.
 * 
 * If the town judge exists, then:
 *   1. The town judge trusts nobody.
 *   2. Everybody (except for the town judge) trusts the town judge.
 *   3. There is exactly one person that satisfies properties 1 and 2.
 * 
 * You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.
 * 
 * Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/4
 * @apiNote 
 */

public class n997_FindTheTownJudge{
    public int findJudge(int n, int[][] trust){
        int[] votes = new int[n+1];
        for (int[] t : trust){
            votes[t[0]]--;
            votes[t[1]]++;
        }
        for (int i = 1; i <= n; i++){
            if (votes[i] == n - 1) return i;
        }

        return -1;
    }

}