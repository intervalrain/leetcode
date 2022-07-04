package com.rainhu;

import java.util.Arrays;

import com.rainhu.util.Snippet;

/**
 * 135. Candy (Hard)
 * 
 * There are n children standing in a line.
 * Each child is assigned a rating value given in the integer array ratings.
 * 
 * You are giving candies to these children subjected to the following requirements:
 *      + Each child must have at least one candy.
 *      + Children with a higher rating get more candies than their neighbors.
 * 
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 * 
 * @author: Rain Hu
 * @version: 2
 * @since: 2022/7/5
 * @apiNote: 
 */

public class n135_Candy {

    public int candy(int[] ratings){
        int[] res = new int[ratings.length];
        Arrays.fill(res, 1);
        for (int i = 1; i < ratings.length; i++){
            res[i] = ratings[i] > ratings[i-1] ? res[i-1] + 1 : 1;
        }
        for (int i = ratings.length - 2; i >= 0; i--){
            res[i] = ratings[i] > ratings[i+1] ? Math.max(res[i], res[i+1] + 1) : res[i];
        }
        int sum = 0;
        for (int num : res) sum += num;
        return sum;
    }

    public int[] candies(int[] ratings){
        int[] res = new int[ratings.length];
        Arrays.fill(res, 1);
        for (int i = 1; i < ratings.length; i++){
            res[i] = ratings[i] > ratings[i-1] ? res[i-1] + 1 : 1;
        }
        for (int i = ratings.length - 2; i > 0; i--){
            res[i] = ratings[i] > ratings[i+1] ? Math.max(res[i], res[i+1] + 1) : res[i];
        }
        return res;
    }

    public static void main(String[] args){
        int[] ratings = Snippet.stringToIntegerArray("[1,3,4,6,9,7,2,5,5,4]");
        n135_Candy clz = new n135_Candy();
        int[] res = clz.candies(ratings);
        System.out.println(Arrays.toString(res));
    }
    // 1 3 4 6 9 7 2 5 5 4
    // 1 2 3 4 5 1 1 2 1 1
    // 1 2 3 4 5 2 1 2 2 1

    // 1 2 3 4 5 2 1 2 2 1
    public int candy2(int[] ratings){
        if (ratings.length == 1) return 1;
        int[] res = new int[ratings.length];
        for (int i = 0; i < res.length; i++){
            fill(ratings, res, i);
        }
        int sum = 0;
        for (int i = 0; i < ratings.length; i++){
            sum += res[i];
        }
        return sum;
    }
    public int fill(int[] ratings, int[] res, int i){
        if (i < 0 || i >= res.length){
            return 0;
        }
        if (res[i] != 0) return res[i];
        if (i == 0){
            if (ratings[i] <= ratings[i+1]){
                res[i] = 1;
            } else {
                fill(ratings, res, i+1);
                res[i] = res[i+1] + 1;
            }
        } else if (i == res.length-1){
            if (ratings[i] <= ratings[i-1]){
                res[i] = 1;
            } else {
                fill(ratings, res, i-1);
                res[i] = res[i-1] + 1;
            }
        } else {
            if (ratings[i] <= ratings[i-1] && ratings[i] <= ratings[i+1]){
                res[i] = 1;
            } else if (ratings[i] > ratings[i+1] && ratings[i] <= ratings[i-1]){
                res[i] = fill(ratings, res, i+1) + 1;
            } else if (ratings[i] > ratings[i-1] && ratings[i] <= ratings[i+1]){
                res[i] = fill(ratings, res, i-1) + 1;
            } else {
                res[i] = Math.max(fill(ratings, res, i-1), fill(ratings, res, i+1)) + 1;
            }
        }
        return res[i];
    }
}
