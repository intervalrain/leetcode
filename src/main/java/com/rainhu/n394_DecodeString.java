package com.rainhu;

/**
 * 394. Decode String (Medium)
 * 
 * Given a encoded string, return its decoded tring.
 * 
 * The encoding rule is: k[encoded_string],
 * where the encoded_string inside the square brackets is being replaced exactly k times.
 * Note that k is guaranteed to be a positive integer.
 * 
 * You may assume that the input string is always valid;
 * No extra white spaces, square brackets are well-formed, etc.
 * 
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k.
 * For example, there won't be input like 3a oe 2[4].
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/19
 * @apiNote: Stack
 */

public class n394_DecodeString {
    int i = 0;
    public String decodeString(String s){
        StringBuilder sb = new StringBuilder();
        while (i < s.length() && s.charAt(i) != ']'){
            if (Character.isDigit(s.charAt(i))){
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))){
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i++;
                String rep = decodeString(s);
                while (num > 0){
                    sb.append(rep);
                    num--;
                }
                i++;
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        n394_DecodeString clz = new n394_DecodeString();
        String s = "3[a2[c]]";
        System.out.println(clz.decodeString(s));

    }
}
