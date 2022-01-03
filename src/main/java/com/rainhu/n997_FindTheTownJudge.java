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
        if (n < 1 || trust.length < n - 1) return -1;

        boolean[] nodes = new boolean[n];
        int count = 0;
        for (int i = 0; i < trust.length; i++){
            if (!nodes[trust[i][0]-1]){
                nodes[trust[i][0]-1] = true;
                count++;
            }
        }

        if (count != n-1)
            return -1;

        int judge = -1;
        for (int i = 0; i < n; i++){
            if (!nodes[i]){
                judge = i+1;
                break;
            }
        }

        for (int i = 0; i < trust.length; i++){
            if (trust[i][1] == judge)
                nodes[trust[i][0]-1] = false;
        }

        for (int i = 0; i < nodes.length; i++){
            if (nodes[i] && i != judge -1 )
                return -1;
        }

        return judge;


    }
}