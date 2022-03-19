package com.rainhu;

/**
 * 316. Given a string s, return duplicate letters so that every letter appears once and only once.
 * You must make sure your result is the smallest in lexicographical order among all possible results
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/19
 * @apiNote: Stack
 */

public class n316_RemoveDuplicateLetters {
    class StringBuilderStack {
        StringBuilder sb;
        public StringBuilderStack() {
            sb = new StringBuilder();
        }

        public StringBuilderStack(String s){
            sb = new StringBuilder();
            sb.append(s);
        }

        public StringBuilderStack(char[] s){
            sb = new StringBuilder();
            sb.append(s);
        }

        public StringBuilderStack(char s){
            sb = new StringBuilder();
            sb.append(s);
        }

        public char pop(){
            return popAt(sb.length() - 1);
        }

        public char pull(){
            return popAt(0);
        }

        public char popAt(int index) throws IllegalArgumentException{
            if (index < 0 || index >= sb.length()) throw new IllegalArgumentException();
            char ch = sb.charAt(index);
            sb.deleteCharAt(index);
            return ch;
        }

        public char peek(){
            return sb.charAt(sb.length() - 1);
        }

        public void push(char ch){
            sb.append(ch);
        }

        public boolean isEmpty(){
            return sb.length() == 0;
        }

        public String toString(){
            return sb.toString();
        }
    }

    public String removeDuplicateLetters(String s){

        char[] ch = s.toCharArray();
        int[] cnt = new int[26];
        for (char c : ch){
            cnt[c - 'a']++;
        }

        boolean[] visited = new boolean[26];
        StringBuilderStack sb = new StringBuilderStack();
        for (char c : ch) {
            cnt[c - 'a']--;

            if (visited[c - 'a']) continue;
            while (!sb.isEmpty() && sb.peek() > c && cnt[sb.peek() - 'a'] > 0){
                visited[sb.peek() - 'a'] = false;
                sb.pop();
            }
            sb.push(c);
            visited[c - 'a'] = true;
        }
        return sb.toString();
    }
}
