package com.rainhu;

/**
 * 605. Can Place Flowers (Easy)
 * 
 * You have a long flowerbed in which some of the plots are planted, and some are not.
 * However, flowers cannot be planted in adjacent plots.
 * 
 * Given an integer array flowerbed containing 0's and 1's,
 * where 0 means empty and 1 means not empty, and an integer n,
 * return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/1/18
 * @apiNote:
 */

public class n605_CanPlaceFlowers {
    /** improved solution */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int left = 0;
        int right = len - 1;
        int cnt = 0;
        
        while (left < len && flowerbed[left] == 0)
            left++;
        if (left == len) return ((len + 1) / 2) >= n;
        while (right >= 0 && flowerbed[right] == 0)
            right--;
        n -= (left / 2 + ((len - right - 1) / 2)); 
        if (n <= 0)
            return true;
        
        for (int i = left; i < right; i++){
            if (flowerbed[i] == 1){
                n -= ((cnt - 1) / 2);
                if (n <= 0) return true;
                cnt = 0;
            } else {
                cnt ++;
            }
        }
        n -= ((cnt - 1) / 2);
        return n <= 0;
    }

    /** first solution */
    public boolean canPlaceFlowers1(int[] flowerbed, int n){
        /**
         * pseudo-code:
         * count non-adjacent zeros
         * 1. left: 2 zeros can plant 1 flower, 4 zeros can plant 2 flowers and so on...
         * 2. right: the same as left.
         * 3. mid: 3 zeros can plant 1 flower, 5 zeros can plant 2 flowers, and so on...
         * 
         * sp. all zero: 1 zero can plant 1 flower, 3 zeros can plant 2 flowers, and so on...
         */
        int len = flowerbed.length;
        int left = 0;
        int right = len - 1;
        int cnt = 0;
        int canPlant = 0;

        while (flowerbed[left] == 0 && left < len)
            left++;
        if (left == len) return ((len + 1) / 2) >= n;
        while (flowerbed[right] == 0 && right >= 0)
            right--;
        for (int i = left; i < right; i++){
            if (flowerbed[i] == 1){
                canPlant += ((cnt - 1) / 2);
                cnt = 0;
            } else {
                cnt++;
            }
        }
        canPlant += ((cnt - 1) / 2);
        canPlant += (left / 2);
        canPlant += ((len - right - 1) / 2);
        return canPlant >= n;
    }

    /** best solution */
    public boolean canPlaceFlowersBest(int[] flowerbed, int n){
        if (n == 0)
            return true;
        int index = 0;
        while (index < flowerbed.length){
            if (flowerbed[index] == 0){
                if (flowerbed[index + 1] < flowerbed.length){
                    if (flowerbed[index + 1] == 0){
                        n--;
                        index += 2;
                    } else {
                        index += 3;
                    }
                } else{
                    n--;
                    break;
                }
            } else {
                index += 2;
            }
            if (n == 0)
                return true;
        }
        return n == 0;
    }
}
