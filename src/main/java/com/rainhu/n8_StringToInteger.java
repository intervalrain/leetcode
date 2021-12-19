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
 */

public class n8_StringToInteger {
	public int myAtoi(String s) {
		
		int cnt=0;
		int num=0;
		boolean flag = false;
		char[] c = s.strip().toCharArray();

		for(int i=0; i<c.length; ++i){
			if(!flag){
				if((c[i]=='+'||c[i]=='-')&&cnt==0){
					flag = true;
					cnt++;
					continue;
				}
			}
			if(trans(c[i])==-1){
				break;
			}
			cnt++;
		}
		if(cnt==0 || (cnt==1 && flag==true))
			return 0;
		s = s.strip().substring(0, cnt);

		try {
			num = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			if(c[0]=='-')
				return Integer.MIN_VALUE;
			return Integer.MAX_VALUE;
		}

		return num;
	}
	public int trans(char key) {
		switch (key) {
			case '0': return 0;
			case '1': return 1;
			case '2': return 2;
			case '3': return 3;
			case '4': return 4;
			case '5': return 5;
			case '6': return 6;
			case '7': return 7;
			case '8': return 8;
			case '9': return 9;
			default:
				return -1;
		}
	}
}
