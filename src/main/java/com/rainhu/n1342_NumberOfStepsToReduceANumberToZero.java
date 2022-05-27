package com.rainhu;

/**
 * 1342. NUmber of Steps to Reduce a Number to Zero (Easy)
 * 
 * Given a integer num, return the number of steps to reduce it to zero.
 * 
 * In one step, if the current number is even, you have to divide it by 2,
 * otherwise, you have to subtract 1 from it.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/5/28
 * @apiNote
 */

public class n1342_NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps2(int num){
        int cnt = 0;
        while (num != 0){
            if ((num & 1) == 0)
                num >>>= 1;
            else
                num -= 1;
            cnt++;
        }
        return cnt;
    }
    public int numberOfSteps(int num){
        int len = Integer.toBinaryString(num).length();
        int cnt = Integer.bitCount(num);
        return len+cnt-1;
    }
}

//  14:    1110: 4+3-1 = 6
//   8:    1000: 4+1-1 = 4
// 123: 1111011: 7+6-1 = 12
// 
