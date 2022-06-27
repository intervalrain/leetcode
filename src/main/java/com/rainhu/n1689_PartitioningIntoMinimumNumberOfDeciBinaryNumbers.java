package com.rainhu;

/**
 * 1689. Paritioning Into Minimum Number Of Deci-Binary Numbers (Medium)
 * 
 * A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros.
 * For example, 101 and 1100 are deci-binary,
 * while 112 and 3001 are not.
 * 
 * Given a string n that represents a positive decimal integer,
 * return the minimum number of positive deci-binary numbers needed so that they sum up to n.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/6/28
 * @apiNote
 */

public class n1689_PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n){
        int res = 0;
        for (int i = 9; i >= 1; i--){
            String ch = String.valueOf(i);
            if (n.contains(ch)){
                res = i;
                break;
            }
        }
        return res;
    }
    public int minPartitions2(String n){
        int res = 0;
        for (int i = 0; i < n.length(); i++){
            res = Math.max(res, n.charAt(i) - '0');
            if (res == 9) break;;
        }
        return res;
    }
}
