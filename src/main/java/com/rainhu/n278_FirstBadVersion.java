package com.rainhu;

/**
 * 278. First Bad Version (Easy)
 * 
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version,
 * all the versions after a bad version are also bad.
 * 
 * Suppose you have n versions [1, 2, ... , n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 * 
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version.
 * You should minimize the number of calls to the API.
 */

public class n278_FirstBadVersion {
    public static class VersionControl{
        boolean[] version;
        public VersionControl(int n, int bad){
            version = new boolean[n];
            for (int i=0; i<n; i++){
                version[i] = (i+1 >= bad);
            }
        }

        public boolean isBadVersion(int n){
            return version[n-1];
        }
    }
    public int firstBadVersion(int n){
        
        return 1;

    }
}
