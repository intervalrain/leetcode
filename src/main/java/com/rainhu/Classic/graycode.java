package com.rainhu.Classic;

/**
 * 0: 0000
 * 1: 0001
 * 2: 0011
 * 3: 0010
 * 4: 0110
 * 5: 0111
 * 6: 0101
 * 7: 0100
 * 8: 1100
 * 9: 1101
 */

public class graycode {
    public static String b2g(String binary){
        StringBuilder sb = new StringBuilder();
        sb.append(binary.charAt(0));
        for (int i = 1; i < binary.length(); i++){
            int tmp = (binary.charAt(i) - '0') ^ (binary.charAt(i-1) - '0');
            sb.append(tmp);
        }
        return sb.toString();
    }
    public static String d2b(int decimal){
        return Integer.toBinaryString(decimal);
    }
    public static String d2g(int decimal){
        return b2g(d2b(decimal));
    }

    public static void main(String[] args){
        for (int i = 0; i < 16; i++){
            System.out.printf("%4s %4s %4s", Integer.toString(i), d2b(i), d2g(i));
            System.out.println();
        }
    }

}
    
