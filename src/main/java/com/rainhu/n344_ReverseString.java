package com.rainhu;

/**
 * 344. Reverse String (Easy)
 * 
 * Write a function that reverses a string.
 * The input string is given as an array of characters s.
 * 
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/2
 * @apiNote: swap or stack
 */

public class n344_ReverseString {
    
    public void reverseString(char[] s){
        char tmp;
        int left = 0, right = s.length - 1;
        while (left < right){
            tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
            if (left >= right) return;
        }
    }

}
