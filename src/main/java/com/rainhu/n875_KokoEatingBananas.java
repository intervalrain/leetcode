package com.rainhu;

/**
 * 875. Koko Eating Bananas (Meidum)
 * Koko loves to eat bananas. 
 * There are n piles of bananas, 
 * the ith pile has piles[i] bananas. 
 * The guards have gone and will come back in h hours.
 * 
 * Koko can decide her bananas-per-hour eating speed of k. 
 * Each hour, she chooses some pile of bananas and eats k bananas from that pile. 
 * If the pile has less than k bananas, 
 * she eats all of them instead and will not eat any more bananas during this hour.
 * 
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/1/20
 * @apiNote:
 */

public class n875_KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {     
        long sum=0;
        for (int i = 0; i < piles.length; i++){
            sum += piles[i];
        }
        
        int k = (int)(1 + (sum - 1) / h);
        
        while (true){
            int next = isValid(piles, k, h);
            if (next == 0){
                return k;
            }
            k = next;
        }
    }
     
    public int isValid(int[] piles, int k, int h){
        int sum = 0;
        int increase = Integer.MAX_VALUE; 
        for(int i = 0; i < piles.length; i++){
            int eh = (piles[i] - 1) / k;
            if (eh > 0){
                int nextK = 1 + (piles[i] - 1) / eh;
                if (increase > nextK){
                    increase = nextK;
                }   
            }
            sum += (++eh);
        }
        if(sum<=h){
            return 0;
        }
        return increase;  
    }
}
