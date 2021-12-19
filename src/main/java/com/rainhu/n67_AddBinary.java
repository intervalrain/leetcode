package com.rainhu;

/**
 * 67. Add Binary (Easy)
 * 
 * Given two binary string a and b, return thier sum as a binary string
 */

public class n67_AddBinary{
    public String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;

        int remain = 0;
        int sum = 0;
        
        while(i >= 0 || j >= 0){
            sum = remain;

            if (i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.insert(0, sum % 2);
            remain = sum / 2;
        }
        
        if(remain > 0)
            sb.insert(0, "1");

        return sb.toString();
    }
    public String addBinary2(String a, String b){
        if (a.equals("0")) return b;
        if (b.equals("0")) return a;
        StringBuilder sb = new StringBuilder();
        int i = 0, lenA = a.length(), lenB = b.length();
        boolean plusOne = false, aa = false, bb = false;
        while (true){
            if ((i >= lenA) && (i >= lenB) && (plusOne == false))
                return sb.toString();

            if (i >= lenA){
                aa = false;
            } else {
                aa = a.substring(lenA - 1 - i, lenA - i).equals("1") ? true : false;
            }
            
            if (i >= lenB){
                bb = false;
            } else {
                bb = b.substring(lenB - 1 - i, lenB - i).equals("1") ? true : false;
            }

            if (plusOne) {
                plusOne = aa | bb;
                sb.insert(0, (aa ^ bb ? "0" : "1"));
            } else {
                plusOne = aa & bb;
                sb.insert(0, (aa ^ bb ? "1" : "0"));
            }
            i++;
        }
    }
}