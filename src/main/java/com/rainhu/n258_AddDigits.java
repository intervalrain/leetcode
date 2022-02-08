package com.rainhu;

/**
 * 258. Add Digits (Easy)
 *
 * Given an integer num,
 * repeatedly add all its digits until the result ths only one digit,
 * and return it.
 *
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/8
 * @apiNote:
 */

public class n258_AddDigits{
    public int addDigits(int num){
        int sum = 0;
        while (num > 0){
            sum += (num % 10);
            num /= 10;
        }
        return sum < 10 ? sum : addDigits(sum);
    }

    /** 
     * best solution: by math
     * a*10^3 + b*10^2 + c*10^1 + d -> a + b + c + d
     * a(999+1)+b(99+1)+c(9+1)+d % 9 = a + b + c + d
     */
    public int addDigits2(int num){
        return (num % 9 == 0 && num != 0) ? 9 : (num % 9);
    }
}
