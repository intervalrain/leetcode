package com.rainhu;

/**
 * 1359. Count All Valid Pickup and Delivery Options (Hard)
 * 
 * Given n orders, each order consist in pickup and delivery services.
 * 
 * Count all valid pickup/delivery possible sequences such that delivery(i) is always after of pickup(i)
 * 
 * Since the answer may be too large, return it modulo 10^9 + 7;
 * 
 * @author: Rain Hu;
 * @version: 1
 * @since: 2022/3/6
 * @apiNote: It's math
 */

// 2147483648

public class n1359_CountAllValidPickupAndDeliveryOptions {
    public int countOrders(int n){
        long res = 1;
        for (int i = 1; i <= 2 * n; i+=2){
            res *= i*(i+1)/2;
            res %= 1000000007;
        }
        return (int)res;
    }
}
