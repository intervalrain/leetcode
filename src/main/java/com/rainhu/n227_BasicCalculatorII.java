package com.rainhu;

/**
 * 227. Basic Calculator II
 * 
 * Given a string s which represents an expression,
 * evaluate this expression and return its value.
 * 
 * The integer division should truncate toward zero.
 * 
 * You may assume that the given expression is always valid.
 * All intermediate results will be in the range of [-2^31, 2^31-1].
 * 
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions,
 * such as eval()
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/26
 * @apiNote
 */
public class n227_BasicCalculatorII{
    public int calculate(String s) {
        if (s==null | s.isEmpty())
            return 0;
        int len = s.length();
        int curr = 0;
        int last = 0;
        int res = 0;
        
        char sign = '+';

        for (int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if (Character.isDigit(ch))
                curr = curr * 10 + (ch - '0');
            if (!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == len - 1){
                if (sign == '+' || sign == '-'){
                    res += last;
                    last = (sign == '+') ? curr : -curr;
                } else if (sign == '*'){
                    last = last * curr;
                } else if (sign == '/'){
                    last = last / curr;
                }
                sign = ch;
                curr = 0;
            }
        }
        res += last;
        return res;
    }

    public static void main(String[] args){
        n227_BasicCalculatorII clz = new n227_BasicCalculatorII();
        int res = clz.calculate("3+2*2");
        System.out.println(res);
    }
}