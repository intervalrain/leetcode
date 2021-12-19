package com.rainhu;

/**
 * 878. Nth Magical Number (Hard)
 * 
 * A positive integer is magical if it is divisible by either a or b.
 * 
 * Given the three integers n, a, and b, return the nth magical number.
 * Since the answer may be very large, return it modulo 10^9 + 7.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/13
 * @apiNote: gcd, lcm, big number calculation
 */

public class n878_NthMagicalNumber{
    public int nthMagicalNumber(int n, int a, int b){
        if (b > a) return nthMagicalNumber(n, b, a); // assure a > b
        int mod = (int) 1e9 + 7;
        if (a % b == 0) return (int)((long)((long)b * (long)n) % mod);

        long lcm = a / gcd(a, b) * b;
        long lo = b;
        long hi = lo * n;
        while (lo < hi){
            long mid = lo + (hi - lo) / 2;
            long cnt = mid / a + mid / b - mid / lcm;
            if (cnt < n) lo = mid + 1;
            else hi = mid;
        }
        return (int)(lo % mod);


    }

    private int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
