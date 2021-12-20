package com.rainhu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 952. Largest Component Size by common Factor
 * 
 * You are given an integer array of unique positive integers nums. 
 * Consider the following graph:
 *     There are nums.length nodes, 
 *     labeled nums[0] to nums[nums.length - 1],
 *     There is an undirected edge between nums[i] and nums[j] if nums[i] and nums[j] share a common factor greater than 1.
 * Return the size of the largest connected component in the graph.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/11/24
 * @apiNote: 
 */

public class n952_LargestComponentSizeByCommonFactor {
    
    public int largestComponentSize(int[] nums) {
        int ans = 0;
        int max = nums[0];
        for (int n : nums) {
            max = Math.max(max, n);
        }
        int[] spf = new int[max + 1];
        for (int i = 1; i <= max; i++) {
            spf[i] = i;
        }
        populateSpf(spf);
        UnionFind uf = new UnionFind(max);
        for (int n : nums) {
            for (int pf : getPrimeFactors(spf, n)) {
                uf.union(n, pf);
            }
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            int parent = uf.findParent(n);
            int curr = countMap.getOrDefault(parent, 0);
            ans = Math.max(ans, curr + 1);
            countMap.put(parent, curr + 1);
        }
        return ans;
    }
    
    private Set<Integer> getPrimeFactors(int[] spf, int n) {
        Set<Integer> primeFactors = new HashSet<>();
        while (n != 1) {
            primeFactors.add(spf[n]);
            n /= spf[n];
        }
        return primeFactors;
    }
    
    private void populateSpf(int[] spf) {
        int max = spf.length - 1;
        for (int i = 2; i*i <= max; i++) {
            if (spf[i] < i) {
                continue;
            }
            for (int j = i + i; j <= max; j += i) {
                if (spf[j] > i) {
                    spf[j] = i;
                }
            }
        }
    }
    
    public static class UnionFind {
        private int[] parents;
        private int[] ranks;
        
        public UnionFind(int n) {
            this.parents = new int[n + 1];
            this.ranks = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                this.parents[i] = i;
                this.ranks[i] = 1;
            }
        }
        
        public int findParent(int x) {
            if (parents[x] != x) {
                parents[x] = findParent(parents[x]);
            }
            return parents[x];
        }
        
        public void union(int x, int y) {
            int parentX = findParent(x);
            int parentY = findParent(y);
            if (parentX == parentY) {
                return;
            }
            if (ranks[parentX] >= ranks[parentY]) {
                parents[parentY] = parentX;
                ranks[parentX] += ranks[parentY];
            } else {
                parents[parentX] = parentY;
                ranks[parentY] += ranks[parentX];
            }
        }
    }
}
