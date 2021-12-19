package com.rainhu;

/**
 * 125. Valid Palindrome (Easy)
 * 
 * A phrase is a palindrome if,
 * after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/9
 * @apiNote
 */

public class n125_ValidPalindrome {
    public boolean isPalindrome(String s){
        s = trimString(s);
        int left = 0;
        int right = s.length()-1;
        while (right > left){
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    private String trimString(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                sb.append(Character.toLowerCase(ch));
            else if (ch >= 'a' && ch <= 'z')
                sb.append(ch);
            else if (ch >= '0' && ch <= '9')
                sb.append(ch);
        }
        return sb.toString();
    }

}
