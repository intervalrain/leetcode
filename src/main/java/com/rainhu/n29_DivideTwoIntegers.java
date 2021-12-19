package com.rainhu;

/**
 * 29. Divide two integers (Medium)
 * Given two integers dividend and divisor,
 * divide two integers without using multiplication, divsion, and mod operator.
 *
 * Return the quotient after dividing dividend by divisor.
 * 
 * The integer division should truncate toward zero, which means losing its fractional part.
 * For example, truncatew(8.345) = 8 and truncate(-2.7335) = -2.
 * 
 * Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range:
 * [-2^32, 2^31-1].
 * For this problem, assume that your function return 2^31-1 when the division result overflows.
 */

public class n29_DivideTwoIntegers {
    // << left shift operator
    // >> right shift operator

    public int divide(int dividend, int divisor){
        if (dividend == 0) return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        boolean sign = ((dividend>=0) == (divisor>=0));

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int result = 0;

        /**
         *  124 = 3*(2^5) + 28 --> result = 32
         *  28  = 3*(2^3) +  4 --> result = 32 + 8 = 40
         *  4   = 3*(2^0) +  1 --> result = 40 + 1 = 41
         *  -------------------
         *  124 = 39 * 3 117 + 7
         */
        while(dividend - divisor >= 0){
            int count = 0;
            while(dividend - (divisor << (1 + count)) >= 0 ){
                count++;
            } 
            result += (1 << count);
            dividend -= divisor << count;
        }
        return sign?result:-result;
    }
}
