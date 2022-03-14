package com.rainhu;

import java.util.LinkedList;

/**
 * 71. Simplify Path (Medium)
 * 
 * Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unic-style file system,
 * convert it to the simplified canonical path.
 * 
 * In a Unix-style file system, a period '.' refers to the current directory,
 * a double period '..' refers to the directory up a level,
 * and any multiple consecutive slashes (i,e, '//') are treated as a single slash '/'.
 * For this problem, any other format of periods such as '...' are treated as file/directory names.
 * 
 * The canonical path should have the following format:
 *   + The path starts sith a single slash '/'.
 *   + Any two directories are separated by a single slash '/'.
 *   + The path does not end with a trailing '/'.
 *   + The path only contains the directories on the path from the root directory to the target file or directory (i,e, no period '.' or double period)
 * 
 * Return the simplified canonical path.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/3/15
 * @apiNote: Stack
 */

public class n71_SimplifyPath {
    public String simplifyPath(String path){
        String[] tmpStr = path.split("/");
        LinkedList<String> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append('/');

        for (int i = 0; i < tmpStr.length; i++){
            if ("..".equals(tmpStr[i])){
                if (!stack.isEmpty()) stack.removeLast();
            } else if (".".equals(tmpStr[i])){
                continue;
            } else if ("".equals(tmpStr[i])){
                continue;
            } else {
                stack.add(tmpStr[i]);
            }
        }
        while (!stack.isEmpty()){
            sb.append(stack.poll());
            sb.append('/');
        }
        return sb.length() == 1 ? sb.toString() : sb.substring(0, sb.length()-1);
    }
}
