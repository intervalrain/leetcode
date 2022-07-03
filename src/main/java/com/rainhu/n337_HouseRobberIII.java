package com.rainhu;

import java.util.HashMap;
import java.util.Map;

import com.rainhu.util.TreeNode;

/**
 * 337. House Robber III (Medium)
 * 
 * The thief has found himself a new place for his thievery again.
 * There is only one entrance to this area, called root.
 * 
 * Besides the root, each house has one and only one parent house.
 * After a tour, the smart thief realized that all houses in this place from a binary tree.
 * It will automatically contact the police if two directly-likned houses were broken into on the same night.
 * 
 * Given the root of the binary tree, return the maximum anmount of money the thief can rob without alerting the police.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2021/12/5
 * @apiNote: 
 */

public class n337_HouseRobberIII{
    public int rob(TreeNode root){
        return robSub(root, new HashMap<>());
    } 

    private int robSub(TreeNode root, Map<TreeNode, Integer> map){
        if (root == null) return 0;
        if (map.containsKey(root)) return map.get(root);

        int val = 0;

        if (root.left != null){
            val += robSub(root.left.left, map) + robSub(root.left.right, map);
        }

        if (root.right != null){
            val += robSub(root.right.left, map) + robSub(root.right.right, map);
        }

        val = Math.max(val + root.val, robSub(root.left, map) + robSub(root.right, map));
        map.put(root, val);

        return val;
    }
}