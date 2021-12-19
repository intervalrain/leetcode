package com.rainhu;

/**
 * 9. Palindrome Number (Easy)
 * 
 * Given an integer x, return true if x is palindrome integer.
 * An integer is palindrome when it reads the same backward as forward.
 * For example, 121 is palindrome while 123 is not.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2021/12/9
 * @apiNote
 */

public class n9_PalindromeNumber {
    public boolean isPalindrome(int x){
        if (x < 0) return false;
        if (x % 10 == 0 && x != 0) return false;
        int y = 0;

        while (x > y){
            int remain = x % 10;
            x /= x;
            y = 10 * y + remain;
        }
        
        return (x == y) || (x == y/10);
    }  
}

// if(x<0)
// return false;
// if(x%10==0 && x!=0)
// return false;
// int revertedNum=0;
// while(x>revertedNum){
// revertedNum = x % 10 + revertedNum * 10;
// x/= 10;
// }

// return (revertedNum == x || revertedNum/10 == x);