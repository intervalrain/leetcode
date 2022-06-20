package com.rainhu;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * You are given an array of strings products and a string searchWord.
 * 
 * Design a system that suggests at most three product names from products after each character of searchWord is typed.
 * Suggested products should have common prefix with searchWord.
 * If there are more than three products with a common prefix return the three lexicographically minimums products.
 * 
 * Return a list of lists of the suggested products after each character of searchWord is typed.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/6/20
 * @apiNote: 
 */

public class n1268_SearchSuggestionsSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        int[] ra = {0, products.length};
        for(int i = 0; i < searchWord.length(); i++) {
            suggestion(products, searchWord, ra, i);
        }
        return result;
    }
    private List<List<String>> result = new ArrayList<>();
    private void suggestion(String[] products, String searchWord, int[] ra, int j) {
        List<String> cur = new ArrayList<>();
        int newStart = -1, k = ra[0];
        for(; k < ra[1]; k++) {
            if (j < products[k].length() && products[k].charAt(j) == searchWord.charAt(j)) {
                if (newStart == -1) newStart = k;
                if (cur.size() < 3) {
                    cur.add(products[k]);
                }
            } else {
                if (newStart != -1) break;
            }
        }
        result.add(cur);
        if(newStart == -1) newStart = k;
        ra[0] = newStart;
        ra[1] = k;
    }
}
