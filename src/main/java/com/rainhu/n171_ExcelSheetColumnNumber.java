package com.rainhu;

/**
 * 171. Excel Sheet Column Number (Easy)
 * 
 * Given a string columnTitle that represents the column title as appear in an Excel sheet,
 * return its corresponding column number.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/2/22
 * @apiNote: Math
 */

public class n171_ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle){
        int res = 0;
        for (int i = 0; i < columnTitle.length(); i++){
            res = res * 26 + columnTitle.charAt(i) - 64;
        }
        return res;
    }
}
