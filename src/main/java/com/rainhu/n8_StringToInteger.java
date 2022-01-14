package com.rainhu;

/**
 * 8. String to Integer(atoi) (Medium)
 * 
 * implement to myAtoi(string s) function, which converts a string to 32-bit signed integer(similar to C/C++'s atoi function)
 * The algorithm for myAtio(string s) is as follows:
 *   (1) Read in and ignore any leading whitespace.
 *   (2) Check if the next character(if not already at the end of the string) is '-' or '+'. Read this character in if it is either.
 *       This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 *   (3) Read in next the characters until the next-non-digit character or the end of the input is reached.
 *       The rest of the string is ignored.
 *   (4) Convert these digits into an integer (i.e. "123" -> "123, "0032" -> 32). If no digits were read, then the integer is 0.
 *       Change the sign as necessary (from step 2).
 *   (5) If the integer is out of the 32-bit signed integer range(-2^32, 2^31-1), then clamp the integer so that it remains in the range.
 *       Specifically, integers less than -2^31 should be clamped to -2^31. and integers greater than 2^31-1 should be clamped to 2^31-1.
 *   (6) Return the integer as the final result.  
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/1/15, 2021/7/22
 * @apiNote:   
 */

public class n8_StringToInteger {
	public int myAtoi(String s){
		s = s.strip();
		long cnt = 0;
		int pos = 1;
		char[] ch = s.toCharArray();
		int i = 0;
		for (i = 0; i < ch.length; i++){
			if (ch[i] == ' '){
				continue;
			} else if (Character.isLetter(ch[i]) || ch[i] == '.'){
				return 0;
			} else if (ch[i] == '+'){
				i++;
				break;
			} else if (ch[i] == '-'){
				i++;
				pos = -1;
				break;
			} else if (ch[i] >= '0' && ch[i] <= '9'){
				break;
			}
		}
		for (int j = i; j < ch.length; j++){
			if (!Character.isDigit(ch[j]))
				break;

			if (cnt * pos > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			else if (cnt * pos < Integer.MIN_VALUE)
				return Integer.MIN_VALUE; 			
			cnt = 10 * cnt + (ch[j] - '0');
		}
		return (int)cnt * pos;
	}
}
