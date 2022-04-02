package com.rainhu;

/**
 * 680. Valid PalindromeII (Easy)
 * 
 * Given a string s,
 * return true if the s can be palindrome after deleting at most one character from it.
 */

public class n680_ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int token = 1;
        return valid(s, 0, s.length()-1, token);
    }
    private boolean valid(String s, int left, int right, int token){
        while (left < right){
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else if (token > 0) {
                return valid(s, left, right-1, token-1) || valid(s, left + 1, right, token -1);
            } else {
                return false;
            }
        }
        return true;
    }
}
