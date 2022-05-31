package com.rainhu;

/**
 * 1461. Check If a String Contains All Binary Codes of Size K (Medium)
 * 
 * Given a binary string s and an integer k,
 * return true if every binary of length k is substring of s.
 * Otherwise, return false.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/05/31
 * @apiNote: bit manipulation
 */

public class n1461_CheckIfAStringContainsAllBinaryCodesOfSizeK {
    
    public boolean hasAllCodes(String s, int k){
        int n = (1 << k);
        int hi = (n >> 1);
        boolean[] dp = new boolean[n];
        if (s.length() < (k + n - 1)) return false;
        int curr = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < k; i++){
            curr <<= 1;
            curr += (ch[i] - '0');   
        }
        dp[curr] = true;
        n--;
        for (int i = 0; i + k < s.length(); i++){
            curr = ((curr - (ch[i] - '0') * hi) << 1) + (ch[i+k] - '0');
            if (dp[curr]) continue;
            dp[curr] = true;
            n--;
            if (n == 0) return true;
        }
        return false;
    }    
}
