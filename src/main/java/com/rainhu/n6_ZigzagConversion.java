package com.rainhu;

/**
 * 6. Zigzag Conversion (Medium)
 * 
 * The string "PAYPALISHIRING" is written in a zigzag pattern in a given number of rows.
 * You have to convert the zigzag pattern in to lines row by row.
 */

public class n6_ZigzagConversion {
	public String convert(String s, int numRows) {
        if(numRows==1 || numRows>s.length())
            return s;
		char[] chars = s.toCharArray();
		String str[] = new String[numRows];
		for(int i=0; i<numRows; i++) 
			str[i] = "";
		int j=0;
		int increment=1;
		String ans="";
		for(int i=0; i<chars.length; i++) {
			if(i%(2*(numRows-1))==0) {
				increment=1;
			} else if(i%(numRows-1)==0) {
				increment=-1;
			}
			str[j] = str[j] + Character.toString(chars[i]);
			j+=increment;
		}
		for(int i=0; i<numRows; i++) {
			ans = ans + str[i];
		}
		return ans;
	}
}
