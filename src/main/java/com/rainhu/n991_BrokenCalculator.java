package com.rainhu;

/**
 * 991. Broken Calculator (Medium)
 * 
 * There is a broken calculator that has the integer startValue on its display initially.
 * In one operation, you can:
 *     + multiply the number on display by 2, or
 *     + substract 1 from the number on display
 * Given two integers startValue and target,
 * return the minimum number of operations needed to display target on the calculator. 
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/24
 * @apiNote: bit manipulation
 */
public class n991_BrokenCalculator {
    public int brokenCalc(int startValue, int target){
        int cnt = 0;
        while (target > startValue){
            if ((target & 1) == 1){
                target += 1;
            } else {
                target >>>= 1;
            }
            cnt++;
            if (startValue == target) return cnt;
        }
        return cnt + startValue - target;
    }

    // one line solution
    public int brokenCalc2(int startValue, int target){
        return startValue >= target ? startValue - target : 1 + target % 2 + brokenCalc(startValue, (target + 1) / 2);
    }
}
