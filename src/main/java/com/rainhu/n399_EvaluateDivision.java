package com.rainhu;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * 399. Evaluate Division (Medium)
 *
 * You are given an array of variable pairs equations and an array of real numbers values,
 * where equations[i] = [Ai, Bi] and values[i] represent the equation Ai/Bi = values[i].
 * Each Ai or Bi is a string that represents a single variables.
 *
 * You are also given some queries,
 * where queries[j] = [Cj, Dj] represents the jth query where you must find the answer for Cj/Dj = ?.
 *
 * Return the answers to all queries. If a single answer cannot be determined, return -1.0.
 *
 * Note: The input is always valid. You may assume that evaluating the queries will not result in division by zero and that
 *       there is no contradiction.
 *
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/30
 * @apiNote: backtracking
 */

public class n399_EvaluateDivision{
    Map<String, Map<String, Double>> map = new HashMap<>();
    double[] res;
    Map<String, Boolean> used = new HashMap<>();
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries){
        res = new double[queries.size()];
        for (int i = 0; i < equations.size(); i++){
            List<String> eq = equations.get(i);
            if (!map.containsKey(eq.get(0))){
                Map<String, Double> tmp = new HashMap<>();
                tmp.put(eq.get(1), values[i]);
                map.put(eq.get(0), tmp);
                used.put(eq.get(0), false);
            } else {
                map.get(eq.get(0)).put(eq.get(1), values[i]);
                used.put(eq.get(0), false);
            }
            if (!map.containsKey(eq.get(1))){
                Map<String, Double> tmp = new HashMap<>();
                tmp.put(eq.get(0), 1/values[i]);
                map.put(eq.get(1), tmp);
                used.put(eq.get(1), false);
            } else {
                map.get(eq.get(1)).put(eq.get(0), 1/values[i]);
                used.put(eq.get(1), false);
            }
        }
        
        for (int i = 0; i < queries.size(); i++){
            List<String> q = queries.get(i);
            double ans;
            if (map.containsKey(q.get(0))){
                String q0 = q.get(0);
                String q1 = q.get(1);
                res[i] = (ans = find(q0, q1)) == 0 ? -1 : ans;
            } else
                res[i] = -1;
        }

        return res;
    }

    public double find(String parent, String target){
        if (parent.equals(target)) return 1;
        if (!map.containsKey(target)) return 0;
        Map<String, Double> m = map.get(parent);
        if (m.containsKey(target)){
            return m.get(target);
        } else {
            for (Map.Entry<String, Double> e : m.entrySet()){
                if (used.get(e.getKey())) continue;
                used.put(parent, true);
                double toFind = e.getValue() * find(e.getKey(), target);
                used.put(parent, false);
                if (toFind != 0) return toFind;
                
            }
        }
        return 0.0;
    }
}
