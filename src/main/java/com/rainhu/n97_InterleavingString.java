package com.rainhu;

/**
 * 97. Interleaving String (Medium)
 * 
 * Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
 * 
 * An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:
 *      + s = s1 + s2 + ... + sn
 *      + t = t1 + t2 + ... + tm
 *      + |n - m| <= 1
 *      + The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
 * 
 * Note: a + b is the concatenation of strings a and b.
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/7/7
 * @apiNote: dynamic programming
 */

public class n97_InterleavingString {

    char[] c1;
    char[] c2;
    char[] c3;
    int m, n;
    boolean[][] dp;

    public boolean isInterleave(String s1, String s2, String s3){
        
        c1 = s1.toCharArray();
        c2 = s2.toCharArray();
        c3 = s3.toCharArray();
        m = c1.length;
        n = c2.length;

        if (s3.length() != m + n){
            return false;
        }

        dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        run(0, 1, 1 ,'D');
        run(1, 0, 1 ,'R');

        return dp[m][n];

    }

    public void run(int i, int j, int k, char dir){
        if (i > m || j > n) return;
        if (dp[i][j]) return;
        if ((i == 0 && c2[j-1] == c3[k-1]) ||
            (j == 0 && c1[i-1] == c3[k-1]) ||
            (i > 0 && j > 0 && ((c1[i-1] == c3[k-1] && dir == 'R') || (c2[j-1] == c3[k-1] && dir == 'D'))) 
        ){
            dp[i][j] = true;
            run(i+1, j, k+1, 'R');
            run(i, j+1, k+1, 'D');
        }
    }


    public boolean isInterleave2(String s1, String s2, String s3){
        
        int m = s1.length();
        int n = s2.length();
        if (s3.length() != m + n){
            return false;
        }

        boolean[][] map = new boolean[m+1][n+1];
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        char[] c = s3.toCharArray();

        for (int i = 0; i <= m; i++){
            for (int j = 0; j <= n; j++){
                if (i == 0 && j == 0){
                    map[i][j] = true;
                } else if (i == 0){
                    map[i][j] = (map[i][j-1] && b[j-1] == c[i+j-1]);
                } else if (j == 0){
                    map[i][j] = (map[i-1][j] && a[i-1] == c[i+j-1]);
                } else {
                    map[i][j] = (map[i-1][j] && a[i-1] == c[i+j-1]) || (map[i][j-1] && b[j-1] == c[i+j-1]);
                }
            }
        }

        return map[m][n];

    }
}
