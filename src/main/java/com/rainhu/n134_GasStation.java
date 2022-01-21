package com.rainhu;

/**
 * 134. Gad Station (Medium)
 * 
 * There are n gas stations along a circular route,
 * where the amount of gad at the ith station is gas[i].
 * 
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station.
 * You begin the journey with an empty tank at one of the gas stations.
 * 
 * Given two integer arrays gas and cost, 
 * return the starting gas station's index if you can travel around the circuit once in clockwise direction,
 * otherwise return -1.
 * If there exists a solution, it is guaranteed to be unique.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/22
 * @apiNote
 */

public class n134_GasStation{
    public int canCompleteCircuit(int[] gas, int[] cost){
        int start = 0;
        int total = 0;
        int tank = 0;
        
        for (int i = 0; i < gas.length; i++){
            if ((tank = tank + gas[i] - cost[i]) < 0){
                start = i + 1;
                total += tank;
                tank = 0;
            }
        }
        return total + tank < 0 ? -1 : start;
    }
}