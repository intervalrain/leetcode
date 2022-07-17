package com.rainhu;

public class n371_SumOfTwoIntegers {
    public int getSum(int a, int b){
        int c = 0;
        while (b != 0){
            c = (a & b);
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }
}

// 010 -> a
// 011 -> b
// ---
// 001 xor -> a
// 010 and << 1 -> b
//
// 010000000000001
// 111111111111111
// ---------------
// 001111111111110
// 000000000000010
// ---------------

// 011111111111111




