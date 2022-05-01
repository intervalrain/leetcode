package com.rainhu;

/**
 * 844. Backspace String Compare (Easy)
 * 
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors.
 * '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/5/1
 * @apiNote: (1) Stack (2)
 */

public class n844_BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t){
        char[] sch = s.toCharArray(), tch = t.toCharArray();
        int i = sch.length - 1, j = tch.length -1, back;
        while (true){
            back = 0;
            while (i >= 0 && (back > 0 || sch[i] == '#')){
                back += sch[i] == '#' ? 1 : -1; 
                i--;
            }
            back = 0;
            while (j >= 0 && (back > 0 || tch[j] == '#')){
                back += tch[j] == '#' ? 1 : -1;
                j--;
            }
            if (i >= 0 && j >= 0 && sch[i] == tch[j]){
                i--;
                j--;
            } else {
                break;
            }
        }
        return i == -1 && j == -1;
    }


    public boolean backspaceCompare2(String s, String t){
        return trans(s).equals(trans(t));
    }
    public String trans(String s){
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        int idx = -1;
        for (int i = 0; i < s.length(); i++){
            if (ch[i] == '#'){
                if (idx == -1) continue;
                sb.deleteCharAt(idx);
                idx--;
            } else {
                sb.append(ch[i]);
                idx++;
            }
        }
        return sb.toString();
    }
}
