package com.rainhu;

/**
 * 38. Count and Say (Medium)
 * 
 * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
 * countAndSay(1) = "1"
 * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), 
 * which is then converted into a different digit string.
 * 
 * To determine how you "say" a digit string,
 * split it into the minimal number of groups so that each group is a contiguous section all of the same character.
 * Then for each group, say the number of characters,
 * then say the character. To convert the saying into a digit string,
 * replace the counts with a number and concatenate every saying.
 * 
 * For example, the saying and conversion for digit string "3322251": "23321511"
 * 
 * Given a positive integer n, return the nth term of the count-and-say sequence.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/17
 * @apiNote
 */
public class n38_CountAndSay {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++){
            s = say(s);
        }
        return s;
    }
    public static String say(String input){
        char[] ch = input.toCharArray();
        char curr = ch[0];
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : ch){
            if (c == curr)
                count++;
            else {
                sb.append(count);
                sb.append(curr);
                curr = c;
                count = 1;
            }
        }
        sb.append(count);
        sb.append(curr);
        return sb.toString();
    }

    
    public static void main(String[] args){
        int n = 4;
        // expected = "1211";
        String actual = new n38_CountAndSay().countAndSay(n);
        System.out.println(actual);
        
    }
}
